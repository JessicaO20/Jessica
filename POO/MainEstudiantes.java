/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author estudiante
 */
public class MainEstudiantes {
    public static void main(String[] args) {
        
        Estudiantes estudiante1 = new Estudiantes("Tisiano ", "Diaz", "Negro", 16);
        Estudiantes estudiante2 = new Estudiantes("Elias ", "Caliva", "Negro", 17);
        
        estudiante1.hablar();
        estudiante2.estudiar();
        estudiante2.horaLibre();
        
    }
    
}
