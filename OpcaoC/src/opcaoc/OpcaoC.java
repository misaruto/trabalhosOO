/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opcaoc;
import classes.Carro;
/**
 *
 * @author misael
 */
public class OpcaoC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro c2 = new Carro();
        carro.preencer();
        carro.imprimir();
        c2.copiar(carro);
        c2.imprimir();
    }
    
}
