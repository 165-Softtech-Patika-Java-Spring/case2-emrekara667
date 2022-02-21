package com.homework2.app.dto;

import com.homework2.app.entity.Country;
import com.homework2.app.entity.Street;
import lombok.Data;

@Data
public class AddressDto {

    private Long id;
    private String addressName;
    private Long doorNumber;
    private Long apartmentNumber;
    private Street street;

}
