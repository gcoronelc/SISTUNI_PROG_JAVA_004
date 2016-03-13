/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dto;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PromedioDto {
    private double Numero1;
    private double Numero2;
    private double Numero3;
    private double Numero4;
    private double Promedio;

    public PromedioDto() {
    }

    public PromedioDto(double Numero1, double Numero2, double Numero3, double Numero4, double Promedio) {
        this.Numero1 = Numero1;
        this.Numero2 = Numero2;
        this.Numero3 = Numero3;
        this.Numero4 = Numero4;
        this.Promedio = Promedio;
    }

    public double getNumero1() {
        return Numero1;
    }

    public void setNumero1(double Numero1) {
        this.Numero1 = Numero1;
    }

    public double getNumero2() {
        return Numero2;
    }

    public void setNumero2(double Numero2) {
        this.Numero2 = Numero2;
    }

    public double getNumero3() {
        return Numero3;
    }

    public void setNumero3(double Numero3) {
        this.Numero3 = Numero3;
    }

    public double getNumero4() {
        return Numero4;
    }

    public void setNumero4(double Numero4) {
        this.Numero4 = Numero4;
    }

    public double getPromedio() {
        return Promedio;
    }

    public void setPromedio(double Promedio) {
        this.Promedio = Promedio;
    }

    
}