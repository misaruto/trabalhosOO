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
public class Quadrado {

    private Ponto pontos[] = new Ponto[4];

    public Quadrado() {
        for (int i = 0; i < 0x4; i++) {
            this.pontos[i] = new Ponto();
        }
    }

    /**
     * @return the pontos
     */
    public Ponto[] getPontos() {
        return pontos;
    }

    /**
     * @param pontos the pontos to set
     */
    public void setPontos(Ponto[] pontos) {
        this.pontos = pontos;
    }

    public void imprimir() {
        System.out.println("Quadrado: ");
        int num = 0;
        for (int i = 0; i < 4; i++) {
            num = i + 1;
            System.out.print("Ponto: " + num);
            this.pontos[i].imprimir();
            System.out.println();
        }
    }

    private double[] distancias() {
        double distancia[] = new double[4];

        distancia[0] = pontos[0].distance(pontos[1]);
        System.out.println(distancia[0]);
        distancia[1] = pontos[1].distance(pontos[2]);
        System.out.println(distancia[1]);
        distancia[2] = pontos[2].distance(pontos[3]);
        System.out.println(distancia[2]);
        distancia[3] = pontos[3].distance(pontos[0]);
        System.out.println(distancia[3]);
        return distancia;

    }

    public double perimetro() {

        double perimetro = 0;
        if (this.isQuadrado()) {
            double distancias[] = this.distancias();
            for (int i = 0; i < 4; i++) {
                perimetro = perimetro + distancias[i];
            }
        }

        return perimetro;
    }

    public double area() {
        double area = 0;
        if (this.isQuadrado()) {
            double distancias[] = this.distancias();
            area = distancias[0] * distancias[1];
        }
        return area;
    }

    public boolean isQuadrado() {
        double distancias[] = this.distancias();
        //se a distancia for diferente de 0 então é uma distancia valida;
        boolean isQuadrado = distancias[0] != 0;
        for (int i = 1; i < 4; i++) {
            //verofica se a distancia valida é igual as outras. se uma for diferente isQuadrado passa a ser false
            //pois para ser um quadrado todas as distancias tem que ser iguais  
            isQuadrado = isQuadrado && (distancias[0] == distancias[i]);
        }
        return isQuadrado;
    }

    public void preencher() {
        System.out.println("Preenchendo o quadrado.");
        int num;
        for (int i = 0; i < 4; i++) {
            num = i + 1;
            System.out.println("Ponto " + num);
            pontos[i].preencher();
        }
        System.out.println("Preenchido");

        if (!this.isQuadrado()) {
            System.out.println("Os valores digitados não são de um quadrado.");
            System.out.println("Preencha novamente");
            this.imprimir();
            this.preencher();
        }
    }
}
