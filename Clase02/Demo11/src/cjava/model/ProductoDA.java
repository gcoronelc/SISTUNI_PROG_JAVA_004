package cjava.model;

import cjava.entity.Producto;

public class ProductoDA {

    //campos
    private Producto[] lista;
    private static int cont;
    private final int MAXIMO = 100;

    // CONSTRUCTOR
    public ProductoDA() {
        lista = new Producto[MAXIMO];
        cont = 0;
    }

    // metodos para procesos
    public void Registrar(Producto p) {
        p.setIdproducto("PR00" + (cont + 1));
        lista[cont] = p;
        cont++;
    }

    public Producto[] Listar() {
        Producto[] lista1;
        if (cont == MAXIMO) {
            lista1 = lista;
        } else {
            lista1 = new Producto[cont];
            System.arraycopy(lista, 0, lista1, 0, cont);
        }
        return lista1;
    }

    public void Modificar(Producto p) {
        int index = 0;
        for (Producto o : lista) {
            if (o.getIdproducto().equals(p.getIdproducto())) {
                lista[index] = p;// actualiza 
                return;
            }
            index++;
        }
    }

    public void Elimina(String cod) {

        for (int i = 0; i < cont; i++) {
            if (lista[i].getIdproducto().equals(cod)) {
                for (int j = i; j < cont+1 ; j++) {
                    lista[j] = lista[j + 1];
                }
                cont--; 
                return;
            }            
        }
       
    }

}
