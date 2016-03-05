
package cjava.model;

public class Persona {
  // atributos
    private String codigo;
    private String nombre;
    private double sueldo;
    //constructor

    public Persona(String codigo, String nombre, double sueldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    // metodos
    public String MostrarDatos(){
        return "Codigo  :"+codigo +
                "\nNombre :"+nombre+
                "\nSueldo :"+sueldo;
    }
}
