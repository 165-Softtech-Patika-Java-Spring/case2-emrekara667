package com.homework2.app.dto;

import com.homework2.app.entity.Town;
import lombok.Data;

@Data
public class NeighborhoodSaveRequestDto {

    private Long id;
    private String neighborhoodName;
    private Town town;
}
