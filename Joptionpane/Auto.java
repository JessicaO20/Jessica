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
public class Auto {
        //ATRIBUTOS
        String marca; 
        String modelo; 

        
        //CONSRUCTOR
        public Auto(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

        void arrancar() {
            JOptionPane.showConfirmDialog(null, "Arranco");
    }
        void ingresar(){
        marca = JOptionPane.showInputDialog("Ingresa la marca de tu auto: ");
        modelo = JOptionPane.showInputDialog("Ingresa el modelo de tu auto: ");
        }
        
        void mostrar(){ 
        JOptionPane.showConfirmDialog(null, "La marca de tu auto es: "+marca);
        JOptionPane.showConfirmDialog(null, "El modelo de tu auto es: "+modelo);
        }

public static void main(String[] args) {

        Auto a1 = new Auto("", "");
        a1.ingresar();
        a1.mostrar();
        a1.arrancar();
    }
    }
