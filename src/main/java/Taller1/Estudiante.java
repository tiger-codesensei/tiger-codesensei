/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Estudiante to edit this template
 */
package Taller1;

/**
 *
 * @author VP
 */
public class Estudiante {
    // Propiedades de la clase
    private String nombre;
    private int edad;
    private String curso;

    // 1. Constructor por defecto
    public Estudiante() {
        this.nombre = "Sin Nombre";
        this.edad = 0;
        this.curso = "Sin Curso";
    }

    // 2. Constructor con nombre y edad
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        // Asignar un valor por defecto para el curso
        this.curso = "Sin Curso Asignado";
    }

    // 3. Constructor con todos los parámetros, llamando a otro constructor
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad); // Llama al constructor que acepta nombre y edad
        this.curso = curso;
    }

    // Métodos `get` y `set`
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Método para mostrar los detalles
    @Override
    public String toString() {
        return "Detalles del Estudiante: " +
               "\nNombre: " + nombre +
               "\nEdad: " + edad +
               "\nCurso: " + curso;
    }
}