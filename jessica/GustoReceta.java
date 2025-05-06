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
public class GustoReceta {
    public static void main(String[] args) {
        String gusto;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un gusto de helado: ");
        gusto = leer.nextLine().toLowerCase(); //para cambiar a miniscula
        
        if((gusto.equals("frutilla"))
                ||(gusto.equals("dulce de leche"))
                ||gusto.equals("chocolate")
                || (gusto.equals("vainilla"))){
            System.out.println("Si, hay "+gusto);
        }
        else{
            System.out.println("No hay "+gusto);
        }
    }
    
}
