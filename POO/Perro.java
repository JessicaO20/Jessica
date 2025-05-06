/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class Perro {
    String nombre;
    String raza;

    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }
    
    
    void ladrar(){
        JOptionPane.showMessageDialog(null, nombre+" Guau! Guau!");
    }
}

class main{
    public static void main(String[] args) {
        Perro p1 = new Perro("safira","pitbul");
                p1.ladrar();
    }
}
