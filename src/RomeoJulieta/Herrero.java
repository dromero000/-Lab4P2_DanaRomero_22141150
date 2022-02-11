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
public class Herrero extends Aldeano{
    Random r = new Random();
    
    public Herrero(String nombre, String apellido, int edad, int puntosVida){
        super(nombre, apellido, edad, (int)Math.round(puntosVida*1.5));
        puntosAtaque= r.nextInt(500-200)+200;
        
    }
    @Override
    public String toString(){
        return super.toString() + ", Puntos Ataque=" + 0;
    }
    
}
