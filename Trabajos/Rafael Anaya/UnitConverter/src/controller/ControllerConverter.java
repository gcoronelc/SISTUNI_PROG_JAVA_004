/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import lib.LibCalcFlow;
import service.ServiceConverter;

/**
 *
 * @author RAFAEL
 */
public class ControllerConverter {
    public double Temperature(double conv, String unit1,String unit2){
    return ServiceConverter.Temperature(conv,unit1,unit2);
    }
    public double Flow (double convf,String unitf1,String unitf2){
    return ServiceConverter.Flow(convf, unitf1, unitf2);
    }
    public double Pressure (double convp,String unitp1,String unitp2){
    return ServiceConverter.Pressure(convp, unitp1, unitp2);
    }
    
    private LibCalcFlow service;
    public ControllerConverter(){
    service = new LibCalcFlow();
    }
    public double CalculingFlow( double vol,double time){
    double caudal = service.Calc(vol, time);
    return caudal;
    }
    public double CalculingFlow (double cv,double hpress, double lpress, double gravedad){
    double caudal = service.Calc(cv, lpress, hpress, gravedad );
    return caudal;
    }
    public double CalculingFlow (double constan, double hpress, double lpress){
    double caudal = service.Calc(constan, lpress, hpress);
        return caudal;
    }
}
