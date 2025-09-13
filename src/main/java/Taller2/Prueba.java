/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2;

/**
 *
 * @author VP
 */
public class Prueba {
   private String nombre;

    public static void mostrarNombre() {
        // Error: usar 'this' en este metodo estático.
        // porque la palabra clave 'this' se refiere a una instancia de un objeto,
        // y los métodos estáticos pertenecen a la clase, no a una instancia específica.
        // No hay un objeto al que 'this' pueda referenciarse.
        // ejemplo de error: System.out.println(this.nombre); 
    }
    
    // Lo correcto seria:
    public void mostrarNombreCorrecto() {
        System.out.println("Nombre: " + this.nombre);
    }
    // O
    public static void mostrarNombre2(String nombre) {
        System.out.println("Nombre: " + nombre);
    }
}