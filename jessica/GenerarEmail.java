/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jessica;

/**
 *
 * @author estudiante
 */
public class GenerarEmail {
    public static void main(String[] args) {
        String nombre = "LionelAndresMessi";
        String empresa = "CENTECH"; 
        String dominio = "CEN.TECH.COM.AR";
        
        System.out.println("***Generador de Email***");
        System.out.println("Nombre usuario: "+nombre);
        System.out.println("Nombre empresa: "+empresa);
        System.out.println("Nombre dominio: "+dominio);
        
        System.out.println("Creando email...");
        
        System.out.println(nombre+""+empresa+"@"+dominio);
    }
    
}
