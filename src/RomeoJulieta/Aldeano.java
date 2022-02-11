/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RomeoJulieta;

/**
 *
 * @author Dana Romero
 */
public class Aldeano {
    
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected int puntosVida;
    protected int puntosAtaque;
    
    public Aldeano(String nombre, String apellido, int edad, int puntosVida){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.puntosVida = puntosVida;
    }

    @Override
    public String toString() {
        return "Aldeano{" + "Nombre=" + nombre + ", Apellido=" + apellido + ", Edad=" + edad + ", Puntos Vida=" + puntosVida;
    }
    
    
    
    
    
}
