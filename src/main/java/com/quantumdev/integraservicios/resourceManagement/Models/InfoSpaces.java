package com.quantumdev.integraservicios.resourceManagement.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public Short getCode_space() {
        return code_space;
    }

    public Short getBuilding_space() {
        return building_space;
    }

    public String getType_space() {
        return type_space;
    }

    public String getState_space() {
        return state_space;
    }

    public String getName_space() {
        return name_space;
    }

    public Short getCapacity_space() {
        return capacity_space;
    }

    public String getSchedule_space() {
        return schedule_space;
    }

    public String getDesc_space() {
        return desc_space;
    }
}
