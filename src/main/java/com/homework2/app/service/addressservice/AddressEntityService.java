package com.homework2.app.service.addressservice;

import com.homework2.app.dao.AddressDao;
import com.homework2.app.entity.Address;
import com.homework2.app.enums.ErrorMessage;
import com.homework2.app.gen.exceptions.ItemNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.crypto.spec.OAEPParameterSpec;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;

@Service
@RequiredArgsConstructor
public class AddressEntityService {

    private final AddressDao addressDao;

    public List<Address> findAll() {
        return addressDao.findAll();
    }

    public Address save(Address address) {
       return addressDao.save(address);
    }

    public Address getByIdWithControl(Long id) {

        Optional<Address> addressOptional = findById(id);

        Address address;
        if(addressOptional.isPresent()){
            address = addressOptional.get();
        }else{
            throw new ItemNotFoundException(ErrorMessage.ADDRESS_ERROR_MESSAGE);
        }
        return address;

    }

    public Optional<Address> findById(Long id) {
        return addressDao.findById(id);
    }

    public void delete(Address address) {
        addressDao.delete(address);
    }
}
