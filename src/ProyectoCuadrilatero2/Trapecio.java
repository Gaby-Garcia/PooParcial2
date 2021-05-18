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
public class Trapecio extends Cuadrilatero {
    private double areatrapecio;
    private int basemenor;
    
    public Trapecio(int x, int y) {
        super(x, y);
    }

    Trapecio() {
    }
    @Override
    public void area() {
        System.out.println("-----TRAPECIO-----");
        System.out.print("Ingresa base mayor: ");
        x=sc.nextInt();
        System.out.print("Ingresa base menor: ");
        basemenor=sc.nextInt();
        System.out.print("Ingresa altura del trapecio: ");
        y=sc.nextInt();
        //To change body of generated methods, choose Tools | Templates.
        areatrapecio=((x+basemenor)/2)*y;
        System.out.println("El area del trapecio es: "+areatrapecio+"cm^2");
        System.out.println("-----------------------------------------------------------------");
    }
    
}
