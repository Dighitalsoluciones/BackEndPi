
package com.beargpro.argprograma.service;

import com.beargpro.argprograma.model.Encabezado;
import com.beargpro.argprograma.repository.EncabezadoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EncabezadoService implements IEncabezadoService {
    
    @Autowired
    public EncabezadoRepository encaRepo;

    @Override
    public List<Encabezado> verEncabezado() {
        return encaRepo.findAll();
    }

    @Override
    public void crearEncabezado(Encabezado enc) {
       encaRepo.save(enc);
    }
    
    @Override
    public void editarEncabezado(Encabezado enc) {
       encaRepo.save(enc);
    }
    
    @Override
    public void editarFotoperfil(Encabezado enc) {
       encaRepo.save(enc);
    }
}
