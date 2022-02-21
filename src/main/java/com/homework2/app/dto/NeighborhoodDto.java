package com.homework2.app.dto;

import com.homework2.app.entity.Street;
import com.homework2.app.entity.Town;
import lombok.Data;

import javax.persistence.*;

@Data
public class NeighborhoodDto {


    private Long id;
    private String neighborhoodName;
    private Town town;


}
