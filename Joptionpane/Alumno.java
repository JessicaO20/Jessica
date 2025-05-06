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
public class Alumno {
        String nombre;
        double nota;

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    void ingresar(){
        nombre = JOptionPane.showInputDialog("Ingresa tu nombre: ");
        nota = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu nota: "));
    }
        
    void aprobo(){
        if (nota>=6){
              JOptionPane.showConfirmDialog(null, "Aprobaste con: "+nota);
        }else{
              JOptionPane.showConfirmDialog(null, "Desaprobaste con: "+nota);
        }
    }
    
    void mostrar(){
        JOptionPane.showConfirmDialog(null, "Tu nombre es: "+nombre);
        JOptionPane.showConfirmDialog(null, "Tu nota es: "+nota);
    }
        
    public static void main(String[] args) {   
        Alumno a1 = new Alumno("", 0);
        a1.ingresar();
        a1.mostrar();
        a1.aprobo();
        }
    }

//boolean
