import java.util.Scanner;

public class ClassificarTriangulo {

    // Versão 2 - Modular com Função
    public static void classificarTriangulo(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("O triângulo é Equilátero.");
        } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
            System.out.println("O triângulo é Isósceles.");
        } else {
            System.out.println("O triângulo é Escaleno.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Versão 1 - Procedural
        System.out.println("--- Versão Procedural ---");
        System.out.print("Digite o comprimento do lado 1 (em metros): ");
        double lado1 = sc.nextDouble();

        System.out.print("Digite o comprimento do lado 2 (em metros): ");
        double lado2 = sc.nextDouble();

        System.out.print("Digite o comprimento do lado 3 (em metros): ");
        double lado3 = sc.nextDouble();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("O triângulo é Equilátero.");
        } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
            System.out.println("O triângulo é Isósceles.");
        } else {
            System.out.println("O triângulo é Escaleno.");
        }

        // Versão 2 - Modular
        System.out.println("\n--- Versão Modular com Função ---");
        System.out.print("Digite o comprimento do lado 1 (em metros): ");
        lado1 = sc.nextDouble();

        System.out.print("Digite o comprimento do lado 2 (em metros): ");
        lado2 = sc.nextDouble();

        System.out.print("Digite o comprimento do lado 3 (em metros): ");
        lado3 = sc.nextDouble();

        classificarTriangulo(lado1, lado2, lado3);

        sc.close();
    }
}
