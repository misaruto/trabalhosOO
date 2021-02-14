/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author misael
 */
public class Roda {

    private String marca;
    private double diametro;
    private String modelo;
    private double pesoMax;

    public Roda(){
        this.marca = "";
        this.diametro = 0.0;
        this.modelo = "";
        this.pesoMax = 0.0;
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
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
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

    public void preencher() {
        try{
        Scanner read = new Scanner(System.in);
        System.out.println("####### Preenchendo Roda ######");
        System.out.println("Digite a marca da roda:");
        this.setMarca(read.next());
        System.out.println("Digite a diametro da roda:");
        this.setDiametro(read.nextDouble());
        System.out.println("Digite o modelo da roda:");
        this.setModelo(read.next());
        System.out.println("Digite o peso maximo que a roda suporta:");
        this.setPesoMax(read.nextDouble());
        System.out.print("Roda preenchida com sucesso.");

        }catch(Exception e){
            System.out.print("Houve erro na execução: " + Arrays.toString(e.getStackTrace()) + e.getMessage() );
        }
        
    }

    public void copiar(Roda paraCopiar ){
        try{
            System.out.println("Iniciando a copia:");
            System.out.print("copiando {");
            this.setMarca(paraCopiar.getMarca());
            System.out.print("==");
            this.setDiametro(paraCopiar.getDiametro());
            System.out.print("===");
            this.setModelo(paraCopiar.getModelo());
            System.out.print("==");
            this.setPesoMax(paraCopiar.getPesoMax());
            System.out.println("===}");
            System.out.println("Copiado.");
        }catch(Exception e){
           System.out.print("Houve erro na execução: " + Arrays.toString(e.getStackTrace()) + e.getMessage() );
        }
    }
    public void imprimir(){
        System.out.println("##### Exibindo valores da Roda#####");
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Diametro: " + this.getDiametro());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Peso Maximo: " + this.getPesoMax());
         System.out.println("##################################");
    }
}
