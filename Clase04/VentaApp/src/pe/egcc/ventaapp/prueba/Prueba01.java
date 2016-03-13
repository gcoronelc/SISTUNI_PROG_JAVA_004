package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.dto.ItemDto;
import pe.egcc.ventaapp.service.BoletaService;
import pe.egcc.ventaapp.service.CompAbstract;
import pe.egcc.ventaapp.service.FacturaService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    double total = 5670.00;
    CompAbstract comp = new BoletaService();
    for(ItemDto dto: comp.procesar(total)){
      String texto;
      texto = dto.getConcepto() + " | " + dto.getValor();
      System.out.println(texto);
    }
  }
}
