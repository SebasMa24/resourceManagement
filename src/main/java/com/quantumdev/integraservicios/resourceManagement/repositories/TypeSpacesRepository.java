package com.quantumdev.integraservicios.resourceManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quantumdev.integraservicios.resourceManagement.Models.InfoSpacesType;

public interface TypeSpacesRepository extends JpaRepository<InfoSpacesType, Long>{
    boolean existsByName(String name);
}
