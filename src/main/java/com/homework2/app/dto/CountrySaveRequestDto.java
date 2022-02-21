package com.homework2.app.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import javax.persistence.Column;

@Data
public class CountrySaveRequestDto {

    private Long countryCode;
    private String countryName;

}
