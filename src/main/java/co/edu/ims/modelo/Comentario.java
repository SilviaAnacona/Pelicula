/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims.modelo;

/**
 *
 * @author Silvia
 */
public class Comentario {
    private String mensaje;
    private String nombre;
    private String fecha;
    private double calificacion;
    
    public Comentario(){
        
    }
    
    public Comentario(String m, String n, String f, double c) {
        this.mensaje = m;
        this.nombre = n;
        this.fecha = f;
        this.calificacion = c;
    }

  

    // Metodos 
    //mostrar datos sirve para acceder a los atributos de la clase

    public String MostrarDatos() {
        return " mensaje -> " + mensaje +"\n"+ " Nombre -> " + nombre +"\n"+ " fecha -> " + fecha+"\n"+ " Calificacion -> " + calificacion;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {

        this.fecha = fecha;
    } 
      public double getCalificacion() {
          
        return calificacion;
    }

    public void setCalificacion(double fecha) {

        this.calificacion = calificacion;
    }
   
}
