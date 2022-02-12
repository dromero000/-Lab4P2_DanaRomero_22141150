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
public class Explosivo extends Aldeano{
    
    public Explosivo(String nombre, String apellido, int edad, int puntosVida){
        super(nombre, apellido, edad, puntosVida);
        puntosAtaque= 250;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Puntos Ataque=" + 250+ "Tipo= Explosivo }\n";
    }
    
    public int ataque(Aldeano a){
        if (!fallar(15)){
            if (a instanceof Herrero){
                return (int)Math.round(puntosAtaque*1.05);
            }else if (a instanceof Agronomo){
                return (int)Math.round(puntosAtaque*1.1);
            }
            return puntosAtaque;
        }
        return 0;
    
    }
}
