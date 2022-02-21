package com.homework2.app.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.homework2.app.entity.Address;
import com.homework2.app.entity.Neighborhood;
import lombok.Data;

import javax.persistence.*;

@Data
public class StreetDto {

    private Long id;
    private String streetName;
    private Neighborhood neighborhood;
    private Address address;
}
