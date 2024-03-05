package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable; //permite que obtener datos de bases de datos 
//podamos compertir este objecto en uno que se coniverta en algo que pueda recibir msq
import lombok.Data;

@Data //para agregar los encapsuladores, constrcutor, etc
@Entity //
@Table(name="categoria") //para decir en que tabla nos referimos
public class Categoria implements Serializable{
    
    private static final long serialVersionUID = 1L; //
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long idCategoria; //id_categoria en la base de datos
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    
    //Constrcutor base
    public Categoria() {
    }
    
    //(Constructor sobrecargado) este se usa cada vez que se crea un objeto  (idCategoria no porque es autoincrementable)
    public Categoria(String descripcion, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
    
    //anotaciones siempre deben ir pegadas a su metodo, clase, etc, o sea no dejae una linea vacia despues de ellas!!!!!!!!!!
}
