
package com.beargpro.argprograma.repository;

import com.beargpro.argprograma.model.Encabezado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncabezadoRepository extends JpaRepository <Encabezado, Long>{
    
}
