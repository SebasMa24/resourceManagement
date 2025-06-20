package com.quantumdev.integraservicios.resourceManagement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quantumdev.integraservicios.resourceManagement.Models.InfoHardwareType;

public interface TypeHardwareRepository extends JpaRepository<InfoHardwareType, String>{
    boolean existsByName(String name);
}
