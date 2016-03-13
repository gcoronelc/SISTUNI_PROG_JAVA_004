package pe.egcc.ventaapp.service;

/**
 *
 * @author Gustavo Coronel
 */
public final class CompFactory {

  private CompFactory() {
  }
  
  public static final String COMP_FACTURA = "FACTURA";
  public static final String COMP_BOLETA = "BOLETA";

  public static CompAbstract getComp(String tipo){
    CompAbstract bean = null;
    switch(tipo){
      case COMP_BOLETA:
        bean = new BoletaService();
        break;
      case COMP_FACTURA:
        bean = new FacturaService();
        break;
    }
    return bean;
  }
  
}
