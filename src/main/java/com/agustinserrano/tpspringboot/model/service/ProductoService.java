
package com.agustinserrano.tpspringboot.model.service;

import com.agustinserrano.tpspringboot.model.Producto;
import com.agustinserrano.tpspringboot.repository.IProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService{
    @Autowired
    private IProductoRepository productoRepo;

    @Override
    public Producto getProducto(Long id) {
        return productoRepo.findById(id).orElse(null);
    }

    @Override
    public List<Producto> getProductos() {
        return productoRepo.findAll();
    }

    @Override
    public void saveProducto(Producto producto) {
        productoRepo.save(producto);
    }

    @Override
    public void deleteProducto(Long id) {
        productoRepo.deleteById(id);
    }

    @Override
    public void editProducto(Producto producto) {
        productoRepo.save(producto);
    }
    
}
