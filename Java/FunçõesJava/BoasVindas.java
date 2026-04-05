import java.util.Scanner;

public class BoasVindas {

    // Versão 2 - Função (Modular)
    public static String gerarMensagemBoasVindas(String nome, int idade) {
        return "Seja bem-vindo(a), " + nome + "! Você tem " + idade + " anos.";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        // Versão 1 - Procedural
        System.out.println("\n--- Versão Procedural ---");
        System.out.println("Seja bem-vindo(a), " + nome + "! Você tem " + idade + " anos.");

        // Versão 2 - Modular
        System.out.println("\n--- Versão com Função ---");
        String mensagem = gerarMensagemBoasVindas(nome, idade);
        System.out.println(mensagem);

        sc.close();
    }
}
