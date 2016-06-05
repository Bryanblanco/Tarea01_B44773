/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;   //Recordar

import java.util.ArrayList;
//import javax.swing.JOptionpane;
        
        
/**
 *
 * @author Bryam Blanco
 */
public class ArrayEstudiante {
    
    String nombre="";
    String correo="";
    int cedula=0;
    
   private ArrayList <Estudiante>solicitud;
   // Estudiante e;
   
	public ArrayEstudiante()
	{
	    solicitud=new ArrayList<Estudiante>(); //solicitud será un Array tipo Estudiante
	}
	
	public void AgregarSolicitud(Estudiante soli)
	{
	     solicitud.add(soli);
	}
        
	public String ListadoSoli()
	{
		String mensaje="";
                
		for(int i=0;i<solicitud.size();i++)
		{
		      mensaje+="Lista de solicitudes:\n"+solicitud.get(i).InfoEstudiante()+ "\n";
		}
		return mensaje; //Imprime las solicitudes.
	}
        
	public Estudiante BuscarSolicitud(int cedula){
            
		Estudiante estudiante=null;
		for(int i=0;i<solicitud.size();i++)
		{
			if(solicitud.get(i).getCedula()==cedula) //Ingualo cédula encontrada con digitada.
			{
			     estudiante=solicitud.get(i);
			}
		}
		return estudiante;
	}
        
	public void Modificar(int cedula,String nombre,String correo){ 
          
            for(int i=0;i<solicitud.size();i++)
            {
                if(solicitud.get(i).getCedula()==cedula)
                {
                   solicitud.get(i).setCorreo(correo);
                   solicitud.get(i).setNombre(nombre);  
                }
            }
        }
        
        public void Eliminar(int cedula)
        {
            for(int i=0;i<solicitud.size();i++)
            {
                if(solicitud.get(i).getCedula()==cedula)
                {
                   solicitud.remove(i);
                }
                
            }
        }
        
        /*
             public void AgregarEstudiante(String info[])
        {
           Estudiante Temporal=new Estudiante(inf0[0],info[1],info[2]);
           solicitud.add(temporal);
        }
        */
	
}//Fin de la clase ArrayList

    

