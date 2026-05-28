import java.io.*;
import java.util.Scanner;

public class SistemaEstoque {

    static final String ARQUIVO_ESTOQUE = "estoque.txt";

    // ------------------------------------------
    // CRIA O ARQUIVO SE NÃO EXISTIR
    // ------------------------------------------
    public static void inicializarArquivo() {

        File arquivo = new File(ARQUIVO_ESTOQUE);

        try {

            if (!arquivo.exists()) {

                System.out.println("Arquivo não encontrado.");
                System.out.println("Criando arquivo automaticamente...");

                FileWriter writer = new FileWriter(arquivo);
                writer.write("50");
                writer.close();

                System.out.println("Arquivo criado com estoque inicial de 50.");
            }

        } catch (IOException erro) {
            System.out.println("Erro ao criar arquivo.");
        }
    }

    // ------------------------------------------
    // LER ESTOQUE
    // ------------------------------------------
    public static int lerEstoque() throws IOException {

        BufferedReader reader = new BufferedReader(
                new FileReader(ARQUIVO_ESTOQUE)
        );

        int estoque = Integer.parseInt(reader.readLine());

        reader.close();

        return estoque;
    }

    // ------------------------------------------
    // SALVAR ESTOQUE
    // ------------------------------------------
    public static void salvarEstoque(int estoque) throws IOException {

        FileWriter writer = new FileWriter(ARQUIVO_ESTOQUE);

        writer.write(String.valueOf(estoque));

        writer.close();
    }

    // ------------------------------------------
    // MAIN
    // ------------------------------------------
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        inicializarArquivo();

        try {

            int estoque = lerEstoque();

            System.out.println("\n===== SISTEMA DE ESTOQUE =====");
            System.out.println("Estoque atual: " + estoque);

            System.out.print("Quantidade vendida: ");

            int venda = scanner.nextInt();

            if (venda <= 0) {

                System.out.println("Erro: valor deve ser maior que zero.");

            } else if (venda > estoque) {

                System.out.println("Erro: estoque insuficiente.");

            } else {

                estoque -= venda;

                salvarEstoque(estoque);

                System.out.println("\nVenda realizada com sucesso.");
                System.out.println("Novo estoque: " + estoque);
            }

        } catch (NumberFormatException erro) {

            System.out.println("Erro: arquivo corrompido.");

        } catch (IOException erro) {

            System.out.println("Erro ao acessar arquivo.");

        } catch (Exception erro) {

            System.out.println("Erro: digite apenas números inteiros.");

        } finally {

            scanner.close();

            System.out.println(
                    "\nRotina de persistência finalizada, recursos liberados."
            );
        }
    }
}