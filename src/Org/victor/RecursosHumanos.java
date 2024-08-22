/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Org.victor;

/**
 *
 * @author WINDOWS 10
 */

// Clase abstracta Empleado
abstract class Empleado {
    // Atributos
    protected String nombre;
    protected String id;
    protected double salario_base;

    // Constructor
    public Empleado(String nombre, String id, double salario_base) {
        this.nombre = nombre;
        this.id = id;
        this.salario_base = salario_base;
    }

    // Método abstracto para calcular el salario
    public abstract double calcularSalario();

    // Método concreto para mostrar la información del empleado
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Salario Base: Q" + salario_base);
    }
}

// Clase concreta EmpleadoAsalariado que extiende Empleado
class EmpleadoAsalariado extends Empleado {
    // Constructor
    public EmpleadoAsalariado(String nombre, String id, double salario_base) {
        super(nombre, id, salario_base);
    }

    // Implementación del método calcularSalario
    @Override
    public double calcularSalario() {
        return salario_base; // Salario mensual fijo
    }
}

// Clase concreta EmpleadoPorHoras que extiende Empleado
class EmpleadoPorHoras extends Empleado {
    private double tarifaPorHora;
    private int horasTrabajadas;

    // Constructor
    public EmpleadoPorHoras(String nombre, String id, double salario_base, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, id, salario_base);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    // Implementación del método calcularSalario
    @Override
    public double calcularSalario() {
        return tarifaPorHora * horasTrabajadas; // Salario basado en horas trabajadas
    }
}

// Clase principal para ejecutar el programa
public class RecursosHumanos {
    public static void main(String[] args) {
        // Crear un empleado asalariado
        Empleado empleado1 = new EmpleadoAsalariado("sumit Perez", "A01", 6000.00);
        
        // Crear un empleado por horas
        Empleado empleado2 = new EmpleadoPorHoras("Karla Lopez", "B02", 0, 10.00, 160); // Salario base no se utiliza

        // Mostrar información y calcular salarios
        System.out.println("Informacion del Empleado Asalariado:");
        empleado1.mostrarInformacion();
        System.out.println("Salario: Q" + empleado1.calcularSalario());

        System.out.println("\nInformacion del Empleado Por Horas:");
        empleado2.mostrarInformacion();
        System.out.println("Salario: Q" + empleado2.calcularSalario());
    }
}

