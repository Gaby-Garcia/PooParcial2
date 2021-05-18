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
public class Rectangulo extends Cuadrilatero {
    private double arearectangulo;
    
    public Rectangulo(int x, int y) {
        super(x, y);
    }

    Rectangulo() {
    }

    @Override
    public void area() {
        System.out.println("-----RECTANGULO-----");
        System.out.print("Ingresa base: ");
        x=sc.nextInt();
        System.out.print("Ingresa altura: ");
        y=sc.nextInt();
      arearectangulo= (x*y);
        System.out.println("El area del Rectangulo es: "+arearectangulo+"cm^2"); //To change body of generated methods, choose Tools | Template
        System.out.println("---------------------------------------------------------------------------------");
    }
    
}
