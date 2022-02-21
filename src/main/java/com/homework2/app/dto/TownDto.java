package com.homework2.app.dto;

import com.homework2.app.entity.Province;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Data
public class TownDto {

    private Long id;
    private String townName;
    private Province province;
}
