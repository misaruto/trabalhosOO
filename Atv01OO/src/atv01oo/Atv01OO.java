/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv01oo;

import classes.Carro;
import classes.Produto;
import classes.Roda;


/**
 *
 * @author misael
 */
public class Atv01OO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      Roda r1,r2;
      r1= new Roda();
      r2 = new Roda();
      r1.preencher();
      r2.copiar(r1);
      r2.imprimir();
    }
    
}
