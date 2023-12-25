
package com.agustinserrano.tpspringboot.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MayorVentaDTO {

    private Long codigoVenta;
    private double total;
    private int cantProductos;
    private String nomhre;
    private String apellido;

    public MayorVentaDTO() {
    }

    public MayorVentaDTO(Long codigoVenta, double total, int cantProductos, String nomhre, String apellido) {
        this.codigoVenta = codigoVenta;
        this.total = total;
        this.cantProductos = cantProductos;
        this.nomhre = nomhre;
        this.apellido = apellido;
    }
    
    
    
}
