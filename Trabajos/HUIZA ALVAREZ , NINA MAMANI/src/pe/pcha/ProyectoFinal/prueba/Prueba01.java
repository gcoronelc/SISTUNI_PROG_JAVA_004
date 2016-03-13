package pe.pcha.ProyectoFinal.prueba;

import java.util.Scanner;
public class Prueba01 {
    public static void main(String[] args) {
         
    Scanner entrada = new Scanner(System.in);
    
    double n1;
    double n2;
    double suma;
    double resta;
    double multiplicacion;
    double division;
    
    System.out.print("Inserte el Primer Numero: ");
    n1 = entrada.nextDouble();
    
    System.out.print("Inserte el Segundo Numero: ");
    n2 = entrada.nextDouble();
   
    suma = n1 + n2;
    System.out.println("La suma es:" + suma);
    
    resta = n1 - n2;
    System.out.println("La resta es:" + resta);
    
    multiplicacion = n1 * n2;
    System.out.println("La Multiplicacion es:" + multiplicacion);
    
    division = n1 / n2;
    System.out.println("La division es:" + division);
    
    }
    
}
