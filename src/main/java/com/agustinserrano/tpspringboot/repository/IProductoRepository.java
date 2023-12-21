
package com.agustinserrano.tpspringboot.repository;

import com.agustinserrano.tpspringboot.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends JpaRepository<Producto,Long>{
    
}
