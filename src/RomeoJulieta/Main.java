/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RomeoJulieta;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dana Romero
 */
public class Main {
    static Scanner leer = new Scanner (System.in);
    static ArrayList <Familia> lista_familia = new ArrayList<Familia>();
        
    public static void main(String[] args) {
        
        
        int opcion;
        do{
            System.out.println("* * * R O M E O  Y  J U L I E T A * * *");
            System.out.println("Menú\n0 - Salir\n1 - Crear Familia\n2 - Crear Aldeano\n2");
            System.out.print("Ingrese opción: ");
            opcion = leer.nextInt();
            switch (opcion){
                case 0:
                    System.out.println("¡Gracias!\n-Dana Romero");
                    break;
                case 1:
                    System.out.println("Crear Familia");
                    crearFamilia();
                    break;
                case 2:
                    System.out.println("Crear Aldeano");
                    crearAldeano();
                    break;
                case 3:
                    
                    break;
                    
            }
        }while(opcion!=0);
    }
    
    public static boolean crearFamilia(){
        System.out.print("Ingrese apellido: ");
        String apellido = leer.nextLine();
        for (Familia fam :lista_familia){
            if (fam.linaje.equals(apellido)){
                System.out.println("Esta familia ya existe");
                return false;
            }
        }
        lista_familia.add(new Familia(apellido));
        return true;
    }
    
    public static boolean crearAldeano(){
        System.out.println("Ingrese nombre: ");
        String nombre=leer.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellido = leer.nextLine();
        System.out.println("Ingrese edad: ");
        int edad = leer.nextInt();
        System.out.println("Ingrese puntos de vida");
        int puntosVida = leer.nextInt();
        for (Familia fam :lista_familia){
            if (fam.linaje.equals(apellido)){
                System.out.println("1 - Normal\n2 - Pacifista\n3 - Herrero\n4 - Agrónomo\n5 - Explosivo");
                System.out.print("Ingrese el tipo de aldeano: ");
                int tipo = leer.nextInt();
                
                switch(tipo){
                    case 1:
                        fam.lista_aldeanos.add(new Normal (nombre, apellido, edad, puntosVida));
                        break;
                    case 2:
                        fam.lista_aldeanos.add(new Pacifista (nombre, apellido, edad, puntosVida));
                        break;
                    case 3:
                        fam.lista_aldeanos.add(new Herrero (nombre, apellido, edad, puntosVida));
                        break;
                    case 4:
                        fam.lista_aldeanos.add(new Agronomo (nombre, apellido, edad, puntosVida));
                        break;
                    case 5:
                        fam.lista_aldeanos.add(new Explosivo (nombre, apellido, edad, puntosVida));
                        break;
                }
                return true;
            }
        }
    
       return false; 
    }
    

     
}
