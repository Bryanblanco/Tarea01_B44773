/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.ArrayEstudiante;
import modelo.Estudiante;
import vista.FRM_MantenimientoEstudiantes;

/**
 *
 * @author Bryan Blanco
 */
public class ControladorVentanaEstudiantes implements ActionListener{
 
  FRM_MantenimientoEstudiantes estudianteM;
  Estudiante estudiante;
  ArrayEstudiante array;
  
  public ControladorVentanaEstudiantes(FRM_MantenimientoEstudiantes estudianteM,Estudiante estudiante, ArrayEstudiante array)
  {
     this.estudianteM=estudianteM;
     this.estudiante=estudiante;
     this.array=array;
  }
    public void actionPerformed(ActionEvent e)
    {
        
       if(e.getActionCommand().equals("buscar"))  //Buscar
       {
           int cedulaPantala=estudianteM.getJT_Cedula();
           
           if(array.BuscarSolicitud(cedulaPantala)==null)
           {
               JOptionPane.showMessageDialog(null,"El estudiante no se encuentra registrado."); 
           }
           else
           {
               estudianteM.Mostrar(array.BuscarSolicitud(cedulaPantala));
           }  
       }//Fin de Buscar
       
       if(e.getActionCommand().equals("eliminar"))   //Eliminar
       {
           int c=estudianteM.getJT_Cedula();
           if(array.BuscarSolicitud(c)==null)
           {
              JOptionPane.showMessageDialog(null,"Esta cedula no se encuentra en el sistema.");  
           }
           else
           {
              array.Eliminar(c);
               JOptionPane.showMessageDialog(null,"Estudiante eliminado del sistema.");
           }
           
       }//Fin de Eliminar
       
       if(e.getActionCommand().equals("modificar"))  //Modificar
       {
           int cedulaPantalla=0;
           String nombrePa="";
           String correoPa="";
           
           cedulaPantalla= estudianteM.getJT_Cedula();
           nombrePa=estudianteM.getJT_NombreCompleto();
           //correoPa=estudianteM.es_Correo();
           if(array.BuscarSolicitud(cedulaPantalla)==null)
           {     
               JOptionPane.showMessageDialog(null,"no existe cedula");
           }
           else
           {
               array.Modificar(cedulaPantalla, nombrePa, correoPa);
               JOptionPane.showMessageDialog(null,"Datos del estudiante modificados.");   
           }
       }//Fin Modificar
       
       if(e.getActionCommand().equalsIgnoreCase("agregar")) //Agregar
       {  
           //cedula=estudianteM.getJT_Cedula();
           //nombreCompleto=estudianteM.getJT_NombreCompleto();
           //direccion=estudianteM.getJT_Direccion();
           estudiante=new Estudiante(estudianteM.getJT_NombreCompleto(),estudianteM.getJT_Direccion(), estudianteM.getJT_Cedula());
           array.AgregarSolicitud(estudiante); 
           JOptionPane.showMessageDialog(null,"Estudiante agregado.");
       }
       
       if(e.getActionCommand().equals("Consulta")) //Consultar
       {
           JOptionPane.showMessageDialog(null,array.ListadoSoli());
       }
       if(e.getActionCommand().equalsIgnoreCase("Limpiar"))
       {
           estudianteM.Limpiar();
       }     
       
    }//Fin del ActionPerformed
    
    
}//Fin de la clase ControladorVentanaEstudiantes
