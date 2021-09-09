/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

/**
 *
 * @author LAB4-SERVIDOR
 */
public class Estudiante {
    String nombre;
    String apellidos;
    int edad;
    char genero;
    String carrera;
    String ci;
    
    public Estudiante(String nombre, String apellido, int edad, char genero, String carrera, String ci){
    
        this.nombre = nombre;
        this.apellidos = apellido;
        this.edad = edad;
        this.genero = genero;
        this.carrera = carrera;
        this.ci = ci;
   
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", genero=" + genero + ", carrera=" + carrera + ", ci=" + ci + '}';
    }
    
    
}
