package com.quantumdev.integraservicios.resourceManagement.Controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quantumdev.integraservicios.resourceManagement.Models.InfoSchedules;

@RestController
@RequestMapping("/schedules")
public class schedulesController {
    
    @PostMapping("/create")
    public ResponseEntity<Map<String, Object>> createSchedules(@RequestBody InfoSchedules body) {
        try{
            return ResponseEntity.ok().body(Map.of("Message", "Se registro con exito"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(Map.of("Message", "Error: algo salio mal y no se pudo agregar"));
        }
    }

    @PostMapping("/edit")
    public ResponseEntity<Map<String, Object>> editSchedules(@RequestBody InfoSchedules body) {
        try{
            return ResponseEntity.ok().body(Map.of("Message", "Se registro con exito el cambio"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(Map.of("Message", "Error: algo salio mal y no se pudo editar"));
        }
    }
}
