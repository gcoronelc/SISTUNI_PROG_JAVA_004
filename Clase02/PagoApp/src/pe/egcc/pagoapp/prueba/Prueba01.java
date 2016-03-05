package pe.egcc.pagoapp.prueba;

import pe.egcc.pagoapp.dto.PagoDto;
import pe.egcc.pagoapp.service.PagoService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {
    // Data
    PagoDto dto = new PagoDto();
    dto.setHorasDia(6);
    dto.setDias(20);
    dto.setPagoHora(140.0);
    // Proceso
    PagoService pagoService = new PagoService();
    pagoService.procesar(dto);
    // Reporte
    System.out.println("Ingresos: " + dto.getIngresos());
    System.out.println("Renta: " + dto.getRenta());
    System.out.println("Neto: " + dto.getNeto());
  }
  
}
