package com.homework2.app.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "STREET")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Street implements Serializable {

    @SequenceGenerator(name="street" , sequenceName = "STREET_ID_SEQ")
    @Id
    @GeneratedValue(generator = "street" , strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Column(name="STREET_NAME", length = 100)
    private String streetName;

    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private Neighborhood neighborhood;

    @OneToOne(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "ADRESS_ID",referencedColumnName = "id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Address address;

}
