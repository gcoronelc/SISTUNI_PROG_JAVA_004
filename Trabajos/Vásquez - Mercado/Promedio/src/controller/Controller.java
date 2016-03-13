/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.PromedioDto;
import service.PromedioService;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Controller {

    public double promedio(double numero1, double numero2, double numero3, double numero4) {
        double result;
        PromedioDto promediodto = new PromedioDto();
        promediodto.setNumero1(numero1);
        promediodto.setNumero2(numero2);
        promediodto.setNumero3(numero3);
        promediodto.setNumero4(numero4);
        PromedioService prom = new PromedioService();
        result=prom.promedio(promediodto);
        return(result);
    }
}
