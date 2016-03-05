package cjava.beans;

public class Profesor extends Persona {

    private String categoria;
    private double sueldo;

    public Profesor() {
    }

    public Profesor(String categoria, double sueldo, String nombre,int edad, boolean genero) {
        super(nombre, edad, genero);
        this.categoria = categoria;
        this.sueldo = sueldo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void calcularSueldo() {
        //categoria = A  --> sueldo 1200
        //categoria = B  --> sueldo 900
        setSueldo(getCategoria().equals("A") ? 1200 : 900);
    }

}
