package com.homework2.app.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

@Data
public class CountryDto {
    private Long countryCode;
    private String countryName;

}
