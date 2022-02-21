package com.homework2.app.dto;

import com.homework2.app.entity.Address;
import com.homework2.app.entity.Neighborhood;
import lombok.Data;

@Data
public class StreetSaveRequestDto {

    private Long id;
    private String streetName;
    private Neighborhood neighborhood;
    private Address address;

}
