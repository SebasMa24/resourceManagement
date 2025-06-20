package com.quantumdev.integraservicios.resourceManagement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quantumdev.integraservicios.resourceManagement.Models.InfoSpaces;

public interface SpacesRepository extends JpaRepository<InfoSpaces, Long>{
    
}
