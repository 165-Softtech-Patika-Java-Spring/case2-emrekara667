package com.homework2.app.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.homework2.app.entity.Country;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Data
public class ProvinceDto {

    private Long id;
    private String provinceName;
    private Long plateCode;
    private Country country;


}
