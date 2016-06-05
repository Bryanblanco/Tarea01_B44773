/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JTextField;

/**
 *
 * @author Bryam Blanco
 */
public class Estudiante { 
    
    private String nombre="";
    private String correo="";
    private int cedula=0;

    public Estudiante(String nombre,String correo ,int cedula) {  //Constructor
        this.nombre = nombre;
        this.correo = correo;
        this.cedula = cedula;
    }

    public Estudiante() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

   // @Override
    public String InfoEstudiante() {
        return "Datos del Estudiante:\n"+"Nombre: "+getNombre()+ "\nCorreo: "+getCorreo()+"\nCedula: "+getCedula();
    }//Fin del ToString
    
}//Fin de la calse objeto Estudiante

