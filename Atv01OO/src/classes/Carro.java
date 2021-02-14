/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author misael
 */
public class Carro {
    private String nome;
    private String motor;
    private int portas;
    private int ano;
    private String fabricante;
    

    ////Constructor
    public Carro(){
        this.nome = "";
        this.motor = "";
        this.portas = 0;
        this.ano = 0;
        this.fabricante = "";
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the motor
     */
    public String getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }

    /**
     * @return the portas
     */
    public int getPortas() {
        return portas;
    }

    /**
     * @param portas the portas to set
     */
    public void setPortas(int portas) {
        this.portas = portas;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

}
