/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Silvia
 */
@Entity
public class Persona {
    @Id
    private String nombre;
    private int edad;
    private String nacionalidad;
    public Persona(){
        
    }
   public Persona(String n, int e, String na) {
        this.nombre = n;
        this.edad = e;
        this.nacionalidad = na;
    }

    public Persona(String n) {
        this.nombre = n;
        this.edad = 12;
        this.nacionalidad = "Colombiana";
    }

    // Metodos 
    //mostrar datos sirve para acceder a los atributos de la clase

    public String MostrarDatos() {
        return " Nombre -> " + nombre +"\n"+ " Edad -> " + edad +"\n"+ " Nacionalidad -> " + nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {

        this.nacionalidad = nacionalidad;
    } 
}
