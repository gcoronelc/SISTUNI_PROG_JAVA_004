package cjava.model;

import cjava.entity.Item;

public class Factura extends Comprobante {

    public Factura() {
    }

    @Override
    public Item[] Procesar(double total) {
        //proceso
        double consumo = total / (1 + IGV);
        double impuesto = total - consumo;
        double servicio = total * SERVICIO;
        double totalgeneral = total + servicio;
        // preparar factura
        Item[] rpta = new Item[5];
        rpta[0] = new Item("Consumo", consumo);
        rpta[1] = new Item("Impuesto", impuesto);
        rpta[2] = new Item("Total", total);
        rpta[3] = new Item("Servicio", servicio);
        rpta[4] = new Item("Total General", totalgeneral);
        return rpta;
    }

}
