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
@Table(name = "Hardware")
public class InfoHardware {

    @Id
    @Column(name = "codeHardware", nullable = false)
    private Long codeHardware;

    @Column(name = "typeHardware", length = 32, nullable = false)
    private String typeHardware;
    @Column(name = "nameHardware", length = 32, nullable = false)
    private String nameHardware;
    @Column(name = "scheduleHardware", length = 49, nullable = false)
    private String scheduleHardware;
    @Column(name = "descHardware", length = 64, nullable = false)
    private String descHardware;

    public Long getCodeHardware() {
        return codeHardware;
    }

    public String getTypeHardware() {
        return typeHardware;
    }

    public String getNameHardware() {
        return nameHardware;
    }

    public String getScheduleHardware() {
        return scheduleHardware;
    }

    public String getDescHardware() {
        return descHardware;
    }
}
