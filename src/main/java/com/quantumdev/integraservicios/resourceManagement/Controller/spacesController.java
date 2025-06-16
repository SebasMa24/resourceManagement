package com.quantumdev.integraservicios.resourceManagement.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quantumdev.integraservicios.resourceManagement.Models.InfoSpacesType;
import com.quantumdev.integraservicios.resourceManagement.repositories.SpacesRepository;
import com.quantumdev.integraservicios.resourceManagement.repositories.TypeSpacesRepository;
import com.quantumdev.integraservicios.resourceManagement.Models.InfoSpaces;

@RestController
@RequestMapping("/spaces")
public class spacesController {

    @Autowired
    private SpacesRepository spacesRepository;

    @Autowired 
    private TypeSpacesRepository typeSpacesRepository;
    
    @PostMapping("/createSpaces")
    public ResponseEntity<Map<String, Object>> createSpaces(@RequestBody InfoSpaces body) {
        try{
            spacesRepository.save(body);
            return ResponseEntity.ok().body(Map.of("Message", "Se registro con exito"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(Map.of("Message", "Error: algo salio mal y no se pudo agregar"));
        }
    }

    @PostMapping("/createSpacesType")
    public ResponseEntity<Map<String, Object>> createSpacesType(@RequestBody InfoSpacesType body) {
        try{
            typeSpacesRepository.save(body);
            return ResponseEntity.ok().body(Map.of("Message", "Se registro con exito"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(Map.of("Message", "Error: algo salio mal y no se pudo agregar"));
        }
    }

    @PostMapping("/editSpaces")
    public ResponseEntity<Map<String, Object>> editSpaces(@RequestBody InfoSpaces body) {
        try{
            spacesRepository.save(body);
            return ResponseEntity.ok().body(Map.of("Message", "Se registro con exito el cambio"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(Map.of("Message", "Error: algo salio mal y no se pudo editar"));
        }
    }
}
