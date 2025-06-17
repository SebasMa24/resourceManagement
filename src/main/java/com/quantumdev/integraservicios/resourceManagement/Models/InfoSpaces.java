package com.quantumdev.integraservicios.resourceManagement.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Space")
public class InfoSpaces {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code_space;

    private int building_space;
    private String type_space;
    private String state_space;
    private String name_space;
    private int capacity_space;
    private String schedule_space;
    private String desc_space;

    public InfoSpaces() {
    }

    public int getCode_space() {
        return code_space;
    }

    public void setCode_space(int code_space) {
        this.code_space = code_space;
    }

    public int getBuilding_space() {
        return building_space;
    }

    public void setBuilding_space(int building_space) {
        this.building_space = building_space;
    }

    public String getType_space() {
        return type_space;
    }

    public void setType_space(String type_space) {
        this.type_space = type_space;
    }

    public String getState_space() {
        return state_space;
    }

    public void setState_space(String state_space) {
        this.state_space = state_space;
    }

    public String getName_space() {
        return name_space;
    }

    public void setName_space(String name_space) {
        this.name_space = name_space;
    }

    public int getCapacity_space() {
        return capacity_space;
    }

    public void setCapacity_space(int capacity_space) {
        this.capacity_space = capacity_space;
    }

    public String getSchedule_space() {
        return schedule_space;
    }

    public void setSchedule_space(String schedule_space) {
        this.schedule_space = schedule_space;
    }

    public String getDesc_space() {
        return desc_space;
    }

    public void setDesc_space(String desc_space) {
        this.desc_space = desc_space;
    }
}
