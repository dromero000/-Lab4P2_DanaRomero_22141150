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
        super(nombre, apellido, edad, 1000);
        puntosAtaque= 1000;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Puntos Ataque=" + 1000+ "Tipo= Super Granjer }\n";
    }
    
    public int ataque(Aldeano a){
        if (a instanceof Herrero){
            return (int)Math.round(puntosAtaque*1.1);
        }else if (a instanceof Explosivo){
            return (int)Math.round(puntosAtaque*1.15);
        }
        return puntosAtaque;
    }
}
