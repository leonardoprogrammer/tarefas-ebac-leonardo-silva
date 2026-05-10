package br.com.leonardosilva.concrete;

import br.com.leonardosilva.products.Motor;

public class MotorGasolina implements Motor {

    @Override
    public void colocar() {
        System.out.println("Motor a gasolina colocado!");
    }

    @Override
    public String getTipo() {
        return "Gasolina";
    }
}

