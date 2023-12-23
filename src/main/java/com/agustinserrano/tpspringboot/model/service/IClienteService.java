
package com.agustinserrano.tpspringboot.model.service;

import com.agustinserrano.tpspringboot.model.Cliente;
import java.util.List;

public interface IClienteService {
    
    public Cliente getCliente(Long id);
    
    public List<Cliente> getClientes();
    
    public void deleteCliente(Long id);
    
    public void saveCliente(Cliente cliente);
    
    public void editCliente(Cliente cliente);
    
    
    
}
