package com.homework2.app.entity;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "COUNTRY")
@Data
public class Country {

    @SequenceGenerator(name = "country", sequenceName = "COUNTRY_ID_SEQ")
    @Id
    @GeneratedValue(generator = "country" , strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long countryCode;

    @Column(name = "COUNTRY_NAME", length = 100)
    private String countryName;

 //   @Column(name = "COUNTRY_CODE", length = 100)
   // private String countryCode;

}
