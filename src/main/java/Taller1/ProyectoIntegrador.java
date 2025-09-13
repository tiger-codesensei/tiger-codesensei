/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1;
import java.util.Scanner;
/**
 *
 * @author VP
 */
public class ProyectoIntegrador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //de la clase Libro
        System.out.println("Para crear objeto Libro, elige:");
        System.out.println("Opción 1: Crear libro con datos predeterminados.");
        System.out.println("Opción 2: Ingresar datos para un nuevo libro:");
        switch(scanner.nextInt()) {
            case 1: Libro libro1 = new Libro();
                    System.out.println(libro1.toString());break;
            case 2: System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Número de páginas: ");
                    int paginas = scanner.nextInt();
                    Libro libro2 = new Libro(titulo, autor, paginas);
                    System.out.println(libro2.toString());break;
        }
        //de la clase CuentaBancaria
        System.out.println("\nPara crear objeto CuentaBancaria, elige:");
        System.out.println("Opción 1: Crear cuenta predeterminada");
        System.out.println("Opción 2: Ingresar datos para una cuenta:");
        switch(scanner.nextInt()) {
            case 1: CuentaBancaria cuenta1 = new CuentaBancaria();
                    System.out.println(cuenta1.toString());break;
            case 2: System.out.print("Número de cuenta: ");
                    String numCuenta = scanner.nextLine();
                    System.out.print("Tipo de cuenta: ");
                    String tipoCuenta = scanner.nextLine();
                    System.out.print("Saldo inicial: ");
                    double saldo = scanner.nextDouble();
                    scanner.nextLine(); //para consumir el salto de línea
                    CuentaBancaria cuenta2 = new CuentaBancaria(numCuenta, saldo, tipoCuenta);
                    System.out.println(cuenta2.toString());break;
        }
        //de la clase Estudiante
        System.out.println("\nPara crear objeto CuentaBancaria, elige:");
        System.out.println("Opción 1: Crear estudiante con datos por defecto.");
        System.out.println("Opción 2: Ingresar datos para un nuevo estudiante:");
        switch(scanner.nextInt()) {
            case 1: Estudiante estudiante1 = new Estudiante();
        System.out.println(estudiante1.toString());break;
            case 2: System.out.print("Nombre: ");
                    String nombreEstudiante = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edadEstudiante = scanner.nextInt();
                    scanner.nextLine(); //para consumir el salto de línea
                    System.out.print("Curso: ");
                    String cursoEstudiante = scanner.nextLine();
                    Estudiante estudiante2 = new Estudiante(nombreEstudiante, edadEstudiante, cursoEstudiante);
                    System.out.println(estudiante2.toString());
        }scanner.close();//Cierra el scanner para ahorrar recursos
        }
    }