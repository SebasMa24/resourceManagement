package com.quantumdev.integraservicios.resourceManagement.Service;

import org.springframework.stereotype.Service;

import com.quantumdev.integraservicios.resourceManagement.Models.InfoHardware;
import com.quantumdev.integraservicios.resourceManagement.Models.InfoHardwareType;
import com.quantumdev.integraservicios.resourceManagement.Models.Request.HardwareRequest;
import com.quantumdev.integraservicios.resourceManagement.Models.Request.HardwareTypeRequest;
import com.quantumdev.integraservicios.resourceManagement.Models.Response.HardwareTypeResponse;
import com.quantumdev.integraservicios.resourceManagement.Models.Response.MessageResponse;
import com.quantumdev.integraservicios.resourceManagement.repositories.HardwareRepository;
import com.quantumdev.integraservicios.resourceManagement.repositories.TypeHardwareRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HardwareService {
    private final HardwareRepository hardwareRepository;
    private final TypeHardwareRepository typeHardwareRepository;

    public MessageResponse saveHardware(HardwareRequest info) {
        Long newId = System.currentTimeMillis();

        InfoHardware infoHardware = InfoHardware.builder()
            .codeHardware(newId)
            .typeHardware(info.getTypeHardware())
            .nameHardware(info.getNameHardware())
            .scheduleHardware(info.getScheduleHardware())
            .descHardware(info.getDescHardware()).build();
        

        hardwareRepository.save(infoHardware);

        return MessageResponse.builder().message("Se registro el espacio con exito").build();
    }

    public MessageResponse saveHardwareType(HardwareTypeRequest info) {
        if (typeHardwareRepository.existsByName(info.getName_hardwareType())) {
            throw new RuntimeException("El tipo de hardware ya existe");
        }

        InfoHardwareType infoHardwareType = InfoHardwareType.builder()
            .name(info.getName_hardwareType())
            .desc(info.getDesc_hardwareType())
            .build();

        typeHardwareRepository.save(infoHardwareType);

        return MessageResponse.builder().message("Se registro el tipo de espacio con exito").build();
    }

    public HardwareTypeResponse getTypeHardware() {
        return HardwareTypeResponse.builder().data(typeHardwareRepository.findAll()).build();
    }
}
