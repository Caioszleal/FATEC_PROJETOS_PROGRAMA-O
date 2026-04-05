import java.util.Scanner;

public class Tabuada {

    // Versão 2 - Modular com Função
    public static void gerarTabuada(int numero) {
        System.out.println("===== TABUADA =====");
        for (int c = 1; c <= 10; c++) {
            System.out.println(c + " x " + numero + " = " + (c * numero));
        }
        System.out.println("====================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Versão 1 - Procedural
        System.out.println("--- Versão Procedural ---");
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        for (int c = 1; c <= 10; c++) {
            System.out.println(c + " x " + numero + " = " + (c * numero));
        }

        // Versão 2 - Modular
        System.out.println("\n--- Versão Modular com Função ---");
        System.out.print("Digite um número inteiro: ");
        numero = sc.nextInt();

        gerarTabuada(numero);

        sc.close();
    }
}
