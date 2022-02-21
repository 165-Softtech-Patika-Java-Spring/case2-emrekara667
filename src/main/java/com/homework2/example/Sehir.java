package com.homework2.example;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "SEHIR")
@Data
public class Sehir {

    @SequenceGenerator(name = "sehir",sequenceName = "SEHIR_ID_SEQ")
    @Id
    @GeneratedValue(generator = "sehir", strategy = GenerationType.SEQUENCE)
    public Long id;

    @Column(name = "ADI" , length = 100)
    private String adi;

    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            optional = false
    )
    private Ulke ulke;

}
