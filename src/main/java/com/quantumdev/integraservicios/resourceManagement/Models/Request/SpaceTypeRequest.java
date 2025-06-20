package com.quantumdev.integraservicios.resourceManagement.Models.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SpaceTypeRequest {
    String name_spaceType;
    String desc_spaceType;
}
