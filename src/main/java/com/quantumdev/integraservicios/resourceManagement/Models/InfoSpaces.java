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
@Table(name = "Space")
public class InfoSpaces {

    @Id
    @Column(name = "code_space", nullable = false)
    private Short code_space;

    @Column(name = "building_space", nullable = false)
    private Short building_space;
    @Column(name = "type_space", length = 32, nullable = false)
    private String type_space;
    @Column(name = "state_space", length = 32, nullable = false)
    private String state_space;
    @Column(name = "name_space", length = 64, nullable = false)
    private String name_space;
    @Column(name = "capacity_space", nullable = false)
    private Short capacity_space;
    @Column(name = "schedule_space", length = 49, nullable = false)
    private String schedule_space;
    @Column(name = "desc_space", length = 64, nullable = false)
    private String desc_space;
}
