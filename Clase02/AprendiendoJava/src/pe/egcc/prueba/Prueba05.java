package pe.egcc.prueba;

import pe.egcc.dto.Producto;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba05 {

  public static void main(String[] args) {
    Producto bean = new Producto();
    
    mostrar(bean);
    
    bean.setNombre("Coca Cola");
    bean.setPrecio(2.40);
    bean.setStock(100);
    
    mostrar(bean);
  }

  private static void mostrar(Producto bean) {
    System.out.println("-----------------------");
    System.out.println("Nombre: " + bean.getNombre());
    System.out.println("Precio: " + bean.getPrecio());
    System.out.println("Stock: " + bean.getStock());
  }
  
}
