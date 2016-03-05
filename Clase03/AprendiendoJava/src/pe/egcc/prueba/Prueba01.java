package pe.egcc.prueba;

import pe.egcc.service.Matematica;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {
    Matematica bean = new Matematica();
    System.out.println("Prom. de 5 y 6: " + bean.promediar(5, 6));
    System.out.println("Prom. de 5L y 6L: " + bean.promediar(5L, 6L));
    System.out.println("Prom. de 5.0 y 6: " + bean.promediar(5.0, 6));
    System.out.println("Prom. de 5.0 y 6.0: " + bean.promediar(5.0, 6.0));
    System.out.println("Prom. de 5.0f y 6.0f: " + bean.promediar(5.0f, 6.0f));
  }
  
}
