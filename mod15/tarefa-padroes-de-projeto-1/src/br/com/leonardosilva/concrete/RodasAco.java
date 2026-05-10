package br.com.leonardosilva.concrete;

import br.com.leonardosilva.products.Rodas;

public class RodasAco implements Rodas {

    @Override
    public void colocar() {
        System.out.println("Rodas de aço colocadas!");
    }

    @Override
    public String getTamanho() {
        return "15 polegadas";
    }
}

