/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosDeObjeto;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class Ejercicio_6 {
        int intentos;
        int numSecreto;
        
        public Ejercicio_6(int intentos, int numSecreto) {
        this.intentos = intentos;
        this.numSecreto = numSecreto;
    }
        
        void jugar(){
            for (int i = 0; i < 3; i++) {
                
            String secreto = JOptionPane.showInputDialog("Adivina el número (entre 1 y 10):");
            int numero = Integer.parseInt(secreto); // Convierte la entrada a entero
            intentos++;
                
            if (numero < numSecreto) {
                JOptionPane.showMessageDialog(null, "El número es mayor.");
            } else if (numero > numSecreto) {
                JOptionPane.showMessageDialog(null, "El número es menor.");
            } else {
                JOptionPane.showMessageDialog(null, "¡Felicidades! Adivinaste el número.");
            }
        }
            
        JOptionPane.showMessageDialog(null, "Lo siento, no adivinaste el número. El número era: " +numSecreto);
    }
        
        //Random generador = new Random();
        //int dado = generador.nextInt(6) + 1; // Número entre 1 y 6
        //System.out.println("Ingresa un numero");
        //int numAleatorio = Random.nextInt(6)+1;
        //System.out.println(numAleatorio);
        //System.out.println("Salió el número: " + dado);
        
        public static void main(String[] args) {
        Ejercicio_6 ej6 = new Ejercicio_6(0, 0);
        ej6.jugar();
    }
}