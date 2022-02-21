package com.homework2.app.service;

import com.homework2.app.converter.AddressMapper;
import com.homework2.app.dto.ProvinceDto;
import com.homework2.app.dto.ProvinceSaveRequestDto;
import com.homework2.app.dto.TownDto;
import com.homework2.app.entity.Province;
import com.homework2.app.entity.Town;
import com.homework2.app.service.proninceentityservice.ProvinceEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProvinceService {

    private final ProvinceEntityService provinceEntityService;

    public ProvinceDto save(ProvinceSaveRequestDto provinceSaveRequestDto) {
        Province province = AddressMapper.INSTANCE.covertToProvince(provinceSaveRequestDto);

        province = provinceEntityService.save(province);

        ProvinceDto provinceDto = AddressMapper.INSTANCE.convertToProvinceDto(province);

        return provinceDto;
    }

    public List<ProvinceDto> findByPlateCode(Long plateCode) {
        List<Province> provinceList = provinceEntityService.getByPlateCode(plateCode);

        List<ProvinceDto> provinceDtoList = AddressMapper.INSTANCE.convertToProvinceDtoList(provinceList);

       return provinceDtoList;
    }

    public List<ProvinceDto> findAll() {

        List<Province> provinceList = provinceEntityService.findAll();

        List<ProvinceDto> provinceDtoList = AddressMapper.INSTANCE.convertToProvinceDtoList(provinceList);

        return provinceDtoList;
    }


}
