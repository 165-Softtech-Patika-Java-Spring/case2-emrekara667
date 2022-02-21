package com.homework2.app.dto;

import com.homework2.app.entity.Province;
import lombok.Data;

@Data
public class TownSaveRequestDto {

    private String townName;
    private Province province;
}
