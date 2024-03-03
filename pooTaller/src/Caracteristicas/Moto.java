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
public class Moto extends Vehiculo implements AccionesVehiculo {
    int cilindraje;

    public Moto(String marca, String modelo, String placa, int velocidadMaxima, int cilindraje) {
        super(marca, modelo, placa, velocidadMaxima);
        this.cilindraje = cilindraje;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando la moto " + marca);
    }

    @Override
    public void frenar() {
        System.out.println("Frenando la moto " + marca);
    }

    @Override
    public void estacionar() {
        System.out.println("Estacionando la moto " + marca);
    }

    @Override
    public void girar() {
        System.out.println("Girando la moto " + marca);
    }
  
}