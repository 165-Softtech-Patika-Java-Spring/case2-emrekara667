package com.homework2.app.service;


import com.homework2.app.converter.AddressMapper;
import com.homework2.app.dto.NeighborhoodDto;
import com.homework2.app.dto.NeighborhoodSaveRequestDto;
import com.homework2.app.dto.NeighborhoodUpdateRequestDto;
import com.homework2.app.entity.Neighborhood;
import com.homework2.app.enums.ErrorMessage;
import com.homework2.app.gen.exceptions.ItemNotFoundException;
import com.homework2.app.service.neighborhoodservice.NeigborhoodEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

@Service
@RequiredArgsConstructor
public class NeighborhoodService {


    private final NeigborhoodEntityService neigborhoodEntityService;

    public NeighborhoodDto save(NeighborhoodSaveRequestDto neighborhoodSaveRequestDto) {


        Neighborhood neighborhood = AddressMapper.INSTANCE.convertToNeighborhood(neighborhoodSaveRequestDto);

        neighborhood = neigborhoodEntityService.save(neighborhood);

        NeighborhoodDto neighborhoodDto = AddressMapper.INSTANCE.convertToNeighborhoodDto(neighborhood);

        return neighborhoodDto;

    }

    public NeighborhoodDto update(NeighborhoodUpdateRequestDto neighborhoodUpdateRequestDto) {
        controlIsNeighborhoodExist(neighborhoodUpdateRequestDto);

        Neighborhood neighborhood;
        neighborhood = AddressMapper.INSTANCE.convertToNeighborhood(neighborhoodUpdateRequestDto);
        neigborhoodEntityService.save(neighborhood);

        NeighborhoodDto neighborhoodDto = AddressMapper.INSTANCE.convertToNeighborhoodDto(neighborhood);

        return neighborhoodDto;


    }

    public void controlIsNeighborhoodExist(NeighborhoodUpdateRequestDto neighborhoodUpdateRequestDto) {
        Long id = neighborhoodUpdateRequestDto.getId();

        boolean isExist = neigborhoodEntityService.existsById(id);
        if(!isExist){
            throw new ItemNotFoundException(ErrorMessage.ADDRESS_ERROR_MESSAGE);
        }
    }
}
