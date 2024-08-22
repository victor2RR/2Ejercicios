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
public class DiferenciaDeEdad {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el año de nacimiento de la primera persona
        System.out.print("Ingresa el ano de nacimiento de la primera persona: ");
        int anioNacimiento1 = scanner.nextInt();

        // Pedir al usuario que ingrese el año de nacimiento de la segunda persona
        System.out.print("Ingresa el ano de nacimiento de la segunda persona: ");
        int anioNacimiento2 = scanner.nextInt();

        // Calcular la edad de cada persona
        int edad1 = 2024 - anioNacimiento1;
        int edad2 = 2024 - anioNacimiento2;

        // Determinar quién es mayor y calcular la diferencia de edad
        if (edad1 > edad2) {
            System.out.println("La primera persona es mayor que la segunda.");
            System.out.println("La diferencia de edad es de " + (edad1 - edad2) + " anos.");
        } else if (edad2 > edad1) {
            System.out.println("La segunda persona es mayor que la primera.");
            System.out.println("La diferencia de edad es de " + (edad2 - edad1) + " anos.");
        } else {
            System.out.println("Ambas personas tienen la misma edad.");
        }
    }
}