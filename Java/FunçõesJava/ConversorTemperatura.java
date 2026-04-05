import java.util.Scanner;

public class ConversorTemperatura {

    // Versão 2 - Modular com Função
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Versão 1 - Procedural
        System.out.println("--- Versão Procedural ---");
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("A temperatura " + celsius + "° Celsius equivale a " 
                           + fahrenheit + "° Fahrenheit");

        // Versão 2 - Modular
        System.out.println("\n--- Versão Modular com Função ---");
        System.out.print("Digite a temperatura em graus Celsius: ");
        celsius = sc.nextDouble();

        fahrenheit = celsiusParaFahrenheit(celsius);
        System.out.println("A temperatura " + celsius + "° é igual a " 
                           + fahrenheit + "° Fahrenheit");

        sc.close();
    }
}
