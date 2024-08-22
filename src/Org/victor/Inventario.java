/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Org.victor;

/**
 *
 * @author WINDOWS 10
 */

// Clase abstracta Producto
abstract class Producto {
    // Atributos
    protected String nombre;
    protected double precio;
    protected int cantidad;

    // Constructor
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Método abstracto para agregar cantidad al inventario
    public abstract void agregar_cantidad(int cantidad);

    // Método abstracto para vender cantidad del producto
    public abstract void vender(int cantidad);

    // Método concreto para consultar el inventario
    public void consultar_inventario() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: Q" + precio);
        System.out.println("Cantidad disponible: " + cantidad);
    }
}

// Clase concreta Electronico que extiende Producto
class Electronico extends Producto {
    // Constructor
    public Electronico(String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
    }

    // Implementación del método agregar_cantidad
    @Override
    public void agregar_cantidad(int cantidad) {
        this.cantidad += cantidad;
        System.out.println("Se han agregado " + cantidad + " unidades de " + nombre + ".");
    }

    // Implementación del método vender
    @Override
    public void vender(int cantidad) {
        if (cantidad > this.cantidad) {
            System.out.println("No se puede realizar la venta. Solo hay " + this.cantidad + " unidades disponibles de " + nombre + ".");
        } else {
            this.cantidad -= cantidad;
            System.out.println("Se han vendido " + cantidad + " unidades de " + nombre + ".");
        }
    }
}

// Clase principal para ejecutar el programa
public class Inventario {
    public static void main(String[] args) {
        // Crear un producto electrónico
        Electronico telefono = new Electronico("Telefono Movil", 200.99, 50);

        // Consultar inventario
        telefono.consultar_inventario();

        // Agregar cantidad
        telefono.agregar_cantidad(20);
        telefono.consultar_inventario();

        // Vender cantidad
        telefono.vender(10);
        telefono.consultar_inventario();

        // Intentar vender más de lo disponible
        telefono.vender(70);
        telefono.consultar_inventario();
    }
}

