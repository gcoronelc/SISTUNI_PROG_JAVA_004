package pe.egcc.prueba;

import pe.egcc.service.Clase1;
import pe.egcc.service.Clase2;
import pe.egcc.service.Clase3;
import pe.egcc.service.Clase4;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba05 {

  public static void main(String[] args) {
    
    Clase2 bean = new Clase2();
    
    System.out.println("Objeto de Clase2");
    System.out.println("Compatible con Object: " + (bean instanceof Object));
    System.out.println("Compatible con Clase1: " + (bean instanceof Clase1));
    System.out.println("Compatible con Clase2: " + (bean instanceof Clase2));
    System.out.println("Compatible con Clase3: " + (bean instanceof Clase3));
    System.out.println("Compatible con Clase4: " + (bean instanceof Clase4));
    
  }
  
}
