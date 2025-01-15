package com.employeeManagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Embeddable
public class Address {

    @NotBlank
    @Column(name = "street_address", nullable = false)
    private String streetAddress;

    @Column(name = "street_address2")
    private String streetAddress2;

    @NotBlank
    @Column(name = "city", nullable = false)
    private String city;

    @NotBlank
    @Column(name = "state", nullable = false)
    private String state;

    @NotBlank
    @Column(name = "postal_code", nullable = false)
    private String postalCode;

    @NotBlank
    @Column(name = "country", nullable = false)
    private String country;
} 