package com.homework2.app.service;

import com.homework2.app.converter.AddressMapper;
import com.homework2.app.dto.CountryDto;
import com.homework2.app.dto.CountrySaveRequestDto;
import com.homework2.app.entity.Country;
import com.homework2.app.service.countryservice.CountryEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService {

    private final CountryEntityService countryEntityService;

    public CountryDto save(CountrySaveRequestDto countrySaveRequestDto){

        Country country = AddressMapper.INSTANCE.convertToCountry(countrySaveRequestDto);

        country = countryEntityService.save(country);

        CountryDto countryDto = AddressMapper.INSTANCE.convertToCountryDto(country);

        return countryDto;
    }

    public CountryDto findByCountryCode(Long country_code) {

        Country country = countryEntityService.getByCountryCodeWithControl(country_code);

        CountryDto countryDto = AddressMapper.INSTANCE.convertToCountryDto(country);

        return countryDto;
    }

    public List<CountryDto> findAll() {

        List<Country> countryList = countryEntityService.findAll();

        List<CountryDto> countryDtoList = AddressMapper.INSTANCE.convertToCountryDtoList(countryList);

        return countryDtoList;
    }
}
