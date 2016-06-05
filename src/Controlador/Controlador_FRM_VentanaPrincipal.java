/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ArrayEstudiante;
import modelo.Estudiante;

import vista.FRM_MantenimientoEstudiantes;

/**
 *
 * @author Bryan Blanco
 */

public class Controlador_FRM_VentanaPrincipal implements ActionListener{
    
    FRM_MantenimientoEstudiantes estudiante;
    
    public Controlador_FRM_VentanaPrincipal(FRM_MantenimientoEstudiantes  estudiante)
    {
        this.estudiante=estudiante;
     
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Salir"))
        {
          System.exit(0);   
        }
        if(e.getActionCommand().equals("Estudiantes"))
        {
            estudiante.setVisible(true);
        }
    }//Fin del
    
    }//Fin 