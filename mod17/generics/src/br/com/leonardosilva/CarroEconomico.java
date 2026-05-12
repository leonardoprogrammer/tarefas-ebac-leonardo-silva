package br.com.leonardosilva;

public class CarroEconomico implements Carro {
    private String marca;
    private String modelo;
    private int ano;

    public CarroEconomico(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Econômico: " + marca + " " + modelo + " (" + ano + ")";
    }
}

