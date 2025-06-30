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
@Table(name = "Hardwaretype")
public class InfoHardwareType {

    @Id
    @Column(name = "name_hardwaretype", length = 32, nullable = false)
    private String name;
    @Column(name = "desc_hardwaretype", length = 64, nullable = false)
    private String desc;
}