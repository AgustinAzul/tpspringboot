
package com.agustinserrano.tpspringboot.repository;

import com.agustinserrano.tpspringboot.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente,Long>{
    
}
