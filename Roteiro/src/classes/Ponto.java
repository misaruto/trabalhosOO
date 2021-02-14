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
public class Ponto {

    private double x;
    private double y;

    public Ponto() {
        this.x = 0.0;
        this.y = 0.0;
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * @see all values
     */
    public void showValues() {
        System.out.println("(X: " + this.getX() + ", Y: " + this.getY() + ")");
    }

    /**
     *
     * @param outroPonto
     * @return the distance between points
     */
    public double distance( Ponto otherPoint) {
        double deltaX = otherPoint.getX() - this.getX();
        double deltaY = otherPoint.getY() - this.getY();

        deltaX = deltaX * deltaX;
        deltaY = deltaY * deltaY;

        double finalDistance = Math.sqrt(deltaX + deltaY);

        return finalDistance;
    }

    public double determinant(Ponto otherPoint, Ponto anotherPoint) {

        double part1 = (this.getX() * otherPoint.getY() * 1)
                + (otherPoint.getX() * anotherPoint.getY() * 1)
                + (this.getY() * 1 * anotherPoint.getX());

        double part2 = (anotherPoint.getX() * otherPoint.getY() * 1)
                + (otherPoint.getX() * this.getY() * 1)
                + (anotherPoint.getY() * 1 * this.getX());
        
        double determinatValue = part1 - part2;
        
        return determinatValue;
    }

    public void copy(Ponto other){
        this.x = other.getX();
        this.y = other.getY();
    }
    public void preencher(){
        Scanner read = new Scanner(System.in);
        
        System.out.println("Preenchendo ponto: ");
        System.out.println("X: ");
        this.x = read.nextDouble();
        System.out.println("y: ");
        this.y = read.nextDouble();
    }
    public void imprimir(){
        System.out.print("Coodernadas do ponto: X: "+this.x +" Y: "+this.y);
    }
}
