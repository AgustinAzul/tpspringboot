
package com.agustinserrano.tpspringboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Producto {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long codigoProducto;
    private String nombre;
    private String marca;
    private double costo;
    private double cantDisponible;

    public Producto() {
    }

    public Producto(Long codigoProducto, String nombre, String marca, double costo, double cantDisponible) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.marca = marca;
        this.costo = costo;
        this.cantDisponible = cantDisponible;
    }
    
}
