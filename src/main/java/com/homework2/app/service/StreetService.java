package com.homework2.app.service;

import com.homework2.app.converter.AddressMapper;
import com.homework2.app.dto.StreetDto;
import com.homework2.app.dto.StreetSaveRequestDto;
import com.homework2.app.entity.Street;
import com.homework2.app.service.streetservice.StreetEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Service
@RequiredArgsConstructor
public class StreetService {

    private final StreetEntityService streetEntityService;


    public StreetDto save(StreetSaveRequestDto streetSaveRequestDto) {
        Street street = AddressMapper.INSTANCE.convertToStreet(streetSaveRequestDto);

        street = streetEntityService.save(street);

        StreetDto streetDto = AddressMapper.INSTANCE.convertToStreetDto(street);

        return streetDto;
    }
}
