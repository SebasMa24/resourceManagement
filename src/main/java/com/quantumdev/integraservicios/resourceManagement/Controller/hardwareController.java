package com.quantumdev.integraservicios.resourceManagement.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quantumdev.integraservicios.resourceManagement.Models.Request.HardwareRequest;
import com.quantumdev.integraservicios.resourceManagement.Models.Request.HardwareTypeRequest;
import com.quantumdev.integraservicios.resourceManagement.Models.Response.MessageResponse;
import com.quantumdev.integraservicios.resourceManagement.Service.HardwareService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/hardware")
@RequiredArgsConstructor
public class hardwareController {
    private final HardwareService hardwareService;

    @PostMapping("/createHardware")
    public ResponseEntity<MessageResponse> createHardware(@RequestBody HardwareRequest body) {
        return ResponseEntity.ok(hardwareService.saveHardware(body));
    }

    @PostMapping("/createHardwareType")
    public ResponseEntity<MessageResponse> createHardwareType(@RequestBody HardwareTypeRequest body) {
        return ResponseEntity.ok(hardwareService.saveHardwareType(body));
    }
    
    /**@PostMapping("/editHardware")
    public ResponseEntity<Map<String, Object>> editHardware(@RequestBody InfoHardware body) {
        
    }**/
}
