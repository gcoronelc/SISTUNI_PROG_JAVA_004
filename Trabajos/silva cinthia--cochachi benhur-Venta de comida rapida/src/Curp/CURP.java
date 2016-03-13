/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Curp;

import Admi.datos;
import javax.swing.JOptionPane;
import Curp.Ventana1;
import Curp.CURP;
import Curp.main;
/**
 *
 * @author BENHUR
 */
public class CURP {
    private Object txt1;
    private Object txt2;
    private Object txt3;
    private Object txt4;
    public CURP(){
        }
    String sexo="";
    String experiencia="";
   
  
        Integer dia=0, año=0, mes=0;
        public void getFecha(String a,String b,String c){
            dia=Integer.parseInt(a);
              mes=Integer.parseInt(b);
                año=Integer.parseInt(c);
            
        }
        public void getsexo(String radio){
            sexo=radio;}
            public void getexperiencia(String lado){
                experiencia=lado;
            }
        
    
        
        public void mostrardatos(){
        
            JOptionPane.showMessageDialog(null,"Su sexo es:"+sexo);
            JOptionPane.showMessageDialog(null,"su fecha de nacimiento es:"+dia+"-"+mes+"-"+año);
            JOptionPane.showMessageDialog(null,"Tiene experiencia laboral:"+experiencia);
           
          
           
             
        
           
             
        }

    
    }
    

