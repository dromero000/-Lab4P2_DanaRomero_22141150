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
public class SuperGranjero extends Aldeano{
    
    public SuperGranjero(String nombre, String apellido, int edad, int puntosVida){
        super(nombre, apellido, edad, puntosVida);
        puntosAtaque= 1000;
        puntosVida = 1000;
    }
    
}