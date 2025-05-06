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
public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el primer numero decimal: ");
        String num1 = leer.nextLine();
        System.out.println("Ingresa el segundo numero decimal: ");
        String num2 = leer.nextLine();
        
        int entero = Integer.parseInt(num1);
        int entero2 = Integer.parseInt(num2);
        
        if(num1==num2){
            System.out.println("Estos dos numeros son iguales");
        }   
        else{
            System.out.println("Estos dos numeros no son iguales");
        }
    }
    
}
