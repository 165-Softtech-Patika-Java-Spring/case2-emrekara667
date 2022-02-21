package com.homework2.app.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TOWN")
@Data
@JsonIgnoreProperties(value = {"handler","hibernateLazyInitializer","FieldHandler"})
public class Town {

    @SequenceGenerator(name="town" , sequenceName = "TOWN_ID_SEQ")
    @Id
    @GeneratedValue(generator = "town" , strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Column(name="TOWN_NAME", length = 100)
    private String townName;

    @ManyToOne(
            cascade = CascadeType.MERGE,
            fetch = FetchType.LAZY
    )
    private Province province;
}
