package com.homework2.app.controller;


import com.homework2.app.dto.*;
import com.homework2.app.entity.Province;
import com.homework2.app.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/address")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;
    private final CountryService countryService;
    private final ProvinceService provinceService;
    private final TownService townService;
    private final NeighborhoodService neighborhoodService;
    private final StreetService streetService;


    //This function lists all addresses
    @GetMapping
    public ResponseEntity findAll(){
        List<AddressDto> addressDtoList = addressService.findAll();
        return ResponseEntity.ok(addressDtoList);
    }

    //This function saves address
    @PostMapping
    public ResponseEntity save(@RequestBody AddressSaveRequestDto addressSaveRequestDto){

        AddressDto addressDto = addressService.save(addressSaveRequestDto);

        return ResponseEntity.ok(addressDto);
    }

    //This function deletes the address with the specified id
    @DeleteMapping("/{id}")
    public ResponseEntity deleteAddress(@PathVariable Long id){
        addressService.delete(id);
        return ResponseEntity.ok(Void.TYPE);
    }

    //This function returns the address with the specified id
    @GetMapping("/find_address/{id}")
    public ResponseEntity findById(@PathVariable Long id){
        AddressDto addressDto = addressService.findById(id);

        return ResponseEntity.ok(addressDto);
    }


    //This function registers the country.
    @PostMapping("/country")
    public ResponseEntity saveCountry(@RequestBody CountrySaveRequestDto countrySaveRequestDto){
        CountryDto countryDto = countryService.save(countrySaveRequestDto);

        return ResponseEntity.ok(countryDto);
    }

    //this function finds the country by country code.
    @GetMapping("/{country_code}")
    public ResponseEntity findByCountryCode(@PathVariable Long country_code){

        CountryDto countryDto = countryService.findByCountryCode(country_code);

        return ResponseEntity.ok(countryDto);

    }

    //This function lists all countries
    @GetMapping("/country_list")
    public ResponseEntity findAllCountry(){
        List<CountryDto> countryDtoList = countryService.findAll();

        return ResponseEntity.ok(countryDtoList);
    }

    //This function registers the province
    @PostMapping("/province")
    public ResponseEntity saveProvince(@RequestBody ProvinceSaveRequestDto provinceSaveRequestDto){

        ProvinceDto provinceDto = provinceService.save(provinceSaveRequestDto);

        return ResponseEntity.ok(provinceDto);
    }

    //This function lists the provinces by plate code.
    @GetMapping("/province/{plateCode}")
    public ResponseEntity findByPlateCode(@PathVariable Long plateCode){
        List<ProvinceDto> provinceDtoList = provinceService.findByPlateCode(plateCode);

        return ResponseEntity.ok(provinceDtoList);
    }

    //This function lists all provinces
    @GetMapping("/province_list")
    public ResponseEntity findAllProvince() {
        List<ProvinceDto> provinceDtoList = provinceService.findAll();
        return ResponseEntity.ok(provinceDtoList);
    }


    //This function registers the town.
    @PostMapping("/town")
    public ResponseEntity saveTown(@RequestBody TownSaveRequestDto townSaveRequestDto){
       TownDto townDto =  townService.save(townSaveRequestDto);

       return ResponseEntity.ok(townDto);
    }

    //This function registers the neighborhood
    @PostMapping("/neighborhood")
    public ResponseEntity saveNeighborhood(@RequestBody NeighborhoodSaveRequestDto neighborhoodSaveRequestDto){

        NeighborhoodDto neighborhoodDto = neighborhoodService.save(neighborhoodSaveRequestDto);

        return ResponseEntity.ok(neighborhoodDto);
    }

    //This function updates the neighborhood information
    @PutMapping("/neighborhood")
    public ResponseEntity update(@RequestBody NeighborhoodUpdateRequestDto neighborhoodUpdateRequestDto){
        NeighborhoodDto neighborhoodDto = neighborhoodService.update(neighborhoodUpdateRequestDto);

        return ResponseEntity.ok(neighborhoodDto);
    }

    //This function registers street information
    @PostMapping("/street")
    public ResponseEntity saveStreet(@RequestBody StreetSaveRequestDto streetSaveRequestDto){
        StreetDto streetDto = streetService.save(streetSaveRequestDto);

        return ResponseEntity.ok(streetDto);
    }




}
