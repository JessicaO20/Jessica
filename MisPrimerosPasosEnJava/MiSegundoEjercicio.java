/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisPrimerosPasosEnJava;
//libreria
//import java.util.scanner;

public class MiSegundoEjercicio {
    public static void main(String[] args) {
        Scanner dato = new Scanner(source: System.in);
        System.out.println("Ingresa tu edad: ");
        
        
        int n1 =7;
        int n2 =5;
        int suma, resta, mult, divi;
        suma=n1+n2;
        resta=n1-n2;
        mult=n1*n2;
        divi=n1/n2;

        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la division es: "+divi);
        System.out.println("El resultado de la multiplicacion es: "+mult);
    }
    
}      