/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.fbalboac.pkg03.programa.pkg1;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class SPPFBalboaC03PROGRAMA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {Scanner kb= new Scanner(System.in);
    Double Arista;
    Double Volumen;
    //Función Math.pow de Java.
        System.out.println("Dime cuantos centimetros mide la arista de tu cubo");
        Arista= kb.nextDouble ();
        Volumen =Math.pow(Arista, 3);
        System.out.println("El volumen de tu cubo es de " + (Volumen) + " Centimetros cubicos");
        
        cont();
        
        // TODO code application logic here
    }
    public static void cont(){
         int resp;
        Scanner kb= new Scanner(System.in);
        System.out.println("¿Quieres calcular otro volumen?");
        System.out.println("1. ¡Por su puesto!" + "  0. No gracias");
        resp= kb.nextInt ();
        if (resp<0 || resp> 1){
            cont ();} else {switch(resp){ case 1:
                main (null);
                break;
            default:
                    System.out.println("Hasta luego");
                    System.exit(0);
                    break;
            }
        }
    }
    
}
        // TODO code application logic here
    
    

