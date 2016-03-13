/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author RAFAEL
 */
public class ServiceConverter {
    //String unit1,unit2;
    
    public static double Temperature(double num, String unit1,String unit2){
     double conv=0.0;
     if("Celsius".equals(unit1) && "Kelvin".equals(unit2)){ 
     conv =  num+273.15;
     }
      if("Celsius".equals(unit1) && "Celsius".equals(unit2)){
      conv=num;
      }
      if("Celsius".equals(unit1) && "Fahrenheit".equals(unit2)){
      conv= (num*1.8)+32.0;
      }
      if("Kelvin".equals(unit1) && "Celsius".equals(unit2)){ 
     conv =  num - 273.15;
     }
      if("Kelvin".equals(unit1) && "Kelvin".equals(unit2)){
      conv=num;
      }
      if("Kelvin".equals(unit1) && "Fahrenheit".equals(unit2)){
      conv= (num*1.8)-459.67;
      }
      if("Fahrenheit".equals(unit1) && "Celsius".equals(unit2)){ 
     conv =  (num-32)/1.8;
     }
      if("Fahrenheit".equals(unit1) && "Fahrenheit".equals(unit2)){
      conv=num;
      }
      if("Fahrenheit".equals(unit1) && "Kelvin".equals(unit2)){
      conv= (num+459.67)/1.8;
      }
      return conv;
    }
    public static double Flow (double numf,String unitf1, String unitf2){
    double convf=0.0;
    if("Bpd(us)".equals(unitf1)&&"M3h".equals(unitf2)){
    convf=numf*0.0049683517497361735;
    }
    if("Bpd(us)".equals(unitf1)&&"Gpm(us)".equals(unitf2)){
    convf = numf*0.021874996718856846;
    }
    if("Bpd(us)".equals(unitf1)&&"L/h".equals(unitf2)){
    convf= numf*4.968351749736173;
    }
    if("Bpd(us)".equals(unitf1)&&"Bpd(us)".equals(unitf2)){
    convf= numf;
    }
    //M3h
    if("M3h".equals(unitf1)&&"M3h".equals(unitf2)){
    convf=numf;
    }
    if("M3h".equals(unitf1)&&"Gpm(us)".equals(unitf2)){
    convf = numf*4.40286795716878;
    }
    if("M3h".equals(unitf1)&&"L/h".equals(unitf2)){
    convf= numf*999.99999999999;
    }
    if("M3h".equals(unitf1)&&"Bpd(us)".equals(unitf2)){
    convf= numf*204.52025996632167;
    }
    //Gpm
    if("Gpm(us)".equals(unitf1)&&"M3h".equals(unitf2)){
    convf=numf*0.2271247;
    }
    if("Gpm(us)".equals(unitf1)&&"Gpm(us)".equals(unitf2)){
    convf = numf;
    }
    if("Gpm(us)".equals(unitf1)&&"L/h".equals(unitf2)){
    convf= numf*227.12468548410425;
    }
    if("Gpm(us)".equals(unitf1)&&"Bpd(us)".equals(unitf2)){
    convf= numf*46.45159971997805;
    }
    //L/h
    if("L/h".equals(unitf1)&&"M3h".equals(unitf2)){
    convf=numf*0.001000000000000002;
    }
    if("L/h".equals(unitf1)&&"Gpm(us)".equals(unitf2)){
    convf = numf*0.0044028679957168781;
    }
    if("L/h".equals(unitf1)&&"L/h".equals(unitf2)){
    convf= numf;
    }
    if("L/h".equals(unitf1)&&"Bpd(us)".equals(unitf2)){
    convf= numf*0.2045202599663217;
    }
    return convf;    
    }
    public static double Pressure (double nump,String unitp1, String unitp2){
    double convp=0.0;
    if("Pascal".equals(unitp1) && "inchH2O".equals(unitp2)){
    convp= nump*0.00401864652;
    }
    if("Pascal".equals(unitp1) && "Pascal".equals(unitp2)){
    convp= nump;
    }
    if("Pascal".equals(unitp1)&&"PSI".equals(unitp2)){
    convp=nump * 0.000145;
    }
    if("Pascal".equals(unitp1)&&"Bar".equals(unitp2)){
    convp=nump *0.00001;
    }
    if("Pascal".equals(unitp1)&&"Atm".equals(unitp2)){
    convp=nump*0.00001 ;
    }
    //inchH20
     if("inchH2O".equals(unitp1) && "inchH2O".equals(unitp2)){
    convp= nump;
    }
    if("inchH2O".equals(unitp1) && "Pascal".equals(unitp2)){
    convp= nump*248.84;
    }
    if("inchH2O".equals(unitp1)&&"PSI".equals(unitp2)){
    convp=nump *0.036091192191399925;
    }
    if("inchH2O".equals(unitp1)&&"Bar".equals(unitp2)){
    convp=nump *0.0024884;
    }
    if("inchH2O".equals(unitp1)&&"Atm".equals(unitp2)){
    convp=nump*0.00245585986 ;
    }
    //Psi
    if("PSI".equals(unitp1) && "inchH2O".equals(unitp2)){
    convp= nump*27.707591223276;
    }
    if("PSI".equals(unitp1) && "Pascal".equals(unitp2)){
    convp= nump*6894.7570;
    }
    if("PSI".equals(unitp1)&&"PSI".equals(unitp2)){
    convp=nump;
    }
    if("PSI".equals(unitp1)&&"Bar".equals(unitp2)){
    convp=nump *0.06894757;
    }
    if("PSI".equals(unitp1)&&"Atm".equals(unitp2)){
    convp=nump*0.068045961017 ;
    }
    //Bar
    if("Bar".equals(unitp1) && "inchH2O".equals(unitp2)){
    convp= nump*401.8646519852;
    }
    if("Bar".equals(unitp1) && "Pascal".equals(unitp2)){
    convp= nump*100000;
    }
    if("Bar".equals(unitp1)&&"PSI".equals(unitp2)){
    convp=nump*14.50377438973;
    }
    if("Bar".equals(unitp1)&&"Bar".equals(unitp2)){
    convp=nump ;
    }
    if("Bar".equals(unitp1)&&"Atm".equals(unitp2)){
    convp=nump*0.98692327;
    }
    //Atm
    if("Atm".equals(unitp1) && "inchH2O".equals(unitp2)){
    convp= nump*407.1893586240154;
    }
    if("Atm".equals(unitp1) && "Pascal".equals(unitp2)){
    convp= nump*101325;
    }
    if("Atm".equals(unitp1)&&"PSI".equals(unitp2)){
    convp=nump*14.6959495;
    }
    if("Atm".equals(unitp1)&&"Bar".equals(unitp2)){
    convp=nump*1.01325 ;
    }
    if("Atm".equals(unitp1)&&"Atm".equals(unitp2)){
    convp=nump;
    }
    return convp;    
    }
   
}
