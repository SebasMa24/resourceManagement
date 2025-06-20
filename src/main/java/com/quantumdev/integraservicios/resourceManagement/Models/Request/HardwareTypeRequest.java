package com.quantumdev.integraservicios.resourceManagement.Models.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HardwareTypeRequest {
    String name_hardwareType;
    String desc_hardwareType;   
}
