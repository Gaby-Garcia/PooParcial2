/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Garcia
 */
public abstract class Persona {
    private String Nombre;
    private String Apellido;
    private int nocodigo;

    public Persona() {
    }

    public abstract String MostrarNombre(String Nombre);
    public abstract String MostrarApellido(String Apellido);
    public abstract int IngresarCodigo(int nocodigo);
    
     
    
    
}
