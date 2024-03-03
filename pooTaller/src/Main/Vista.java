/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Interfase.AccionesVehiculo;
import Caracteristicas.*;
import java.util.Scanner;


/**
 *
 * @author Angel Aguas
 */
public class Vista {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Ingrese los datos del carro:");
        System.out.print("Marca: ");
        String marcaCarro = scanner.nextLine();
        System.out.print("Modelo: ");
        String modeloCarro = scanner.nextLine();
        System.out.print("Placa: ");
        String placaCarro = scanner.nextLine();
        System.out.print("Velocidad Máxima: ");
        int velocidadMaximaCarro = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después de nextInt
        System.out.print("Tracción: ");
        String traccionCarro = scanner.nextLine();

        Carro carro = new Carro(marcaCarro, modeloCarro, placaCarro, velocidadMaximaCarro, traccionCarro);

        System.out.println("\nIngrese los datos de la moto:");
        System.out.print("Marca: ");
        String marcaMoto = scanner.nextLine();
        System.out.print("Modelo: ");
        String modeloMoto = scanner.nextLine();
        System.out.print("Placa: ");
        String placaMoto = scanner.nextLine();
        System.out.print("Velocidad Máxima: ");
        int velocidadMaximaMoto = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después de nextInt
        System.out.print("Cilindraje: ");
        int cilindrajeMoto = scanner.nextInt();
        Moto moto = new Moto(marcaMoto, modeloMoto, placaMoto, velocidadMaximaMoto, cilindrajeMoto);

        realizarPruebaRuta(carro);
        realizarPruebaRuta(moto);

        scanner.close();
    }

    // Método para realizar la prueba de ruta
    public static void realizarPruebaRuta(AccionesVehiculo vehiculo) {
        vehiculo.acelerar();
        vehiculo.frenar();
        vehiculo.estacionar();
        vehiculo.girar();
    }
}
