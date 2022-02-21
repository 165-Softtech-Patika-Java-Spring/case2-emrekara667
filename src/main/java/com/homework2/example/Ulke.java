package com.homework2.example;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ULKE")
@Data
public class Ulke {

    @SequenceGenerator(name = "ulke",sequenceName = "ULKE_ID_SEQ")
    @Id
    @GeneratedValue(generator = "ulke", strategy = GenerationType.SEQUENCE)
    public Long id;

    @Column(name = "ADI" , length = 100)
    private String adi;

}
