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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Gerenciador de Estoque ===");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Fechamento do estoque");
            System.out.println("4 - Sair");

            System.out.print("Escolha: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Quantidade: ");
                int quantidade = sc.nextInt();

                System.out.print("Preço: ");
                double preco = sc.nextDouble();

                produtos.add(new Produto(nome, quantidade, preco));
                System.out.println("Produto cadastrado! ✅");
            }

            else if (opcao == 2) {
                if (produtos.isEmpty()) {
                    System.out.println("Nenhum produto cadastrado.");
                } else {
                    for (Produto p : produtos) {
                        String alerta = (p.quantidade < 5) ? " [REPOSIÇÃO NECESSÁRIA]" : "";

                        System.out.println("Produto: " + p.nome + alerta);
                        System.out.println("Quantidade: " + p.quantidade);
                        System.out.printf("Preço: R$ %.2f\n", p.preco);
                        System.out.println("---------------------");
                    }
                }
            }

            else if (opcao == 3) {
                double total = 0;

                System.out.println("\n=== FECHAMENTO DO ESTOQUE ===");

                for (Produto p : produtos) {
                    double subtotal = p.quantidade * p.preco;
                    total += subtotal;

                    String alerta = (p.quantidade < 5) ? " [REPOSIÇÃO NECESSÁRIA]" : "";

                    System.out.printf("%s - Qtd: %d - Valor: R$ %.2f%s\n",
                            p.nome, p.quantidade, subtotal, alerta);
                }

                System.out.printf("\nValor total: R$ %.2f\n", total);
            }

            else if (opcao == 4) {
                System.out.println("Encerrando... 👋");
                break;
            }

            else {
                System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}
