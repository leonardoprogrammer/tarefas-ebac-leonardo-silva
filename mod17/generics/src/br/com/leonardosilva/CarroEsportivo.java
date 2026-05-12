package br.com.leonardosilva;

public class CarroEsportivo implements Carro {
    private String marca;
    private String modelo;
    private int ano;

    public CarroEsportivo(String marca, String modelo, int ano) {
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
        return "Esportivo: " + marca + " " + modelo + " (" + ano + ")";
    }
}

