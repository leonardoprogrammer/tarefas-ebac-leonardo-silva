package br.com.leonardosilva.concrete;

import br.com.leonardosilva.products.Motor;

public class MotorDiesel implements Motor {

    @Override
    public void colocar() {
        System.out.println("Motor a diesel colocado!");
    }

    @Override
    public String getTipo() {
        return "Diesel";
    }
}

