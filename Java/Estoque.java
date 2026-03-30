import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    String nome;
    int quantidade;
    double preco;

    Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}

public class Estoque {

    public static String verificarEstoqueCritico(int quantidade) {
        if (quantidade < 5) {
            return " [REPOSIÇÃO NECESSÁRIA]";
        }
        return "";
    }

    public static void exibirCabecalho() {
        System.out.println("==================================");
        System.out.println("        SORVETERIA DO CACA 🍦");
        System.out.println("==================================");
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Produto> produtos = new ArrayList<>();

            while (true) {
                exibirCabecalho();

                System.out.println("\n--- Gerenciador de Estoque ---");
                System.out.println("1 - Adicionar novo produto");
                System.out.println("2 - Listar produtos");
                System.out.println("3 - Fechamento do estoque");
                System.out.println("4 - Sair");

                System.out.print("Escolha uma opção: ");
                String opcao = sc.nextLine();

                switch (opcao) {
                    case "1":
                        try {
                            System.out.print("Nome do produto: ");
                            String nome = sc.nextLine();

                            System.out.print("Quantidade em estoque: ");
                            int quantidade = Integer.parseInt(sc.nextLine());

                            System.out.print("Preço unitário: ");
                            double preco = Double.parseDouble(sc.nextLine());

                            if (quantidade < 0) {
                                System.out.println("Erro: quantidade não pode ser negativa!");
                            } else {
                                produtos.add(new Produto(nome, quantidade, preco));
                                System.out.println("Produto cadastrado com sucesso ✅");
                            }

                        } catch (Exception e) {
                            System.out.println("Erro: digite valores válidos!");
                        }
                        break;

                    case "2":
                        if (produtos.isEmpty()) {
                            System.out.println("Nenhum produto cadastrado.");
                        } else {
                            for (Produto p : produtos) {
                                String alerta = verificarEstoqueCritico(p.quantidade);

                                System.out.println("\nProduto: " + p.nome + alerta);
                                System.out.println("Quantidade: " + p.quantidade);
                                System.out.printf("Preço: R$ %.2f\n", p.preco);
                            }
                        }
                        break;

                    case "3":
                        double total = 0;

                        for (Produto p : produtos) {
                            double subtotal = p.quantidade * p.preco;
                            total += subtotal;

                            String alerta = verificarEstoqueCritico(p.quantidade);

                            System.out.println(p.nome + alerta);
                            System.out.printf("Valor: R$ %.2f\n", subtotal);
                        }

                        System.out.printf("\nValor total em estoque: R$ %.2f\n", total);
                        break;

                    case "4":
                        System.out.println("Encerrando o sistema... 👋");
                        return;

                    default:
                        System.out.println("Opção inválida!");
                }
            }
        }
    }
}
