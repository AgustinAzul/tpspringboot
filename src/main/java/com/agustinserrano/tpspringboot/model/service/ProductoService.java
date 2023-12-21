
package com.agustinserrano.tpspringboot.model.service;

import com.agustinserrano.tpspringboot.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService{
    @Autowired
    private IProductoRepository productoRepo;
    
}
