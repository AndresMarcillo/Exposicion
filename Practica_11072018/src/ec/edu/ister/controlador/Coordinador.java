/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;

import ec.edu.ister.vista.Administrador;
import ec.edu.ister.vista.formulariosInternos.IngresarDocente;
import ec.edu.ister.vista.Docente;
import ec.edu.ister.vista.IngresoDocente;
import ec.edu.ister.vista.Inicio;
import ec.edu.ister.vista.Login;
import ec.edu.ister.vista.formulariosInternos.EditarDocente;
import java.awt.BorderLayout;

/**
 *
 * @author PC6-LAB1
 */
public class Coordinador {
    Login login= new Login(this);
    Administrador administrador = new Administrador(this);
    Inicio inicio = new Inicio(this);
    //Docente docente = new Docente(this);
    IngresarDocente ingresarDocente = new IngresarDocente(this);
    EditarDocente editarDocente = new EditarDocente(this);
    
    
    public void showLogin(){
        login.setVisible(true);
    }
    public void showAdministrador(){
        administrador.setVisible(true);
    }
    public void hideLogin(){
        login.setVisible(false);
    }
    public void hideAdministrador(){
        administrador.setVisible(false);
    }
    public void showInicio(){
        inicio.setSize(1500,1500);
        inicio.setLocation(5,5);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(inicio,BorderLayout.CENTER);
        administrador.escritorio.revalidate();
        administrador.escritorio.repaint();
        
    }
    
//    public void showDocente(){
//        docente.setSize(1500,1500);
//        docente.setLocation(5,5);
//        administrador.escritorio.removeAll();
//        administrador.escritorio.add(docente,BorderLayout.CENTER);
//        administrador.escritorio.revalidate();
//        administrador.escritorio.repaint();
//    }
    public void showIngresarDocente(){
        ingresarDocente.setSize(1500,1500);
        ingresarDocente.setLocation(5,5);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(ingresarDocente,BorderLayout.CENTER);
        administrador.escritorio.revalidate();
        administrador.escritorio.repaint();
    }
    
    public void showEditarDocente(){
        editarDocente.setSize(1500,1500);
        editarDocente.setLocation(5,5);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(editarDocente,BorderLayout.CENTER);
        administrador.escritorio.revalidate();
        administrador.escritorio.repaint();
    }
    
}
