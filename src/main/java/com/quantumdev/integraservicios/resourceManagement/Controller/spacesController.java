package com.quantumdev.integraservicios.resourceManagement.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quantumdev.integraservicios.resourceManagement.Models.Request.SpaceRequest;
import com.quantumdev.integraservicios.resourceManagement.Models.Request.SpaceTypeRequest;
import com.quantumdev.integraservicios.resourceManagement.Models.Response.MessageResponse;
import com.quantumdev.integraservicios.resourceManagement.Models.Response.SpaceTypeResponse;
import com.quantumdev.integraservicios.resourceManagement.Service.SpaceService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/spaces")
@RequiredArgsConstructor
public class spacesController {
    private final SpaceService spaceService;
    
    @PostMapping("/createSpaces")
    public ResponseEntity<MessageResponse> createSpaces(@RequestBody SpaceRequest body) {
        return ResponseEntity.ok(spaceService.saveSpace(body));
    }

    @PostMapping("/createSpacesType")
    public ResponseEntity<MessageResponse> createSpacesType(@RequestBody SpaceTypeRequest body) {
        return ResponseEntity.ok(spaceService.saveSpaceType(body));
    }

    @GetMapping("/listSpaces")
    public ResponseEntity<SpaceTypeResponse> editSpaces() {
        return ResponseEntity.ok(spaceService.getSpaces());
    }
}
