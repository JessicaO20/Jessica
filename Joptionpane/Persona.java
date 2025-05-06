/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Joptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    void esMayorDeEdad(){
        if (edad>=18){
            JOptionPane.showConfirmDialog(null, "Eres mayor de edad ");   
        }else{
            JOptionPane.showConfirmDialog(null, "No eres mayor de edad");
        }
    }
    
    void ingresar(){
        nombre = JOptionPane.showInputDialog("Ingresa tu nombre: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad: "));
    }
    
    void mostrar(){
        JOptionPane.showConfirmDialog(null, "Tu nombre es: "+nombre);
        JOptionPane.showConfirmDialog(null, "Tu edad es: "+edad);
    }
    public static void main(String[] args) {        
        Persona p1 = new Persona("", 0);
        p1.ingresar();
        p1.mostrar();
        p1.esMayorDeEdad();
    }
}

