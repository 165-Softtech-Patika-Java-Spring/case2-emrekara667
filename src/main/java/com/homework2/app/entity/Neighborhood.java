package com.homework2.app.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "NEIGHBORHOOD")
@Data
public class Neighborhood {

    @SequenceGenerator(name="neighborhood" , sequenceName = "NEIGHBORHOOD_ID_SEQ")
    @Id
    @GeneratedValue(generator = "neighborhood" , strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Column(name="NEIGHBORHOOD_NAME", length = 100)
    private String neighborhoodName;

    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private Town town;
}
