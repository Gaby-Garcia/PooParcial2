
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2;
import java.util.Scanner;
/**
 *
 * @author Garcia
 */
public class Operaciones {
  Scanner sc = new Scanner(System.in);

int [] poli1 = new int [10];
int [] poli2 = new int [10];
int [] grado1 = new int [10];
int [] grado2 = new int [10];
int [] resultado=new int [10];

public void Ingresarnumeros(){
    System.out.println("Ingresa el primer polinomio");
    for (int i = 0; i < 4; i++) {
    System.out.print("Ingresa el coeficiente: ");  
    poli1[i]=sc.nextInt();
    System.out.print("ingresa el grado: ");
    grado1[i]=sc.nextInt();
      
    }
    System.out.println("---------------------------------------------------");
    System.out.println("Ingresa el segundo polinomio");
    for (int j = 0; j < 4; j++) {
    System.out.print("Ingresa el coeficiente: ");  
    poli2[j]=sc.nextInt();
    System.out.print("ingresa el grado: ");
    grado2[j]=sc.nextInt();
    }
   } 
public void sumapolinomios(){
    System.out.println("---SUMA DE POLINOMIOS---");
    for (int i = 0; i < 4; i++) {
               System.out.println("  "+poli1[i]+"x^"+grado1[i]+ " \n+ "+poli2[i]+"x^"+grado2[i]); 
                resultado[i]= poli1[i] + poli2[i]; 
                System.out.println("Resultado: "+resultado[i]+"x^"+grado1[i]); 
            } 
         }
    

public void restapolinomios(){
System.out.println("---RESTA DE POLINOMIOS---");
    for (int i = 0; i < 4; i++) {
        System.out.println("  "+poli1[i]+"x^"+grado1[i]+ " \n- "+poli2[i]+"x^"+grado2[i]); 
        resultado[i]= poli1[i] - poli2[i]; 
        System.out.println("Resultado: "+resultado[i]+"x^"+grado1[i]);
    }
}
}
