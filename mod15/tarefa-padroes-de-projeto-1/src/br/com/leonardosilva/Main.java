package br.com.leonardosilva;

import br.com.leonardosilva.factory.FabricaFiat;
import br.com.leonardosilva.factory.FabricaVolkswagen;
import br.com.leonardosilva.factory.FabricaCarro;
import br.com.leonardosilva.products.Carro;

public class Main {
    public static void main(String[] args) {

        FabricaCarro fabricaFiat = new FabricaFiat();
        Carro carroFiat = fabricaFiat.criarCarro();
        carroFiat.montar();

        System.out.println("Descrição: " + carroFiat.getDescricao());
        System.out.println();

        FabricaCarro fabricaVolkswagen = new FabricaVolkswagen();
        Carro carroVolkswagen = fabricaVolkswagen.criarCarro();
        carroVolkswagen.montar();
        
        System.out.println("Descrição: " + carroVolkswagen.getDescricao());
    }
}

