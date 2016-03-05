package pe.egcc.pagoapp.controller;

import pe.egcc.pagoapp.dto.PagoDto;
import pe.egcc.pagoapp.service.PagoService;

/**
 *
 * @author Gustavo Coronel
 */
public class PagoController {

  public void procesar(PagoDto dto) {
    PagoService service = new PagoService();
    service.procesar(dto);
  }
  
  
  
}
