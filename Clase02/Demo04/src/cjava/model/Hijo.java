package cjava.model;

public class Hijo extends Padre {

    // constructor

    public Hijo() {
        super();
        System.out.println("Netbeans es un IDE para java ");
    }

    // metodo

    @Override
    public void Mensaje() {
        System.out.println("Eclipse es otro IDE para java");
    }

}
