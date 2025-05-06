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
public class DatosReceta {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingresa el nombre de la receta: ");
        String nombre = leer.nextLine();
        
        System.out.println("Ingrese los ingredientes principales de la receta: ");
        String receta = leer.nextLine();
        
        System.out.println("Ingrese el tiempo de la preparacion: ");
        int tiempo = leer.nextInt();
        
        System.out.println("Ingrese la dificultad (Facil, media o alta): ");
        String dificultad = leer.nextLine();
        
        System.out.println("El nombre de la receta es: "+nombre);
        System.out.println("Los ingredientes principales de la receta son: "+receta);
        System.out.println("El tiempo de la preparacion es: "+tiempo);
        System.out.println("La dificultad de la receta es: "+dificultad);
        
    }
    
}
