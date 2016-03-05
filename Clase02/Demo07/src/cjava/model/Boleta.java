

package cjava.model;

import cjava.entity.Item;

public class Boleta extends Comprobante{

    //constructor
    public Boleta() {
    }    
    // metodo
    @Override
    public Item[] Procesar(double total) {
       //proceso
        double servicio=total*SERVICIO;
        double totalgeneral=total+servicio;
        // preparar boleta
        Item[] rpta=new Item[3];
        rpta[0]=new Item("Total",total);
        rpta[1]=new Item("Servicio",servicio);
        rpta[2]=new Item("Total General",totalgeneral);
        return rpta;
    }
    
}
