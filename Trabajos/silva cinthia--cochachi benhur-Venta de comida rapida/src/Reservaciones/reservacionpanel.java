
package Reservaciones;

import javax.swing.JOptionPane;
import Reservaciones.mesa1;
import Reservaciones.mesa2;
import Reservaciones.mesa3;
import Reservaciones.mesa4;


public class reservacionpanel {
   
    public reservacionpanel(int n1,int n2,int n3,int n4){
    int n=0,p=0;
    if(n>=1 && n<=14)
   
{
    n=n1+n2+n3+n4;
    p=14-n;
        JOptionPane.showMessageDialog(null,"el numero de mesas disponnibles es:"+p);
    }else{
        JOptionPane.showMessageDialog(null,"mesas insuficientes");
    }
    }      
}
