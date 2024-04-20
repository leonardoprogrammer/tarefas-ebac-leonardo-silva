import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Recebe um númerio inteiro e armazena na variável primitiva
        System.out.println("Digite um número inteiro:");
        int numPrimitivo = scan.nextInt();

        // Converte para uma variável Wrapper
        Integer numWrapper = Integer.valueOf(numPrimitivo);

        // Imprime no console
        System.out.println(numWrapper);
    }
}