package pe.egcc.service;

/**
 *
 * @author Gustavo Coronel
 */
public class Matematica {

  public int promediar(int n1, int n2) {
    System.err.println("Caso 1");
    int pr;
    pr = (n1 + n2) / 2;
    return pr;
  }
  
  public long promediar(long n1, long n2) {
    System.err.println("Caso 4");
    long pr;
    pr = (n1 + n2) / 2;
    return pr;
  }

  public double promediar(double n1, double n2) {
    System.err.println("Caso 2");
    double pr;
    pr = (n1 + n2) / 2;
    return pr;
  }

  public float promediar(float n1, float n2) {
    System.err.println("Caso 3");
    float pr;
    pr = (n1 + n2) / 2;
    return pr;
  }
  
}
