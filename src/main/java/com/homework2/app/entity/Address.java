package com.homework2.app.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "ADDRESS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @SequenceGenerator(name="address" , sequenceName = "ADDRESS_ID_SEQ")
    @Id
    @GeneratedValue(generator = "address" , strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Column(name="ADDRESS_NAME", length = 100)
    private String addressName;

    @Column(name="DOOR_NUMBER", length = 100)
    private Long doorNumber;

    @Column(name="APARTMENT_NUMBER", length = 100)
    private Long apartmentNumber;

    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "address"
    )
    private Street street;

}
