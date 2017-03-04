/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

/**a
 *
 * @author Silvia
 */
@Entity
public class Genero {
    
    @Id
    private int codigo;
    private String descripcion;
    public Genero(){
        
    }
    
    public Genero( int c, String d) {
        this.codigo = c;
        this.descripcion = d;
        
    }

   

    // Metodos 
    //mostrar datos sirve para acceder a los atributos de la clase

    public String MostrarDatos() {
        return " Codigo -> " + codigo +"\n"+ " Descripcion -> " + descripcion +"\n";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
