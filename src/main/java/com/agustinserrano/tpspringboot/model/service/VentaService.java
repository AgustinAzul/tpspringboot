
package com.agustinserrano.tpspringboot.model.service;

import com.agustinserrano.tpspringboot.repository.IVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService {
    @Autowired
    private IVentaRepository ventaRepo;
}
