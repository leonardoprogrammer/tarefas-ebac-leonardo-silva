package br.com.leonardosilva;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author leonardoprogrammer
 *
 * @class br.com.leonardosilva.Relogio
 */
public class Relogio {

    private String marca;
    private String modelo;
    private Double preco;

    public Relogio(String marca, String modelo, Double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public Relogio() {
    }

    /**
     * Método que retorna o nome da marca do relógio
     * @return java.lang.String
     */
    public String retornaMarca() {
        return this.marca;
    }

    /**
     * Método que retorna o nome do modelo do relógio
     * @return java.lang.String
     */
    public String retornaModelo() {
        return this.modelo;
    }

    /**
     * Método que retorna o preço do relógio
     * @return java.lang.Double
     */
    public Double retornaPreco() {
        return this.preco;
    }

    /**
     * Método que retorna o horário atual
     * @return java.lang.String
     */
    public String retornaHorario() {
        LocalTime horarioAtual = LocalTime.now();
        return horarioAtual.format(DateTimeFormatter.ofPattern("HH:mm"));
    }

    /**
     * Método que retorna a data atual
     * @return java.lang.String
     */
    public String retornaData() {
        LocalDate dataAtual = LocalDate.now();
        return dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
