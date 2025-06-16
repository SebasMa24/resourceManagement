package com.quantumdev.integraservicios.resourceManagement.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "InfoSpacesType")
public class InfoSpacesType {

    @Id
    private String name_spaceType;
    
    private String desc_spaceType;

    public InfoSpacesType() {
    }

    public String getName_spaceType() {
        return name_spaceType;
    }

    public void setName_spaceType(String name_spaceType) {
        this.name_spaceType = name_spaceType;
    }

    public String getDesc_spaceType() {
        return desc_spaceType;
    }

    public void setDesc_spaceType(String desc_spaceType) {
        this.desc_spaceType = desc_spaceType;
    }
}