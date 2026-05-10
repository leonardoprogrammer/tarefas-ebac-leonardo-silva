package br.com.leonardosilva.factory;

import br.com.leonardosilva.concrete.CarroVolkswagen;
import br.com.leonardosilva.concrete.MotorDiesel;
import br.com.leonardosilva.concrete.RodasAluminio;
import br.com.leonardosilva.products.Carro;
import br.com.leonardosilva.products.Motor;
import br.com.leonardosilva.products.Rodas;

public class FabricaVolkswagen extends FabricaCarro {

    @Override
    public Motor criarMotor() {
        return new MotorDiesel();
    }

    @Override
    public Rodas criarRodas() {
        return new RodasAluminio();
    }

    @Override
    public Carro criarCarro() {
        Motor motor = criarMotor();
        Rodas rodas = criarRodas();
        return new CarroVolkswagen(motor, rodas);
    }
}

