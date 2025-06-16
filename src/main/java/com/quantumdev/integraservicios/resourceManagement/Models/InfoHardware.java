package com.quantumdev.integraservicios.resourceManagement.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "InfoHardware")
public class InfoHardware {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeHardware;

    private String typeHardware;
    private String nameHardware;
    private String scheduleHardware;
    private String descHardware;

    public InfoHardware() {

    }

    public Long getCodeHardware() {
        return codeHardware;
    }

    public void setCodeHardware(Long codeHardware) {
        this.codeHardware = codeHardware;
    }

    public String getTypeHardware() {
        return typeHardware;
    }

    public void setTypeHardware(String typeHardware) {
        this.typeHardware = typeHardware;
    }

    public String getNameHardware() {
        return nameHardware;
    }

    public void setNameHardware(String nameHardware) {
        this.nameHardware = nameHardware;
    }

    public String getScheduleHardware() {
        return scheduleHardware;
    }

    public void setScheduleHardware(String scheduleHardware) {
        this.scheduleHardware = scheduleHardware;
    }

    public String getDescHardware() {
        return descHardware;
    }

    public void setDescHardware(String descHardware) {
        this.descHardware = descHardware;
    }
}
