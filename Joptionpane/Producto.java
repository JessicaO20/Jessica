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
public class Producto {
    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    void esCaro(){
        if (precio>=10000){
            JOptionPane.showConfirmDialog(null, "El producto es caro"); 
        }else{
            JOptionPane.showConfirmDialog(null, "El producto es barato");
        }
    }
    
    void ingresar(){
        nombre = JOptionPane.showInputDialog("Ingresa tu nombre: ");
        precio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio del producto: "));
    }
    
    void mostrar(){
        JOptionPane.showConfirmDialog(null, "Hola!: "+nombre);
        JOptionPane.showConfirmDialog(null, "El precio del producto es: "+precio);
    }
    
    public static void main(String[] args) {
        Producto p1 = new Producto("", 0);
        p1.ingresar();
        p1.mostrar();
        p1.esCaro();
    }
}
