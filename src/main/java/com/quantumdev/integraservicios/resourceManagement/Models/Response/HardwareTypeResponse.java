package com.quantumdev.integraservicios.resourceManagement.Models.Response;

import java.util.List;

import com.quantumdev.integraservicios.resourceManagement.Models.InfoHardwareType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HardwareTypeResponse {
    List<InfoHardwareType> data;
}
