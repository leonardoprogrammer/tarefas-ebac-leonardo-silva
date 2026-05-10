package br.com.leonardosilva.factory;

import br.com.leonardosilva.concrete.CarroFiat;
import br.com.leonardosilva.concrete.MotorGasolina;
import br.com.leonardosilva.concrete.RodasAco;
import br.com.leonardosilva.products.Carro;
import br.com.leonardosilva.products.Motor;
import br.com.leonardosilva.products.Rodas;

public class FabricaFiat extends FabricaCarro {

    @Override
    public Motor criarMotor() {
        return new MotorGasolina();
    }

    @Override
    public Rodas criarRodas() {
        return new RodasAco();
    }

    @Override
    public Carro criarCarro() {
        Motor motor = criarMotor();
        Rodas rodas = criarRodas();
        return new CarroFiat(motor, rodas);
    }
}

