package com.homework2.app.controller;


import com.homework2.app.dto.*;
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

    @GetMapping
    public ResponseEntity findAll(){
        List<AddressDto> addressDtoList = addressService.findAll();
        return ResponseEntity.ok(addressDtoList);
    }

    @PostMapping
    public ResponseEntity save(@RequestBody AddressSaveRequestDto addressSaveRequestDto){

        AddressDto addressDto = addressService.save(addressSaveRequestDto);

        return ResponseEntity.ok(addressDto);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity deleteAddress(@PathVariable Long id){
        addressService.delete(id);
        return ResponseEntity.ok(Void.TYPE);
    }

    @GetMapping("/find_address/{id}")
    public ResponseEntity findById(@PathVariable Long id){
        AddressDto addressDto = addressService.findById(id);

        return ResponseEntity.ok(addressDto);
    }


    @PostMapping("/country")
    public ResponseEntity saveCountry(@RequestBody CountrySaveRequestDto countrySaveRequestDto){
        CountryDto countryDto = countryService.save(countrySaveRequestDto);

        return ResponseEntity.ok(countryDto);
    }

    @GetMapping("/{country_code}")
    public ResponseEntity findByCountryCode(@PathVariable Long country_code){

        CountryDto countryDto = countryService.findByCountryCode(country_code);

        return ResponseEntity.ok(countryDto);

    }

    @GetMapping("/country_list")
    public ResponseEntity findAllCountry(){
        List<CountryDto> countryDtoList = countryService.findAll();

        return ResponseEntity.ok(countryDtoList);
    }

    @PostMapping("/province")
    public ResponseEntity saveProvince(@RequestBody ProvinceSaveRequestDto provinceSaveRequestDto){

        ProvinceDto provinceDto = provinceService.save(provinceSaveRequestDto);

        return ResponseEntity.ok(provinceDto);
    }

    @GetMapping("/province/{plateCode}")
    public ResponseEntity findByPlateCode(@PathVariable Long plateCode){
        List<ProvinceDto> provinceDtoList = provinceService.findByPlateCode(plateCode);

        return ResponseEntity.ok(provinceDtoList);
    }

    @GetMapping("/province_list")
    public ResponseEntity findAllProvince() {
        List<ProvinceDto> provinceDtoList = provinceService.findAll();
        return ResponseEntity.ok(provinceDtoList);
    }


    @PostMapping("/town")
    public ResponseEntity saveTown(@RequestBody TownSaveRequestDto townSaveRequestDto){
       TownDto townDto =  townService.save(townSaveRequestDto);

       return ResponseEntity.ok(townDto);
    }

    @PostMapping("/neighborhood")
    public ResponseEntity saveNeighborhood(@RequestBody NeighborhoodSaveRequestDto neighborhoodSaveRequestDto){

        NeighborhoodDto neighborhoodDto = neighborhoodService.save(neighborhoodSaveRequestDto);

        return ResponseEntity.ok(neighborhoodDto);
    }

    @PutMapping("/neighborhood")
    public ResponseEntity update(@RequestBody NeighborhoodUpdateRequestDto neighborhoodUpdateRequestDto){
        NeighborhoodDto neighborhoodDto = neighborhoodService.update(neighborhoodUpdateRequestDto);

        return ResponseEntity.ok(neighborhoodDto);
    }

    @PostMapping("/street")
    public ResponseEntity saveStreet(@RequestBody StreetSaveRequestDto streetSaveRequestDto){
        StreetDto streetDto = streetService.save(streetSaveRequestDto);

        return ResponseEntity.ok(streetDto);
    }













}
