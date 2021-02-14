/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import classes.Roda;
import java.util.Scanner;

/**
 *
 * @author misael
 */
public class Carro {

    private String marca;
    private String modelo;
    private Roda rodas[] = new Roda[4];
    private String cor;

    public Carro() {
        this.marca = "";
        this.modelo = "";
        this.cor = "";
        for (int i = 0; i < 4; i++) {
            this.rodas[i] = new Roda();
        }
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
     * @return the rodas
     */
    public Roda[] getRodas() {
        return rodas;
    }

    /**
     * @param rodas the rodas to set
     */
    public void setRodas(Roda[] rodas) {
        this.rodas = rodas;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void preencer() {
        try {
            Scanner read = new Scanner(System.in);
            System.out.println("##### Preencha Carro #####");
            System.out.print("Marca: ");
            this.marca = read.next();
            System.out.print("\nModelo: ");
            this.modelo = read.next();
            System.out.print("\nCor: ");
            this.cor = read.next();
            System.out.print("\n");
            this.rodas[0].preencher();
            System.out.println("Todas as rodas são iguais? (digite sim ou não)");
            String opt = read.next().toLowerCase();
            if (opt.equals("s") || opt.equals("sim") || opt.equals("1")) {
                for (int i = 1; i < 4; i++) {
                    this.rodas[i].copiar(this.rodas[0]);
                }
            } else {
                for (int i = 1; i < 4; i++) {
                    this.rodas[i].preencher();
                }
            }
            System.out.println("Roda preenchida");
        } catch (Exception e) {
            System.out.println("Erro ao preencher carro, mensagem: " + e.getMessage() + "Causa: " + e.getCause());
        }
    }

    public void imprimir() {
        System.out.println("### Imprimindo Carro ###");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        for (int i = 0; i < 4; i++) {
            System.out.println("Roda N°:" + i);
            this.rodas[i].imprimir();
        }
    }

    public void copiar(Carro outro) {
        try {
            System.out.println("### Copiando carro ###");

            this.marca = outro.getMarca();

            this.modelo = outro.getModelo();

            this.cor = outro.getCor();
            for(int i = 0;i<4; i++){
                this.rodas[i].copiar(outro.getRodas()[i]);
              
            }
            System.out.println("### Carro copiado Copiada ###");

        } catch (Exception e) {
            System.out.println("Erro ao copiar carro, mensagem: " + e.getMessage() + "Causa: " + e.getCause());
        }
    }
}
