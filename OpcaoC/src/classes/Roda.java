/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Scanner;

/**
 *
 * @author misael
 */
public class Roda {

    private double diametro;
    private double pesoMax;
    private String marca;

    public Roda() {

        this.diametro = 0.0;
        this.pesoMax = 0.0;
        this.marca = "";

    }

    /**
     * @return the diametro
     */
    public double getDiametro() {
        return diametro;
    }

    /**
     * @param diametro the diametro to set
     */
    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    /**
     * @return the pesoMax
     */
    public double getPesoMax() {
        return pesoMax;
    }

    /**
     * @param pesoMax the pesoMax to set
     */
    public void setPesoMax(double pesoMax) {
        this.pesoMax = pesoMax;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void preencher() {
        try {
            Scanner read = new Scanner(System.in);
            System.out.println("##### Preencha Roda #####");
            System.out.print("Marca: ");
            this.marca = read.next();
            System.out.print("\nDiametro: ");
            this.diametro = read.nextDouble();
            System.out.print("\nPeso Maximo: ");
            this.pesoMax = read.nextDouble();
            System.out.println("Roda preenchida");
        } catch (Exception e) {
            System.out.println("Erro ao preencher roda, mensagem: " + e.getMessage() + "Causa: " + e.getCause());
        }
    }
    public void imprimir(){
        System.out.println("### Imprimindo Roda ###");
        System.out.println("Marca: "+this.marca);
        System.out.println("Diametro: "+this.diametro);
        System.out.println("Peso Maximo: "+this.pesoMax);
    }
    public void copiar(Roda outra){
        try{
            System.out.println("### Copiando Roda ###");
           System.out.print("{=");
            this.marca = outra.getMarca();
            System.out.print("===");
            this.pesoMax = outra.getPesoMax();
            System.out.print("===");
            this.diametro = outra.getDiametro();
            System.out.println("===}");
            System.out.println("### Roda Copiada ###");
                    
        }catch(Exception e){
               System.out.println("Erro ao copiar roda, mensagem: " + e.getMessage() + "Causa: " + e.getCause());
        }
    }
}
