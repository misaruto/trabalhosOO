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
public class Triangle {

    private Ponto pontos[] = new Ponto[3];

    public Triangle() {
        for (int i = 0; i < 3; i++) {
            this.pontos[i] = new Ponto();
        }
    }

    /**
     * @return the pontos
     */
    public Ponto[] getPontos() {
        return this.pontos;
    }

    /**
     * @param pontos the pontos to set
     */
    public void setPontos(Ponto[] pontos) {
        this.pontos = pontos;
    }

    public boolean isCollinear() {

        return pontos[0].determinant(pontos[1], pontos[2]) == 0;
    }

    private double[] distancias() {
        double distancia[] = new double[3];
        distancia[0] = this.pontos[0].distance(this.pontos[1]);

        distancia[1] = this.pontos[1].distance(this.pontos[2]);

        distancia[2] = this.pontos[2].distance(this.pontos[0]);
        
        return distancia;

    }

    public double triangleArea() {
        double det = pontos[0].determinant(pontos[1], pontos[2]);
        double area = 0;

        if (det != 0) {
            area = det / 2.0;
        }
        return area;
    }

    public double trianglePerimeter() {
        double perimeter = 0;

        if (!this.isCollinear()) {
            double distancias[] = this.distancias();
            perimeter = distancias[0] + distancias[1] + distancias[2];

        }

        return perimeter;

    }

    public String type() {

        if (!isCollinear()) {
            String[] types = {"equilatero", "isóceles", "escaleno"};
            double side1 = pontos[0].distance(pontos[1]);

            double side2 = pontos[1].distance(pontos[2]);

            double side3 = pontos[2].distance(pontos[0]);

            int indice;

           
            boolean isSide1EqualSide2 = side1 == side2;
            boolean isSide1EqualSide3 = side1 == side3;
            boolean isSide2EqualSide3 = side2 == side3;

            if (isSide1EqualSide2 && isSide1EqualSide3 && isSide2EqualSide3) {
                indice = 0;
            } else if (isSide1EqualSide2 || isSide2EqualSide3 || isSide1EqualSide3) {
                indice = 1;
            } else {
                indice = 2;
            }

           return types[indice];
            
        } else {
            return "";
        }
    }

    public void preencher() {
        System.out.println("Preenchendo o triangulo.");
        int num;
        for (int i = 0; i < 3; i++) {
            num = i + 1;
            System.out.println("Ponto " + num);
            pontos[i].preencher();
        }
        
    }
public void imprimir() {
        System.out.println("Triangulo: ");
        int num = 0;
        for (int i = 0; i < 3; i++) {
            num = i + 1;
            System.out.print("Ponto: " + num);
            this.pontos[i].imprimir();
            System.out.println();
        }
    }
}
