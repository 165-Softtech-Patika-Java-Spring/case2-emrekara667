package com.homework2.app.entity;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;


import javax.persistence.*;

@Entity
@Table(name = "PROVINCE")
@Data
@JsonIgnoreProperties(value = {"handler","hibernateLazyInitializer","FieldHandler"})
public class Province {

    @SequenceGenerator(name="province" , sequenceName = "PROVINCE_ID_SEQ")
    @Id
    @GeneratedValue(generator = "provınce" , strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Column(name="PROVINCE_NAME", length = 100)
    private String provinceName;

    @Column(name = "PLATE_CODE", length = 10)
    private Long plateCode;

    @ManyToOne(
            cascade = CascadeType.MERGE,
            fetch = FetchType.LAZY
    )
    private Country country;

}
