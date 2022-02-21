package com.homework2.app.service.countryservice;

import com.homework2.app.dao.CountryDao;
import com.homework2.app.entity.Country;
import com.homework2.app.enums.ErrorMessage;
import com.homework2.app.gen.exceptions.ItemNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CountryEntityService {

    private final CountryDao countryDao;

    public Country save(Country country){
        return countryDao.save(country);
    }

    public Country getByCountryCodeWithControl(Long country_code) {
        Optional<Country> countryOptional = findByCountryCode(country_code);

        Country country;
        if(countryOptional.isPresent()){
            country = countryOptional.get();
        } else{
            throw new ItemNotFoundException(ErrorMessage.ADDRESS_ERROR_MESSAGE);
        }
        return country;
    }

    public Optional<Country> findByCountryCode(Long country_code) {
        return countryDao.findById(country_code);
    }

    public List<Country> findAll() {
        return countryDao.findAll();
    }
}
