package cjava.model;

public class Empleado extends Persona {

    //constructor
    public Empleado(String codigo, String nombre, double sueldo, double bonificacion) {
        super(codigo, nombre, sueldo + bonificacion);
    }

    // metodo

    @Override
    public String MostrarDatos() {
        return "EMPLEADO\n" + super.MostrarDatos();
    }
}
