
package com.agustinserrano.tpspringboot.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class VentasPorDiaDTO {
    private int cantVentas;
    private double monto;

    public VentasPorDiaDTO() {
    }

    public VentasPorDiaDTO(int cantVentas, double monto) {
        this.cantVentas = cantVentas;
        this.monto = monto;
    }
    
    
}
