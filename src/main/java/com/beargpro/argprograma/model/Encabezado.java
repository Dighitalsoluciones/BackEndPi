
package com.beargpro.argprograma.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Encabezado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fotoperfil;
    private String nombre;
    private String titulo;
    private String direccion; 
     
    public Encabezado(){
        }
    
public Encabezado(Long id, String fotoperfil, String nombre, String titulo, String direccion) {
        this.id = id;
        this.fotoperfil = fotoperfil;
        this.nombre = nombre;
        this.titulo = titulo;
        this.direccion = direccion;
        
    } 
}
