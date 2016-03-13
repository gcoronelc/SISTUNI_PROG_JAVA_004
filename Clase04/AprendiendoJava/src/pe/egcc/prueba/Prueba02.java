package pe.egcc.prueba;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02 {

  public static void main(String[] args) {
    
    // Lista generica
    List lista1 = new ArrayList();
    lista1.add(34);
    lista1.add(34.56);
    lista1.add("2222");
    lista1.add(2345L);
    lista1.add('E');
    lista1.add(new Random());
    System.out.println("Lista generica");
    for (int i = 0; i < lista1.size(); i++) {
      Object dato = lista1.get(i);
      System.out.println(dato);
    }
    
    // Lista tificada
    List<String> lista2 = new ArrayList<>();
    lista2.add("LOS PROFES");
    lista2.add("GUSTAVO");
    lista2.add("HUGO");
    lista2.add("SERGIO");
    System.out.println("---------------");
    for (String dato : lista2) {
      System.out.println(dato);
    }
    
  }
  
}
