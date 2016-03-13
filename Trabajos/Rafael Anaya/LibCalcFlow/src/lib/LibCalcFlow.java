/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

/**
 *
 * @author RAFAEL
 */
public class LibCalcFlow {
    public double Calc(double vol, double time){
    double caudal;
    caudal = vol/time;
    return caudal;         
    }
    public double Calc(double k,double pressL,double pressH ){
    double caudal;
    caudal = k*(Math.sqrt(pressH-pressL));
    return caudal;
    }
    public double Calc(double cv,double pressL,double pressH,double grav){
    double caudal;
    caudal = 2140 *( cv*(Math.sqrt(pressH-pressL/grav)));
    return caudal;
    }
}
