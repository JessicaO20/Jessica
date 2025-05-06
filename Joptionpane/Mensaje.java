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
public class Mensaje {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null,"Hola Jessica!!");
        //JOptionPane.showMessageDialog(null, "Hola!");
    
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre: ");
        JOptionPane.showMessageDialog(null, "Hola "+nombre);
        
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
    }
    
}
