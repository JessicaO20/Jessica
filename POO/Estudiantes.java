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
public class Estudiantes {
    //DECLARANDO VARIABLES -> ATRIBUTOS
    String nombre;
    String apellido;
    String colorPelo;
    int edad;
    
    //CONSTRUCTOR 
    public Estudiantes(String nombre, String apellido, String colorPelo, int edad){    
        this.nombre = nombre;
        this.apellido = apellido;
        this.colorPelo = colorPelo;
        this.edad = edad;
    }

    //METODOS -> ACCIONES QUE HACEN LOS OBJETOS
    void hablar() {
        System.out.println(nombre+"Esta hablando...");
    }
    
    void estudiar(){
        System.out.println(nombre+"Esta estudiando...");
    }
    void horaLibre(){
        JOptionPane.showMessageDialog(null, nombre+"Esta en hora libre");
    }
}
