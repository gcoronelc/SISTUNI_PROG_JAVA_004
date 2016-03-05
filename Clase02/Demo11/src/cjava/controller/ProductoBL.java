
package cjava.controller;

import cjava.entity.Producto;
import cjava.model.ProductoDA;

public class ProductoBL {
  // atributo
   private  ProductoDA da;

    // constructor
    public ProductoBL() {
        da=new ProductoDA();
    }
    // metodos
    public void RegistraProducto(Producto o){
      da.Registrar(o);
    }
    
    public Producto[] ListaProductos(){
        return da.Listar();
    }
    
    public void ActualizaProducto(Producto o){
       da.Modificar(o);
    }
    
    public void EliminaProducto(String cod){
        da.Elimina(cod);
    }
    
   
}
