
package com.beargpro.argprograma.service;

import com.beargpro.argprograma.model.Encabezado;
import com.beargpro.argprograma.repository.EncabezadoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EncabezadoService implements IEncabezadoService {
    @Autowired EncabezadoRepository encaRepo;

    @Override
    public List<Encabezado> verEncabezado() {
        List<Encabezado> encabezado = encaRepo.findAll();
        return encabezado;
    }

    @Override
    public void crearEncabezado(Encabezado encabezado) {
       encaRepo.save(encabezado);
    }
    
    @Override
    public Encabezado buscarEncabezado(Long id){
       Encabezado encabezado = encaRepo.findById(id).orElse(null);
       return encabezado;
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
