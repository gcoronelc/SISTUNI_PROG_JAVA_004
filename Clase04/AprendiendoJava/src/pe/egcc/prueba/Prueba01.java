package pe.egcc.prueba;

import java.util.Arrays;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {
    
    // Recorrido indexado
    int notas[];
    notas = new int[5];
    System.out.println("----------------");
    for (int i = 0; i < notas.length; i++) {
      int nota = notas[i];
      System.out.println(nota);
    }
    
    // Recorrido tipo colección
    String[] nombres = new String[5];
    System.out.println("----------------");
    for (String nombre : nombres) {
      System.out.println(nombre);
    }
    
    // Usando Arrays
    int[] datos = {23,8,18,15,17,18,75,13};
    Arrays.sort(datos);
    System.out.println("--------------");
    for (int n : datos) {
      System.out.println(n);
    }
    
    // Usando Lambda
    datos = new int[]{12,45,96,78,45,25};
    System.out.println("-----------------");
    Arrays.stream(datos).forEach(n -> System.out.println(n) );
    
    // Mas de lambda
    datos = new int[]{12,15,13,18,14,16,12,17,18};
    System.out.println("--------------");
    System.out.println("Promedio: " + Arrays.stream(datos).average().getAsDouble());
    System.out.println("Mayor: " + Arrays.stream(datos).max().getAsInt());
    System.out.println("Menor: " + Arrays.stream(datos).min().getAsInt());
    
    Arrays.stream(datos).filter(n -> (n>15)).forEach(n -> System.out.println(n));
  }
  
}
