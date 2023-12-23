
package com.agustinserrano.tpspringboot.model.service;

import com.agustinserrano.tpspringboot.model.Cliente;
import com.agustinserrano.tpspringboot.repository.IClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteService{
    
    @Autowired
    private IClienteRepository clienteRepo;
    
    @Override
    public Cliente getCliente(Long id) {
        return clienteRepo.findById(id).orElse(null);
    }

    @Override
    public List<Cliente> getClientes() {
        return clienteRepo.findAll();
    }

    @Override
    public void deleteCliente(Long id) {
        clienteRepo.deleteById(id);
    }

    @Override
    public void saveCliente(Cliente cliente) {
        clienteRepo.save(cliente);
    }

    @Override
    public void editCliente(Cliente cliente) {
        clienteRepo.save(cliente);
    }
    
}
