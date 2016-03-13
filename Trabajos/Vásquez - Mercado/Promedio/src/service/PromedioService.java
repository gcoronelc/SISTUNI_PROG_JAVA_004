package service;

import dto.PromedioDto;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PromedioService {

    public double promedio(PromedioDto promediodto) {
        double numero1, numero2, numero3, numero4,menor1,menor2,result;       
        numero1 = promediodto.getNumero1();
        numero2 = promediodto.getNumero2();
        numero3 = promediodto.getNumero3();
        numero4 = promediodto.getNumero4();

        if (numero1 <= numero2) {
            menor1 = numero1;
        } else {
            menor1 = numero2;
        }
        if (numero3 <= numero4) {
            menor2 = numero3;
        } else {
            menor2 = numero4;
        }
        if (menor1 <= menor2) {
            result = (numero1 + numero2 + numero3 + numero4 - menor1) / 3;
        } else {
            result = (numero1 + numero2 + numero3 + numero4 - menor2) / 3;
        }
        return (result);
    }
}
