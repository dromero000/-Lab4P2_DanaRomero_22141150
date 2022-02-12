/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RomeoJulieta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Dana Romero
 */
public class Main {
    static Scanner leer = new Scanner (System.in).useDelimiter("\n");
    static ArrayList <Familia> lista_familia = new ArrayList<Familia>();
        
    public static void main(String[] args) {
        agregarFamilias();       
        
        int opcion;
        do{
            System.out.println("* * * R O M E O  Y  J U L I E T A * * *");
            System.out.println("Menú\n0 - Salir\n1 - Crear Familia\n2 - Crear Aldeano\n3 - Imprimir Familias\n4 - Pelear\n");
            System.out.print("Ingrese opción: ");
            opcion = leer.nextInt();
            switch (opcion){
                case 0:
                    System.out.println("¡Gracias!\n-Dana Romero");
                    break;
                case 1:
                    System.out.println("---Crear Familia---");
                    crearFamilia();
                    break;
                case 2:
                    System.out.println("---Crear Aldeano---");
                    crearAldeano();
                    break;
                case 3:
                    System.out.println("---Imprimir Familias---");
                    for (Familia fam : lista_familia){
                        System.out.println(fam.toString());
                    }
                    break;
                case 4:
                    System.out.println("---Pelea---");
                    pelea();
                    break;
                  
                    
            }
        }while(opcion!=0);
    }
    
    //Función para agregar las familas y aldeanos que estarán al inicio por default
    public static void agregarFamilias(){

        //La familia en la posición 0 de Capuleto
        lista_familia.add(new Familia ("Capuleto"));
        lista_familia.get(0).lista_aldeanos.add(new Normal ("Julieta", "Capuleto", 20, 1000));
        lista_familia.get(0).lista_aldeanos.add(new Explosivo ("Sofia", "Capuleto", 30, 500));
        lista_familia.get(0).lista_aldeanos.add(new Pacifista ("Guillermo", "Capuleto", 33, 400));
        
        //La familia en la posición 1 es Montesco
        lista_familia.add(new Familia ("Montesco"));
        lista_familia.get(1).lista_aldeanos.add(new SuperGranjero ("Romeo", "Montesco", 21, 1000));
        lista_familia.get(1).lista_aldeanos.add(new Herrero ("Carlos", "Montesco", 42, 600));
        lista_familia.get(1).lista_aldeanos.add(new Agronomo ("Karina", "Montesco", 60, 300 ));
        
        //La familia en la posición 2 de Romero
        lista_familia.add(new Familia ("Lopez"));
        lista_familia.get(2).lista_aldeanos.add(new Herrero ("Pablo", "Lopez", 57, 600));
        lista_familia.get(2).lista_aldeanos.add(new Agronomo("Manuel", "Lopez", 36, 700));
        lista_familia.get(2).lista_aldeanos.add(new Pacifista ("María", "Lopez", 27, 500 ));
    }
    
    public static boolean crearFamilia(){
        System.out.print("Ingrese apellido: ");
        String apellido = leer.next();
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
        System.out.print("Ingrese nombre: ");
        String nombre=leer.next();
        System.out.print("Ingrese apellido: ");
        String apellido = leer.next();
        System.out.print("Ingrese edad: ");
        int edad = leer.nextInt();
        System.out.print("Ingrese puntos de vida: ");
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
        System.out.println("La familia "+ apellido+" no existe");
       return false; 
    }
    
    public static Familia buscarFamilia(String apellido){
        for (Familia fam: lista_familia){
            if(fam.linaje.equals(apellido)){
                return fam;
            }
            
        }
        return null;
    }
    
    public static void pelea(){
        System.out.println("Ingrese el apellido de la familia contrincante: ");
        String apellido = leer.next();
        Familia contrincante = buscarFamilia(apellido);
        Familia montesco = buscarFamilia("Montesco");
        if (contrincante!=null && contrincante.lista_aldeanos.size()>=1){
            System.out.println("Montesco vs. "+apellido);
            Collections.shuffle(contrincante.lista_aldeanos);
            Collections.shuffle(montesco.lista_aldeanos);
            int c=0,m = 0;
            int vidaC;
            int vidaM;
            while(contrincante.lista_aldeanos.size()>0 && montesco.lista_aldeanos.size()>0){
                Aldeano jContrincante = contrincante.lista_aldeanos.get(c);
                Aldeano jMontesco = montesco.lista_aldeanos.get(m);
                vidaC = jContrincante.puntosVida;
                vidaM = jMontesco.puntosVida;
                    int ataque = jMontesco.ataque(jContrincante);
                    if(ataque !=0){
                        jContrincante.puntosVida-=ataque;
                        System.out.println(jMontesco.nombre+ " ha atacado a "+ jContrincante.nombre+" haciéndole "
                                + ataque + " de daño. "+jContrincante.nombre +" tiene "+ jContrincante.puntosVida+" de vida.");
                    }
                    if(jContrincante.puntosVida>=0){
                        ataque = jContrincante.ataque(jMontesco);
                        if(ataque !=0){
                            jMontesco.puntosVida-=ataque;
                            System.out.println(jContrincante.nombre+ " ha atacado a "+ jMontesco.nombre+" haciéndole "
                                    + ataque + " de daño. "+jMontesco.nombre +" tiene "+ jMontesco.puntosVida+" de vida.");
                            
                        }
                    }
                if (jContrincante.puntosVida <=0){
                    System.out.println(jMontesco.nombre+" ha derrotado a "+jContrincante.nombre);
                    contrincante.lista_aldeanos.remove((contrincante.lista_aldeanos.indexOf(jContrincante)));
                    
                }else if (jMontesco.puntosVida <=0){
                    System.out.println(jContrincante.nombre+ " ha derrotado a "+ jMontesco.nombre);
                    montesco.lista_aldeanos.remove((montesco.lista_aldeanos.indexOf(jMontesco)));
                }
                
           }
            if(contrincante.lista_aldeanos.isEmpty()){
                System.out.println(montesco.linaje.toUpperCase()+" GANARON");
                lista_familia.remove((lista_familia.indexOf(contrincante)));
            }else if (montesco.lista_aldeanos.isEmpty()){
                System.out.println(contrincante.linaje.toUpperCase()+" GANARON");
                lista_familia.remove((lista_familia.indexOf(montesco)));
            }
            
        }
            
        
    }
    
    

     
}
