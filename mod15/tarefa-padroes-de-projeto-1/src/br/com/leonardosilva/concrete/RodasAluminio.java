package br.com.leonardosilva.concrete;

import br.com.leonardosilva.products.Rodas;

public class RodasAluminio implements Rodas {

    @Override
    public void colocar() {
        System.out.println("Rodas de alumínio colocadas!");
    }

    @Override
    public String getTamanho() {
        return "17 polegadas";
    }
}

