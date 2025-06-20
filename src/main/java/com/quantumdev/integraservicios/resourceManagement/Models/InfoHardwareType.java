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
@Table(name = "HardwareType")
public class InfoHardwareType {

    @Id
    @Column(name = "name_hardwareType", length = 32, nullable = false)
    private String name_hardwareType;
    @Column(name = "desc_hardwareType", length = 64, nullable = false)
    private String desc_hardwareType;

    public String getName_hardwareType() {
        return name_hardwareType;
    }

    public String getDesc_hardwareType() {
        return desc_hardwareType;
    }
}