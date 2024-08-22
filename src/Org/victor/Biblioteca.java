/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Org.victor;

/**
 *
 * @author WINDOWS 10
 */

import java.util.Scanner;

// Clase Libro
class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private boolean disponible;

    // Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true; // Por defecto, el libro está disponible
    }

    // Método para prestar el libro
    public void prestar() {
        if (disponible) {
            disponible = false; // Cambia a no disponible
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo + "' no está disponible para préstamo.");
        }
    }

    // Método para devolver el libro
    public void devolver() {
        disponible = true; // Cambia a disponible
        System.out.println("El libro '" + titulo + "' ha sido devuelto y está disponible nuevamente.");
    }

    // Método para consultar la disponibilidad del libro
    public void consultarDisponibilidad() {
        if (disponible) {
            System.out.println("El libro '" + titulo + "' esta disponible para prestamo.");
        } else {
            System.out.println("El libro '" + titulo + "' no esta disponible para prestamo.");
        }
    }
}

// Clase principal Biblioteca
public class Biblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear un libro
        Libro libro1 = new Libro("Cien anos de soledad", "Gabriel Garcia Marquez");

        // Menú de opciones
        int opcion;
        do {
            System.out.println("\n--- Menu de Biblioteca ---");
            System.out.println("1. Consultar disponibilidad");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    libro1.consultarDisponibilidad();
                    break;
                case 2:
                    libro1.prestar();
                    break;
                case 3:
                    libro1.devolver();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, selecciona una opcion del 1 al 4.");
            }
        } while (opcion != 4);

        // Cerrar el scanner
        scanner.close();
    }
}



