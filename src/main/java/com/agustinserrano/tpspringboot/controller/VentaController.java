
package com.agustinserrano.tpspringboot.controller;

import com.agustinserrano.tpspringboot.model.Venta;
import com.agustinserrano.tpspringboot.model.service.IVentaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VentaController {
    
    @Autowired
    private IVentaService ventaService;
    
    @GetMapping("/ventas")
    public List<Venta> getVentas(){
        return ventaService.getVentas();
    }
    
    @GetMapping("/ventas/{id}")
    public Venta getVenta(@PathVariable Long id){
        return ventaService.getVenta(id);
    }
    
    @DeleteMapping("ventas/eliminar{id}")
    public void deleteVenta(@PathVariable Long id){
        ventaService.deleteVenta(id);
    }
    
    @PostMapping("ventas/crear")
    public void createVenta(@RequestBody Venta venta){
        ventaService.saveVenta(venta);
    }
    
    @PutMapping("ventas/editar/{id}")
    public Venta editVenta(@RequestBody Venta venta){
        ventaService.saveVenta(venta);
        return ventaService.getVenta(venta.getCodigoVenta());
    }
}
