import java.util.Scanner;

public class ParOuImpar {

    // Versão 2 - Modular com Função
    public static void verificarParidade(int numero) {
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Versão 1 - Procedural
        System.out.println("--- Versão Procedural ---");
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        // Versão 2 - Modular
        System.out.println("\n--- Versão Modular com Função ---");
        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        verificarParidade(numero);

        sc.close();
    }
}
