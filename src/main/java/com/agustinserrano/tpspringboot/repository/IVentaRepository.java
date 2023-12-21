
package com.agustinserrano.tpspringboot.repository;

import com.agustinserrano.tpspringboot.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVentaRepository extends JpaRepository<Venta, Long>{
    
    
}
