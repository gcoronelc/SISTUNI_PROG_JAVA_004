package pe.egcc.dto;

/**
 *
 * @author Gustavo Coronel
 */
public class Producto {

  private String nombre;
  private double precio;
  private int stock;

  /**
   * Constructor por defecto.
   * Por que no tiene parámetros
   */
  public Producto() {
    nombre = "Cristal";
    precio = 7.00;
    stock = 40;
    System.out.println("Objeto creado.");
  }

  @Override
  protected void finalize() throws Throwable {
    System.err.println("Chau objeto.");
  }
  
  
  
  /**
   * @return the nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * @param nombre the nombre to set
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * @return the precio
   */
  public double getPrecio() {
    return precio;
  }

  /**
   * @param precio the precio to set
   */
  public void setPrecio(double precio) {
    this.precio = precio;
  }

  /**
   * @return the stock
   */
  public int getStock() {
    return stock;
  }

  /**
   * @param stock the stock to set
   */
  public void setStock(int stock) {
    this.stock = stock;
  }

  

}
