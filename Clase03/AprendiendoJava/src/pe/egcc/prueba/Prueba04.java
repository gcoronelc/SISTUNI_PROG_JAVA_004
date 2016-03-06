package pe.egcc.prueba;

import pe.egcc.service.AbstractMate;
import pe.egcc.service.Mate1;
import pe.egcc.service.Mate2;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba04 {

  public static void main(String[] args) {
    AbstractMate mate = new Mate2();
    System.out.println("8 + 2 = " + mate.suma(8, 2) );
  }
  
}
