/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.davidgarciabalarezo.controller;


import pe.davidgarciabalarezo.appfb.acceder.AccessToken;
import pe.davidgarciabalarezo.service.LoggingService;

/**
 *
 * @author Computer Owner
 */
public class InfoController {
    
    public void mostrar(AccessToken at){
        System.out.println("Controlador>"+at.getAccessToken());
        LoggingService service = new LoggingService();
        service.ejecutarTodo(at.getAccessToken(),at.getAppId(),at.getAppSecret());
        
    }
    
     

}
