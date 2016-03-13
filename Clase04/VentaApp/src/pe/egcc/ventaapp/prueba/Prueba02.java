package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.dto.ItemDto;
import pe.egcc.ventaapp.service.CompAbstract;
import pe.egcc.ventaapp.service.CompFactory;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02 {
  
  public static void main(String[] args) {
    double total = 5670.00;
    CompAbstract comp;
    comp = CompFactory.getComp(CompFactory.COMP_FACTURA);
    for(ItemDto dto: comp.procesar(total)){
      String texto;
      texto = dto.getConcepto() + " | " + dto.getValor();
      System.out.println(texto);
    }
  }
}
