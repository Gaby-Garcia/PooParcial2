/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoCuadrilatero2;

import java.util.Scanner;

/**
 *
 * @author Garcia
 */
public abstract class Cuadrilatero {
    int x;
    int y;
   public Scanner sc= new Scanner(System.in);
   
   public Cuadrilatero(){
   }

    public Cuadrilatero(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return  x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public abstract void area();
}
