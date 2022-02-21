package com.homework2.app.service;

import com.homework2.app.converter.AddressMapper;
import com.homework2.app.dto.TownDto;
import com.homework2.app.dto.TownSaveRequestDto;
import com.homework2.app.entity.Town;
import com.homework2.app.service.townservice.TownEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TownService {

    private final TownEntityService townEntityService;

    public TownDto save(TownSaveRequestDto townSaveRequestDto) {
        Town town = AddressMapper.INSTANCE.convertToTown(townSaveRequestDto);

        town = townEntityService.save(town);

        TownDto townDto = AddressMapper.INSTANCE.convertToTownDto(town);

        return townDto;
    }
}
