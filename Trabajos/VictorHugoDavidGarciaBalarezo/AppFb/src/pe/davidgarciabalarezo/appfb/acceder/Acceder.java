/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.davidgarciabalarezo.appfb.acceder;

import java.util.logging.LogManager;
import pe.davidgarciabalarezo.service.LoggingService;

/**
 *
 * @author DavidGarciaBalarezo(fb)
 */
public abstract class Acceder {
    //Clase a extender
  static {
    try {
      //Leer configuracion
      //LogManager.getLogManager().readConfiguration(LoggingService.class.getResourceAsStream("recursos/logging.properties"));
    } catch (Exception e) {
      //throw new IllegalStateException("No se pudo leer la configuracion inicial", e);
        System.out.println("Error en Acceder");
    }
  }
}
