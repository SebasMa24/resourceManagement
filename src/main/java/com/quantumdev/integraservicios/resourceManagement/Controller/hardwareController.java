package com.quantumdev.integraservicios.resourceManagement.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quantumdev.integraservicios.resourceManagement.Models.InfoHardware;
import com.quantumdev.integraservicios.resourceManagement.Models.InfoHardwareType;
import com.quantumdev.integraservicios.resourceManagement.repositories.HardwareRepository;
import com.quantumdev.integraservicios.resourceManagement.repositories.TypeHardwareRepository;

@RestController
@RequestMapping("/hardware")
public class hardwareController {

    @Autowired
    private HardwareRepository hardwareRepository;

    @Autowired
    private TypeHardwareRepository typeHardwareRepository;

    @PostMapping("/createHardware")
    public ResponseEntity<Map<String, Object>> createHardware(@RequestBody InfoHardware body) {
        try{
            hardwareRepository.save(body);
            return ResponseEntity.ok().body(Map.of("Message", "Se registro con exito"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(Map.of("Message", "Error: algo salio mal y no se pudo agregar"));
        }
    }

    @PostMapping("/createHardwareType")
    public ResponseEntity<Map<String, Object>> createHardwareType(@RequestBody InfoHardwareType body) {
        try{
            typeHardwareRepository.save(body);
            return ResponseEntity.ok().body(Map.of("Message", "Se registro con exito"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(Map.of("Message", "Error: algo salio mal y no se pudo agregar"));
        }
    }
    
    @PostMapping("/editHardware")
    public ResponseEntity<Map<String, Object>> editHardware(@RequestBody InfoHardware body) {
        try{
            hardwareRepository.save(body);
            return ResponseEntity.ok().body(Map.of("Message", "Se registro con exito el cambio"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(Map.of("Message", "Error: algo salio mal y no se pudo editar"));
        }
    }
}
