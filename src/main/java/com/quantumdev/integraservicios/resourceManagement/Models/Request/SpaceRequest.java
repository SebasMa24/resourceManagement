package com.quantumdev.integraservicios.resourceManagement.Models.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SpaceRequest {
    Short code_space;
    Short building_space;
    String type_space;
    String state_space;
    String name_space;
    Short capacity_space;
    String schedule_space;
    String desc_space;
}
