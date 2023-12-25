
package com.agustinserrano.tpspringboot.model.service;

import com.agustinserrano.tpspringboot.dto.MayorVentaDTO;
import com.agustinserrano.tpspringboot.dto.VentasPorDiaDTO;
import com.agustinserrano.tpspringboot.model.Producto;
import com.agustinserrano.tpspringboot.model.Venta;
import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Service;


public interface IVentaService {
    
    public Venta getVenta(Long id);
    
    public List<Venta> getVentas();
    
    public void deleteVenta(Long id);
    
    public void saveVenta(Venta venta);
    
    public void editVenta(Venta venta);
    
    public List<Producto> getProductosVenta(Long id);
    
    public VentasPorDiaDTO getVentasDia(LocalDate fecha);
   
    public MayorVentaDTO getMayorVenta();
    
}
