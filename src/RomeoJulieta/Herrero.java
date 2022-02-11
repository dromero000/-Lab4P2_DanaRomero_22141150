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
        super(nombre, apellido, edad, puntosVida);
        puntosAtaque= r.nextInt(500-200)+200;
    }
    
}
