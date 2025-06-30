package com.quantumdev.integraservicios.resourceManagement.Models.Response;

import java.util.List;

import com.quantumdev.integraservicios.resourceManagement.Models.InfoSpacesType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class SpaceTypeResponse {
    List<InfoSpacesType> data;
}
