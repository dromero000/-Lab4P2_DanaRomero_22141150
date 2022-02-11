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
                    System.out.println("Imprimir Familias");
                    
                    break;
                case 4:
                    break;
                  
                    
            }
        }while(opcion!=0);
    }
    
    //Función para agregar las familas y aldeanos que estarán al inicio por default
    public static void agregarFamilias(){
        //La familia en la posición 0 es Montesco
        lista_familia.add(new Familia ("Montesco"));
        lista_familia.get(0).lista_aldeanos.add(new SuperGranjero ("Romeo", "Montesco", 21, 1000));
        lista_familia.get(0).lista_aldeanos.add(new Herrero ("Carlos", "Montesco", 42, 200));
        lista_familia.get(0).lista_aldeanos.add(new Agronomo ("Karina", "Montesco", 60, 100 ));
        
        //La familia en la posición 1 de Capuleto
        lista_familia.add(new Familia ("Capuleto"));
        lista_familia.get(1).lista_aldeanos.add(new Normal ("Julieta", "Capuleto", 20, 1000));
        lista_familia.get(1).lista_aldeanos.add(new Explosivo ("Sofia", "Capuleto", 30, 150));
        lista_familia.get(1).lista_aldeanos.add(new Pacifista ("Guillermo", "Capuleto", 33, 200));
        
        //La familia en la posición 2 de Romero
        lista_familia.add(new Familia ("López"));
        lista_familia.get(2).lista_aldeanos.add(new Herrero ("Pablo", "López", 57, 300));
        lista_familia.get(2).lista_aldeanos.add(new Agronomo("Manuel", "López", 36, 200));
        lista_familia.get(2).lista_aldeanos.add(new Pacifista ("María", "López", 27, 150 ));
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
