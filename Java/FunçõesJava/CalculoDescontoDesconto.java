import java.util.Scanner;

public class CalculoDescontoDesconto {

    // Versão 2 - Modular com Função
    public static double aplicarDesconto(double valor, int desconto) {
        double calculoDesconto = valor * (desconto / 100.0);
        return valor - calculoDesconto;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Versão 1 - Procedural
        System.out.println("--- Versão Procedural ---");
        System.out.print("Digite o valor da compra (em R$): ");
        double valor = sc.nextDouble();

        System.out.print("Digite o desconto aplicado sobre a compra: ");
        int desconto = sc.nextInt();

        double calculoDesconto = valor * (desconto / 100.0);
        System.out.println("O valor final da compra com desconto será de R$" 
                           + (valor - calculoDesconto));

        // Versão 2 - Modular
        System.out.println("\n--- Versão Modular com Função ---");
        System.out.print("Digite o valor da compra (em R$): ");
        valor = sc.nextDouble();

        System.out.print("Digite o desconto aplicado sobre a compra: ");
        desconto = sc.nextInt();

        double valorFinal = aplicarDesconto(valor, desconto);
        System.out.println("O valor final da compra com o desconto é de R$" + valorFinal);

        sc.close();
    }
}
