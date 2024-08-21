/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.com;

/**
 *
 * @author WINDOWS 10
 */

// Clase abstracta Empleado
abstract class Empleado {
    private String nombre;
    private String id;

    public Empleado(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    // Método abstracto para calcular el salario
    public abstract double calcularSalario();

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }
}

// Clase que representa un empleado asalariado
class EmpleadoAsalariado extends Empleado {
    private double salarioMensual;

    public EmpleadoAsalariado(String nombre, String id, double salarioMensual) {
        super(nombre, id);
        this.salarioMensual = salarioMensual;
    }

    // Implementación del método calcularSalario
    @Override //Es una herramienta para garantizar que los metodos que crees para spbreescribir otros en clases padres.
    public double calcularSalario() {
        return salarioMensual;
    }
}

// Clase que representa un empleado por hora
class EmpleadoPorHora extends Empleado {
    private double tarifaPorHora;
    private int horasTrabajadas;

    public EmpleadoPorHora(String nombre, String id, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, id);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    // Implementación del método calcularSalario
    @Override //Es una herramienta para garantizar que los metodos que crees para spbreescribir otros en clases padres.
    public double calcularSalario() {
        return tarifaPorHora * horasTrabajadas;
    }
}

// Clase principal para probar el sistema
public class SistemaDePago {
        public static void main(String[] args) {
        Empleado empleado1 = new EmpleadoAsalariado("Juan", "001", 3000.00);
        Empleado empleado2 = new EmpleadoPorHora("Pedrito", "002", 15.00, 160);

        System.out.println("Salario de " + empleado1.getNombre() + ": " + empleado1.calcularSalario());
        System.out.println("Salario de " + empleado2.getNombre() + ": " + empleado2.calcularSalario());
    }
}
    