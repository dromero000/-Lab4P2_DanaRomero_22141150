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
public class Normal extends Aldeano{

    public Normal(String nombre, String apellido, int edad, int puntosVida){
        super(nombre, apellido, edad, puntosVida);
        puntosAtaque= 50;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Puntos Ataque= " + 50+ "Tipo= Normal }\n";
    }
    
    public int ataque(Aldeano a){
        if (a instanceof Pacifista){
            return (int)Math.round(puntosAtaque*1.05);
        }
        return puntosAtaque;
    }
    
    
    
}
