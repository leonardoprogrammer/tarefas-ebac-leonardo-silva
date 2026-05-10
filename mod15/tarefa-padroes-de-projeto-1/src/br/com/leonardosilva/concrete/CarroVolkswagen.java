package br.com.leonardosilva.concrete;

import br.com.leonardosilva.products.Carro;
import br.com.leonardosilva.products.Motor;
import br.com.leonardosilva.products.Rodas;

public class CarroVolkswagen implements Carro {

    private Motor motor;
    private Rodas rodas;

    public CarroVolkswagen(Motor motor, Rodas rodas) {
        this.motor = motor;
        this.rodas = rodas;
    }

    @Override
    public void montar() {
        System.out.println("Montando Carro Volkswagen...");
        motor.colocar();
        rodas.colocar();
        System.out.println("Carro Volkswagen montado com sucesso!");
    }

    @Override
    public String getDescricao() {
        return "Volkswagen - Motor: " + motor.getTipo() + ", Rodas: " + rodas.getTamanho();
    }
}

