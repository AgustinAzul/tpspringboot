
package com.agustinserrano.tpspringboot.controller;

import com.agustinserrano.tpspringboot.model.Cliente;
import com.agustinserrano.tpspringboot.model.service.IClienteService;
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
public class ClienteController {
    
    @Autowired 
    private IClienteService clienteService;
    
    @GetMapping("/clientes")
    public List<Cliente> getClientes(){
        return clienteService.getClientes();
    }
    
    @GetMapping("/clientes/{id}")
    public Cliente getCliente(@PathVariable Long id){
        return clienteService.getCliente(id);
    }
    
    @DeleteMapping("/clientes/eliminar/{id}")
    public void deleteCliente(@PathVariable Long id){
        clienteService.deleteCliente(id);
    }
    
    @PutMapping("/clientes/editar/{id}")
    public Cliente editCliente(@RequestBody Cliente cliente){
        clienteService.editCliente(cliente);
        return clienteService.getCliente(cliente.getIdCliente());
    }
    
    @PostMapping("/clientes/crear")
    public void createCliente(@RequestBody Cliente cliente){
        clienteService.saveCliente(cliente);
    }
    
    
}
