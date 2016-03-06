package pe.egcc.service;

/**
 *
 * @author Gustavo Coronel
 */
public class Clase1 {

  public Clase1() {
    System.out.println("Hola amigos de Gustavo.");
  }
  
  public Clase1(String nombre) {
    System.out.println("Hola " + nombre);
  }
  
  

  /**
   * Permite calcular la suma de 2 números.
   * 
   * @param n1 Número 1.
   * @param n2 Número 2.
   * @return Retorna la suma de los dos números.
   */
  public int sumar(int n1, int n2) {
    return (n1 + n2);
  }

}
