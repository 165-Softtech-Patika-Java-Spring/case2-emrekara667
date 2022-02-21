package com.homework2.app.service;

import com.homework2.app.converter.AddressMapper;
import com.homework2.app.dto.AddressDto;
import com.homework2.app.dto.AddressSaveRequestDto;
import com.homework2.app.entity.Address;
import com.homework2.app.service.addressservice.AddressEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressService {

    private final AddressEntityService addressEntityService;

    public List<AddressDto> findAll() {
        List<Address> addressList = addressEntityService.findAll();

        List<AddressDto> addressDtoList = AddressMapper.INSTANCE.convertToAddressDtoList(addressList);

        return addressDtoList;
    }

    public AddressDto save(AddressSaveRequestDto addressSaveRequestDto) {
        Address address = AddressMapper.INSTANCE.convertToAddress(addressSaveRequestDto);

        address = addressEntityService.save(address);

        AddressDto addressDto = AddressMapper.INSTANCE.convertToAddressDto(address);

        return addressDto;
    }

    public void delete(Long id) {
        Address address = addressEntityService.getByIdWithControl(id);

        addressEntityService.delete(address);

    }

    public AddressDto findById(Long id) {
        Address address = addressEntityService.getByIdWithControl(id);

        AddressDto addressDto = AddressMapper.INSTANCE.convertToAddressDto(address);

        return addressDto;
    }
}
