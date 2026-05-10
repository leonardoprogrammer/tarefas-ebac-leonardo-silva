package br.com.leonardosilva.concrete;

import br.com.leonardosilva.products.Carro;
import br.com.leonardosilva.products.Motor;
import br.com.leonardosilva.products.Rodas;

public class CarroFiat implements Carro {

    private Motor motor;
    private Rodas rodas;

    public CarroFiat(Motor motor, Rodas rodas) {
        this.motor = motor;
        this.rodas = rodas;
    }

    @Override
    public void montar() {
        System.out.println("Montando Carro Fiat...");
        motor.colocar();
        rodas.colocar();
        System.out.println("Carro Fiat montado com sucesso!");
    }

    @Override
    public String getDescricao() {
        return "Fiat - Motor: " + motor.getTipo() + ", Rodas: " + rodas.getTamanho();
    }
}

