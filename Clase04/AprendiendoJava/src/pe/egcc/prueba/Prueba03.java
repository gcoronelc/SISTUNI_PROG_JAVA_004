package pe.egcc.prueba;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba03 {

  public static void main(String[] args) {
    Map<String,Object> venta;
    venta = new HashMap<>();
    
    venta.put("cliente", "Gustavo Coronel");
    venta.put("ruc", "10236547892");
    venta.put("importe", 3678.50);
    venta.put("impuesto", 3678.50);
    venta.put("total", 3678.50);
    venta.put("cliente", "Juan Perez");
    
    
    for(String key: venta.keySet()){
      System.out.println(key + " | " + venta.get(key).toString());
    }
    
  }
  
}
