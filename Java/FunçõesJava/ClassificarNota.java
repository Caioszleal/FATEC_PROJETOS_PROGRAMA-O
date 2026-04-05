import java.util.Scanner;

public class ClassificarNota {

    // Versão 2 - Modular com Função
    public static void classificarNota(int nota) {
        if (nota >= 90 && nota <= 100) {
            System.out.println("O aluno tirou nota A.   (❁´◡`❁)");
        } else if (nota >= 80 && nota <= 89) {
            System.out.println("O aluno tirou nota B.   ╰(*°▽°*)╯");
        } else if (nota >= 70 && nota <= 79) {
            System.out.println("O aluno tirou nota C.   ^_^");
        } else if (nota >= 60 && nota <= 69) {
            System.out.println("O aluno tirou nota D.   ಠ_ಠ");
        } else {
            System.out.println("O aluno tirou nota E.   (┬┬﹏┬┬)");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Versão 1 - Procedural
        System.out.println("--- Versão Procedural ---");
        System.out.print("Digite a nota tirada (entre 0 e 100): ");
        int nota = sc.nextInt();

        if (nota >= 90 && nota <= 100) {
            System.out.println("O aluno tirou nota A.   (❁´◡`❁)");
        } else if (nota >= 80 && nota <= 89) {
            System.out.println("O aluno tirou nota B.   ╰(*°▽°*)╯");
        } else if (nota >= 70 && nota <= 79) {
            System.out.println("O aluno tirou nota C.   ^_^");
        } else if (nota >= 60 && nota <= 69) {
            System.out.println("O aluno tirou nota D.   ಠ_ಠ");
        } else {
            System.out.println("O aluno tirou nota E.   (┬┬﹏┬┬)");
        }

        // Versão 2 - Modular
        System.out.println("\n--- Versão Modular com Função ---");
        System.out.print("Digite a nota tirada (entre 0 e 100): ");
        nota = sc.nextInt();

        classificarNota(nota);

        sc.close();
    }
}
