import java.util.Scanner;

public class CalculoArea {

    // Versão 2 - Modular com função
    public static double calcularArea(double altura, double largura) {
        return altura * largura;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Versão 1 - Procedural
        System.out.println("--- Versão Procedural ---");
        System.out.print("Coloque o valor da altura em metros: ");
        double altura = sc.nextDouble();

        System.out.print("Coloque o valor da largura em metros: ");
        double largura = sc.nextDouble();

        double area = altura * largura;
        System.out.println("A área é " + area + " m²");

        // Versão 2 - Modular com Função
        System.out.println("\n--- Versão Modular com Função ---");
        System.out.print("Coloque o valor da altura em metros: ");
        altura = sc.nextDouble();

        System.out.print("Coloque o valor da largura em metros: ");
        largura = sc.nextDouble();

        area = calcularArea(altura, largura);
        System.out.println("O valor da área do retângulo é " + area + " m²");

        sc.close();
    }
}
