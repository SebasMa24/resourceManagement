package com.quantumdev.integraservicios.resourceManagement.Models.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HardwareRequest {
    String typeHardware;
    String nameHardware;
    String scheduleHardware;
    String descHardware;
}
