/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1;

/**
 *
 * @author VP
 */
public class Libro {
    // Propiedades o atributos de la clase
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // 1. Constructor por defecto
    public Libro() {
        this.titulo = "Título por defecto";
        this.autor = "Autor por defecto";
        this.numeroPaginas = 0;
    }

    // 2. Constructor parametrizado
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Métodos `get` y `set` para encapsulamiento (opcional, pero buena práctica)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
    // 3. Método para mostrar los detalles del libro
    @Override
    public String toString() {
        return "Detalles del Libro: " +
               "\nTítulo: " + titulo +
               "\nAutor: " + autor +
               "\nNúmero de Páginas: " + numeroPaginas;
    }
}