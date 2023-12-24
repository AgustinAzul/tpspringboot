
package com.agustinserrano.tpspringboot.model.service;

import com.agustinserrano.tpspringboot.model.Venta;
import java.util.List;
import org.springframework.stereotype.Service;


public interface IVentaService {
    
    public Venta getVenta(Long id);
    
    public List<Venta> getVentas();
    
    public void deleteVenta(Long id);
    
    public void saveVenta(Venta venta);
    
    public void editVenta(Venta venta);
    
}
