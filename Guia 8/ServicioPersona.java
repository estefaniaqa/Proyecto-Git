/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entity.Persona;

/**
 *
 * @author play_
 */
public class ServicioPersona {
    
    public void mostrarAtributos(Persona variable ){
        
        System.out.println("El nombre es :" + variable.getNombre() + "y la edad es :" + variable.getEdad());
        
    }
    
}
