package com.quantumdev.integraservicios.resourceManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quantumdev.integraservicios.resourceManagement.Models.InfoSpaces;

public interface SpacesRepository extends JpaRepository<InfoSpaces, Long>{
    
}
