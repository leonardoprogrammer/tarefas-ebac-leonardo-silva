package br.com.leonardosilva;

import java.util.ArrayList;
import java.util.List;

public class Garagem<T extends Carro> {

    private List<T> carros;

    public Garagem() {
        this.carros = new ArrayList<>();
    }

    public void adicionarCarro(T carro) {
        carros.add(carro);
    }

    public void removerCarro(T carro) {
        carros.remove(carro);
    }

    public List<T> obterTodos() {
        return new ArrayList<>(carros);
    }

    public int contar() {
        return carros.size();
    }

    public T obterPorIndice(int indice) {
        return carros.get(indice);
    }
}

