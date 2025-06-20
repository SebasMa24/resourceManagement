package com.quantumdev.integraservicios.resourceManagement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quantumdev.integraservicios.resourceManagement.Models.InfoSpacesType;

public interface TypeSpacesRepository extends JpaRepository<InfoSpacesType, String>{
    boolean existsByName(String name);
}
