package com.example.examspringframework.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vehicleId;

    @NotBlank(message = "Vehicle name is mandatory")
    private String vehicleName;

    @NotBlank(message = "Vehicle model is mandatory")
    private String vehicleModel;

    @NotNull(message = "Year of manufacture is mandatory")
    private Integer yearOfManufacture;

    private String vehicleColor;

    public Vehicle() {
    }

    public void setVehicleId(Integer id) {
    }

    // Getters and setters
}
