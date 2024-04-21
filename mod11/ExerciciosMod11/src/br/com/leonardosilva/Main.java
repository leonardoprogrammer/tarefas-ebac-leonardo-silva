package br.com.leonardosilva;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomes;

        System.out.println("Digite nomes em uma única linha separados por vírgula:");

        // RECEBE OS NOMES COM SCANNER
        nomes = scan.nextLine();

        // PASSA A LISTA PARA UM SET QUE ORDENA
        Set<String> nomesOrdenados = new TreeSet<>(separaNomesPorVirgula(nomes));

        // IMPRIME OS NOMES EM ORDEM ALFABÉTICA
        System.out.println("NOMES EM ORDEM ALFABÉTICA:");
        System.out.println(nomesOrdenados);
        System.out.println("------------------------------");

        System.out.println("Digite nomes da mesma forma e com a inicial do gênero separado por vírgula:");

        // RECEBE OS NOMES COM SCANNER
        nomes = scan.nextLine();

        // SEPARA OS NOMES POR VÍRGULA
        List<String> nomesList = separaNomesPorVirgula(nomes);

        Set<String> grupoMasculino = new LinkedHashSet<>();
        Set<String> grupoFeminino = new LinkedHashSet<>();

        for (int i = 0; i < nomesList.size(); i++) {
            String[] splitTrace = nomesList.get(i).split("-");
            if (splitTrace[1].trim().equalsIgnoreCase("M")) {
                // SE O CARACTER FOR "M" ADICIONA NOME AO GRUPO MASCULINO
                grupoMasculino.add(splitTrace[0].trim());
            } else if (splitTrace[1].trim().equalsIgnoreCase("F")) {
                // SE O CARACATER FOR "F" ADICONA NOME AO GRUPO FEMININO
                grupoFeminino.add(splitTrace[0].trim());
            }
        }

        // IMPRIME OS NOMES DO GRUPO MASCULINO
        System.out.println("NOMES DO GRUPO MASCULINO:");
        System.out.println(grupoMasculino);

        // IMPRIME OS NOMES DO GRUPO FEMININO
        System.out.println("\nNOMES DO GRUPO FEMININO:");
        System.out.println(grupoFeminino);
    }

    /**
     * Separa os nomes por vírgula e armazena em uma lista
     * @param nomes
     * @return java.util.List
     */
    public static List<String> separaNomesPorVirgula(String nomes) {
        List<String> nomesList = Arrays.asList(nomes.split(","));

        for (int i = 0; i < nomesList.size(); i++) {
            nomesList.set(i, nomesList.get(i).trim());
        }

        return nomesList;
    }
}