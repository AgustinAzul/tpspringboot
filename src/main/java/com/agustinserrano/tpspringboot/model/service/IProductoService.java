
package com.agustinserrano.tpspringboot.model.service;

import com.agustinserrano.tpspringboot.model.Producto;
import java.util.List;


public interface IProductoService {
    
    public Producto getProducto(Long id);
    
    public List<Producto> getProductos();
    
    public void saveProducto(Producto producto);
    
    public void deleteProducto(Long id);
    
    public void editProducto(Producto producto);
     
}
