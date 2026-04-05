import java.util.Scanner;

public class ContarVogais {

    // Versão 2 - Modular com Função
    public static int contarVogais(String frase) {
        String vogais = "aeiouAEIOU";
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (vogais.indexOf(caracter) != -1) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Versão 1 - Procedural
        System.out.println("--- Versão Procedural ---");
        System.out.print("Digite uma palavra ou frase: ");
        String frase = sc.nextLine().trim();

        String vogais = "aeiouAEIOU";
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (vogais.indexOf(caracter) != -1) {
                contador++;
            }
        }

        System.out.println("O número de vogais na sua frase/palavra é " + contador);

        // Versão 2 - Modular
        System.out.println("\n--- Versão Modular com Função ---");
        System.out.print("Digite uma palavra ou frase: ");
        frase = sc.nextLine().trim();

        int nVogais = contarVogais(frase);
        System.out.println("O número de vogais na frase/palavra é " + nVogais + ".");

        sc.close();
    }
}
