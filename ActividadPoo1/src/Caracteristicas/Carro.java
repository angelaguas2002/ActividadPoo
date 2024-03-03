/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caracteristicas;

import Interfase.AccionesVehiculo;

/**
 *
 * @author Angel Aguas
 */
public class Carro extends Vehiculo implements AccionesVehiculo {
    String traccion;

    public Carro(String marca, String modelo, String placa, int velocidadMaxima, String traccion) {
        super(marca, modelo, placa, velocidadMaxima);
        this.traccion = traccion;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando el carro " + marca);
    }

    @Override
    public void frenar() {
        System.out.println("Frenando el carro " + marca);
    }

    @Override
    public void estacionar() {
        System.out.println("Estacionando el carro " + marca);
    }

    @Override
    public void girar() {
        System.out.println("Girando el carro " + marca);
    }
}
