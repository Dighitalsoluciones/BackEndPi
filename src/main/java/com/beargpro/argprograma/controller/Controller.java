
package com.beargpro.argprograma.controller;


import com.beargpro.argprograma.model.Encabezado;
import com.beargpro.argprograma.service.IEncabezadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class Controller {
    @Autowired
    private IEncabezadoService encaServ;
    
    @GetMapping ("api/ver/encabezado")
    @ResponseBody
    public List<Encabezado> verEncabezado(){
        return encaServ.verEncabezado();
    }
    
    @PostMapping ("api/crear/encabezado")
    public void crearEncabezado (@RequestBody Encabezado enc){
        encaServ.crearEncabezado(enc);
    }
  
    @PutMapping ("api/editar/encabezado")
    public void editarEncabezado (@RequestBody Encabezado enc){
        encaServ.editarEncabezado(enc);
    }
    
}
