package br.com.leonardosilva.factory;

import br.com.leonardosilva.products.Carro;
import br.com.leonardosilva.products.Motor;
import br.com.leonardosilva.products.Rodas;

public abstract class FabricaCarro {

    public abstract Motor criarMotor();

    public abstract Rodas criarRodas();

    public abstract Carro criarCarro();
}

