package pe.egcc.service;

/**
 *
 * @author Gustavo Coronel
 */
public class Clase2 extends Clase1{

  public Clase2() {
    super("Claudia");
  }
    
  @Override
  public int sumar(int n1, int n2) {
    int s;
    //s = (n1 + n2) * (n1 - n2);
    s = super.sumar(n1, n2) * (n1 - n2);
    return s;
  }
  
  
  
}
