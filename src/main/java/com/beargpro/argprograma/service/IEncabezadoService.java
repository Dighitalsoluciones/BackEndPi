
package com.beargpro.argprograma.service;

import com.beargpro.argprograma.model.Encabezado;
import java.util.List;


public interface IEncabezadoService {
    
    public List<Encabezado> verEncabezado();
    public void crearEncabezado (Encabezado enc);
    public void editarFotoperfil (Encabezado enc);
    public void editarEncabezado (Encabezado enc);
    
}
