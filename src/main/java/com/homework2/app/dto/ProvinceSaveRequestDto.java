package com.homework2.app.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.homework2.app.entity.Country;
import lombok.Data;

@Data
public class ProvinceSaveRequestDto {
    private Long id;
    private String provinceName;
    private Long plateCode;
    private Country country;
}
