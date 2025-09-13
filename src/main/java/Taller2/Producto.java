/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2;

/**
 *
 * @author VP
 */
public class Producto {
    // Atributos de la clase
    private String nombre;
    private double precio;

    // Constructor que usa 'this' para diferenciar atributos y parámetros
    public Producto(String nombre, double precio) {
        // 'this.nombre' se refiere al atributo de la clase
        // 'nombre' se refiere al parámetro del constructor
        this.nombre = nombre; 
        this.precio = precio;
    }

    // Método para mostrar los detalles del producto
    public void mostrarProducto() {
        System.out.println("Detalles del Producto:");
        System.out.println("Nombre: " + this.nombre); 
        System.out.println("Precio: " + this.precio);
    }
}