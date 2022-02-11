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
public class Pacifista extends Aldeano{
    
    String discursoPaz;
    public Pacifista(String nombre, String apellido, int edad, int puntosVida){
        super(nombre, apellido, edad, puntosVida);
        puntosAtaque= 0;
        discursoPaz = "¡Pelear no es la solución, mejor trabajemos juntos por un futuro mejor!";
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Puntos Ataque=" + 0+ "Tipo= Pacifista }\n";
    }
}
