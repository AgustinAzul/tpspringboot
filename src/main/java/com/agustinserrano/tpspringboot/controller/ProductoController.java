
package com.agustinserrano.tpspringboot.controller;

import com.agustinserrano.tpspringboot.model.Producto;
import com.agustinserrano.tpspringboot.model.service.IProductoService;
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
public class ProductoController {
    
    @Autowired
    private IProductoService produService;
    
    @GetMapping("/productos")
    public List<Producto> getProductos(){
        return produService.getProductos();
    }
    
    @GetMapping("/productos/{id}")
    public Producto getProducto(@PathVariable Long id){
        return produService.getProducto(id);
    }
    
    @PostMapping("/productos/crear")
    public void createProducto(@RequestBody Producto producto){
        produService.saveProducto(producto);
    }
    
    @DeleteMapping("/productos/eliminar/{id}")
    public void deleteProducto(@PathVariable Long id){
        produService.deleteProducto(id);
    }
    
    @PutMapping("/productos/editar/{id}")
    public Producto editProducto(@RequestBody Producto producto){
        produService.editProducto(producto);
        return produService.getProducto(producto.getCodigoProducto());
    }
}
