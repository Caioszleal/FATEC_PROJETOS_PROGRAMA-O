import java.util.Scanner;

public class ValidarSenha {

    // Versão 2 - Modular com Função
    public static boolean validarSenha(String senha) {
        return senha.length() >= 8;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Versão 1 - Procedural
        System.out.println("--- Versão Procedural ---");
        System.out.print("Digite uma senha (mínimo 8 caracteres): ");
        String senha = sc.nextLine();

        while (senha.length() < 8) {
            System.out.println("Senha inválida! Deve ter pelo menos 8 caracteres.");
            System.out.print("Digite uma senha novamente: ");
            senha = sc.nextLine();
        }

        System.out.println("Senha válida!");

        // Versão 2 - Modular
        System.out.println("\n--- Versão Modular com Função ---");
        System.out.print("Digite uma senha (mínimo 8 caracteres): ");
        senha = sc.nextLine();

        while (!validarSenha(senha)) {
            System.out.println("Senha inválida! Deve ter pelo menos 8 caracteres.");
            System.out.print("Digite uma senha novamente: ");
            senha = sc.nextLine();
        }

        System.out.println("Senha válida!");

        sc.close();
    }
}
