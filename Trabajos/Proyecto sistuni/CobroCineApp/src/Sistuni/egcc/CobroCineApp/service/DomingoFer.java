/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistuni.egcc.CobroCineApp.service;

/**
 *
 * @author Diego
 */
public class DomingoFer extends CineService{
    
    @Override
    public void setPrecio(){
        precio=12;
    }
    
    @Override
    public void setPrecio(String tipo){
        
        if(tipo.equals("3d"))
            precio=18.5f;
        if(tipo.equals("4d"))
            precio=40;
    }
    
}
