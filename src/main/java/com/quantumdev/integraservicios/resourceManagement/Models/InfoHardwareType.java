package com.quantumdev.integraservicios.resourceManagement.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HardwareType")
public class InfoHardwareType {

    @Id
    private String name_hardwareType;

    private String desc_hardwareType;

    public InfoHardwareType() {
    }

    public String getName_hardwareType() {
        return name_hardwareType;
    }

    public void setName_hardwareType(String name_hardwareType) {
        this.name_hardwareType = name_hardwareType;
    }

    public String getDesc_hardwareType() {
        return desc_hardwareType;
    }

    public void setDesc_hardwareType(String desc_hardwareType) {
        this.desc_hardwareType = desc_hardwareType;
    }
}