/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RomeoJulieta;

import java.util.Random;

/**
 *
 * @author Dana Romero
 */
public abstract class Aldeano {
    static Random r = new Random();
    
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
    
    public abstract int ataque(Aldeano a);
    
    public boolean fallar(int porcentaje){
        int num = r.nextInt(100);
        if (num<=porcentaje){
            return true;
        }
        return false;
    }
        
    
    
    
    
    
    
}
