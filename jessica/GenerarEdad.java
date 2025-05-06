/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jessica;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class GenerarEdad{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu edad: ");
        int edad = leer.nextInt();
        
        if(edad>=16){
            System.out.println("Tienes permitido conducir");
        }
        else{
            System.out.println("No tienes permitido conducir");
        }   
    }
    
}
