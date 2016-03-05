package pe.egcc.mateapp.controller;

import pe.egcc.lib.Promedio;

/**
 *
 * @author Gustavo Coronel
 */
public class MateController {

  private Promedio service;

  public MateController() {
    service = new Promedio();
  }
  
  public int promediar(int n1, int n2) {
    int pr = service.promediar(n1, n2);
    return pr;
  }
  
}
