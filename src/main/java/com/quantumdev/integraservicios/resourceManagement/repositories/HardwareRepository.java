package com.quantumdev.integraservicios.resourceManagement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quantumdev.integraservicios.resourceManagement.Models.InfoHardware;

public interface HardwareRepository extends JpaRepository<InfoHardware, Long> {
    
}
