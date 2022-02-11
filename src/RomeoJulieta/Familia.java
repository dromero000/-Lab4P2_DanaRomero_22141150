/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RomeoJulieta;

import java.util.ArrayList;

/**
 *
 * @author Dana Romero
 */
public class Familia {
    
    //Atributos
    String linaje;
    ArrayList <Aldeano> lista_aldeanos;
    
    //Constructor
    public Familia (String linaje){
        this.linaje = linaje;
        lista_aldeanos = new ArrayList <Aldeano>();
    }

    
    @Override
    public String toString() {
        return "Familia{" + "Apellido: " + linaje + ", Lista Aldeanos=" + lista_aldeanos + '}';
    }
    
    
    
    
    
}
