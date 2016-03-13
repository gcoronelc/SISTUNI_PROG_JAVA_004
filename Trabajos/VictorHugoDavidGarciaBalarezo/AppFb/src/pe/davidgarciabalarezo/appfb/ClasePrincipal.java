/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.davidgarciabalarezo.appfb;

import pe.davidgarciabalarezo.appfb.acceder.TestUser;
import pe.davidgarciabalarezo.view.AccesoView;

/**
 *
 * @author Computer Owner
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */       
    
             
             
    public static void main(String[] args) {
        try{
            AccesoView.main(null);                                     
       }
        catch(Exception e){
            System.out.println("Error al levantar vista");
        }
        
    }
    
}
