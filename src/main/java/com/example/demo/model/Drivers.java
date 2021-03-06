package com.example.demo.model;


import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name="transporters_drivers_table")
public class Drivers {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="driver_firstName",nullable = false,columnDefinition = "text")
    private String firstName;

    @Column(name="driver_PrivateNumber",nullable = false,columnDefinition = "text")
    private String privateNumber;

    @Column(name="driver_lastname",nullable = false,columnDefinition = "text")
    private String lastName;

    @Column(name="driver_birthDate",nullable = false,columnDefinition = "text")
    private String birthDate;

    @Column(name = "driver_active",nullable = false)
    private Boolean active;

}
