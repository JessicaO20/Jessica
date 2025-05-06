/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosDeObjeto;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el primer numero: ");
        String num1 = leer.nextLine();
        System.out.println("Ingresa el segundo numero: ");
        String num2 = leer.nextLine();
        
        int entero1 = Integer.parseInt(num1);
        int entero2 = Integer.parseInt(num2);
        
        System.out.println("La suma de los dos numeros parseados es: "+(entero1+entero2));
    }
    
}
