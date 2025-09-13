/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2;

/**
 *
 * @author VP
 */
public class Estudiante {
    // Atributos de la clase
    private String nombre;
    private int edad;

    // 1. Constructor por defecto que llama a otro constructor
    public Estudiante() {
        this("Nombre por defecto", 0); // Llama al constructor de dos parámetros
    }

    // 2. Constructor con dos parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // 3. Método para imprimir los detalles del estudiante
    public void mostrarDetalles() {
        System.out.println("Detalles del Estudiante:");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }
}