package com.quantumdev.integraservicios.resourceManagement.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SpaceType")
public class InfoSpacesType {

    @Id
    @Column(name = "name_spaceType", length = 32, nullable = false)
    private String name_spaceType;
    @Column(name = "desc_spaceType", length = 64, nullable = false)
    private String desc_spaceType;


    public String getName_spaceType() {
        return name_spaceType;
    }

    public String getDesc_spaceType() {
        return desc_spaceType;
    }
}