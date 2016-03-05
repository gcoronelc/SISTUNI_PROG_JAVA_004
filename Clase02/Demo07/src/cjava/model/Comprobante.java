

package cjava.model;

import cjava.entity.Item;

public abstract class Comprobante {
  //constante
    public static final double IGV=0.18;
    public static final double SERVICIO=0.10;
    
    //constructor
    public Comprobante() {
    }
   // metodo
    public abstract Item[] Procesar(double total);      
       
}
