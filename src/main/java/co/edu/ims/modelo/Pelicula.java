/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims.modelo;

import java.util.List;
import javax.persistence.Entity;
import static jdk.nashorn.internal.runtime.Debug.id;

/**
 *
 * @author Silvia
 */

public class Pelicula {
    //atributos
   
    private String titulo;
    private int anio;
//    private String director;
    private List<Persona> director;
    private List<Genero> genero;
    
    
// constructores
    //constructor1 por defecto no le paso ningun parametro

    public Pelicula() {

    }

    // constructor con todos los parametros
    // construir objetos de esa clase ejemplo pelicula
    public Pelicula(String t, int a, List<Persona> d, List<Genero> g) {
        this.titulo = t;
        this.anio = a;
        this.director = d;
        this.genero = g;
    }

    public Pelicula(String t) {
        this.titulo = t;
        this.anio = 1;
        
    }

    // Metodos 
    //mostrar datos sirve para acceder a los atributos de la clase

    public String MostrarDatos() {
        return " Titulo -> " + titulo +"\n"+ " Año -> " + anio +"\n"+ " Director -> " + director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public List<Persona> getDirector() {
        return director;
    }

    public void setDirector(List<Persona> director) {

        this.director = director;
    }

    public List<Genero> getGenero() {
        return genero;
    }

    public void setGenero(List<Genero> genero) {
        this.genero = genero;
    }
    
    
}
