package br.com.leonardosilva;

public class Main {

    public static void main(String[] args) {

        Garagem<CarroEsportivo> garagemEsportivos = new Garagem<>();
        garagemEsportivos.adicionarCarro(new CarroEsportivo("Ferrari", "F8 Pista", 2023));
        garagemEsportivos.adicionarCarro(new CarroEsportivo("Lamborghini", "Aventador SVJ", 2024));
        
        System.out.println("Carros Esportivos (" + garagemEsportivos.contar() + "):");
        for (CarroEsportivo carro : garagemEsportivos.obterTodos()) {
            System.out.println(carro);
        }

        Garagem<CarroEconomico> garagemEconomicos = new Garagem<>();
        garagemEconomicos.adicionarCarro(new CarroEconomico("Fiat", "Uno", 2022));
        garagemEconomicos.adicionarCarro(new CarroEconomico("Hyundai", "HB20", 2023));

        System.out.println("\nCarros Econômicos (" + garagemEconomicos.contar() + "):");
        for (CarroEconomico carro : garagemEconomicos.obterTodos()) {
            System.out.println(carro);
        }

        Garagem<CarroLuxo> garagemLuxo = new Garagem<>();
        garagemLuxo.adicionarCarro(new CarroLuxo("Mercedes-Benz", "A45 AMG", 2024));
        garagemLuxo.adicionarCarro(new CarroLuxo("BMW", "M3", 2023));

        System.out.println("\nCarros de Luxo (" + garagemLuxo.contar() + "):");

        for (CarroLuxo carro : garagemLuxo.obterTodos()) {
            System.out.println(carro);
        }
    }
}
