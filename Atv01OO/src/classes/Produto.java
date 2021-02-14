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
public class Produto {

    private String nome;
    private String marca;
    private String codigoDeBarras;
    private String categoria;
    private double precoDeVenda;

    ///Constructor
    public Produto() {
        this.nome = "";
        this.marca = "";
        this.codigoDeBarras = "";
        this.categoria = "";
        this.precoDeVenda = 0.0;

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
     * @return the codigoDeBarras
     */
    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    /**
     * @param codigoDeBarras the codigoDeBarras to set
     */
    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the precoVenda
     */
    public double getPrecoDeVenda() {
        return precoDeVenda;
    }

    /**
     * @param precoVenda the precoVenda to set
     */
    public void setPrecoDeVenda(double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

}
