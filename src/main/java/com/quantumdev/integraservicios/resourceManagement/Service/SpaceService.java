package com.quantumdev.integraservicios.resourceManagement.Service;

import org.springframework.stereotype.Service;

import com.quantumdev.integraservicios.resourceManagement.Models.InfoSpaces;
import com.quantumdev.integraservicios.resourceManagement.Models.InfoSpacesType;
import com.quantumdev.integraservicios.resourceManagement.Models.Request.SpaceRequest;
import com.quantumdev.integraservicios.resourceManagement.Models.Request.SpaceTypeRequest;
import com.quantumdev.integraservicios.resourceManagement.Models.Response.MessageResponse;
import com.quantumdev.integraservicios.resourceManagement.Models.Response.SpaceTypeResponse;
import com.quantumdev.integraservicios.resourceManagement.repositories.SpacesRepository;
import com.quantumdev.integraservicios.resourceManagement.repositories.TypeSpacesRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SpaceService {
    private final SpacesRepository spacesRepository;
    private final TypeSpacesRepository typeSpacesRepository;

    @Transactional
    public MessageResponse saveSpace(SpaceRequest info) {

        InfoSpaces infoSpaces = InfoSpaces.builder()
            .building_space(info.getBuilding_space())
            .code_space(info.getCode_space())
            .type_space(info.getType_space())
            .state_space(info.getState_space())
            .name_space(info.getName_space())
            .capacity_space(info.getCapacity_space())
            .schedule_space(info.getSchedule_space())
            .desc_space(info.getDesc_space())
            .build();

        spacesRepository.save(infoSpaces);

        return MessageResponse.builder().message("Se registro el hardware con exito").build();
    }

    public MessageResponse saveSpaceType(SpaceTypeRequest info) {
        if (typeSpacesRepository.existsByName(info.getName_spaceType())) {
            throw new RuntimeException("El tipo de espacio ya existe");
        }

        InfoSpacesType infoSpacesType = InfoSpacesType.builder()
            .name(info.getName_spaceType())
            .desc(info.getDesc_spaceType())
            .build();

        typeSpacesRepository.save(infoSpacesType);

        return MessageResponse.builder().message("Se registro el tipo de hardware con exito").build();
    }

    public SpaceTypeResponse getSpaces() {
        return SpaceTypeResponse.builder().data(typeSpacesRepository.findAll()).build();
    }
}
