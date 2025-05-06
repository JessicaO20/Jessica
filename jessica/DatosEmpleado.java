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
public class DatosEmpleado {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = leer.nextLine();
        
        System.out.println("Ingrese la edad del empleado: ");
        int edad = leer.nextInt();
        
        System.out.println("Ingrese el salario del empleado: ");
        double salario = leer.nextDouble();
        
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Salario: $"+salario);
    }
    
}
