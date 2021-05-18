/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoCuadrilatero2;

/**
 *
 * @author Garcia
 */
public class Cuadrado extends Cuadrilatero{
    private double areacuadrado;
    
    public Cuadrado(int x, int y) {
        super(x, y);
    }

    Cuadrado() {
    }

    @Override
    public void area() {
        System.out.println("-----CUADRADO-----");
        System.out.print("Ingresa el valor del lado1: ");
        x=sc.nextInt();
        System.out.print("Ingresa el valor del lado2: ");
        y=sc.nextInt();
        
        areacuadrado= (x*y); 
        System.out.println("El area del cuadrado es: "+areacuadrado+"cm^2");//To change body of generated methods, choose Tools | Templates.
        System.out.println("------------------------------------------------------------------------------------");
    }
    
}
