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
public class Agronomo extends Aldeano{
    
    public Agronomo(String nombre, String apellido, int edad, int puntosVida){
        super(nombre, apellido, edad, puntosVida);
        puntosAtaque= 100;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Puntos Ataque=" + 100+ "Tipo= Agrónomo }\n";
    }
}
