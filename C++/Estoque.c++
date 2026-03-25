#include <iostream>
#include <vector>
#include <iomanip>
using namespace std;

struct Produto {
    string nome;
    int quantidade;
    double preco;
};

int main() {
    vector<Produto> produtos;
    int opcao;

    while (true) {
        cout << "\n=== Gerenciador de Estoque ===\n";
        cout << "1 - Adicionar produto\n";
        cout << "2 - Listar produtos\n";
        cout << "3 - Fechamento do estoque\n";
        cout << "4 - Sair\n";
        cout << "Escolha: ";
        cin >> opcao;
        cin.ignore();

        if (opcao == 1) {
            Produto p;

            cout << "Nome: ";
            getline(cin, p.nome);

            cout << "Quantidade: ";
            cin >> p.quantidade;

            cout << "Preço: ";
            cin >> p.preco;

            produtos.push_back(p);
            cout << "Produto cadastrado! ✅\n";
        }

        else if (opcao == 2) {
            if (produtos.empty()) {
                cout << "Nenhum produto cadastrado.\n";
            } else {
                for (auto &p : produtos) {
                    string alerta = (p.quantidade < 5) ? " [REPOSIÇÃO NECESSÁRIA]" : "";

                    cout << "Produto: " << p.nome << alerta << endl;
                    cout << "Quantidade: " << p.quantidade << endl;
                    cout << "Preço: R$ " << fixed << setprecision(2) << p.preco << endl;
                    cout << "---------------------\n";
                }
            }
        }

        else if (opcao == 3) {
            double total = 0;

            cout << "\n=== FECHAMENTO DO ESTOQUE ===\n";

            for (auto &p : produtos) {
                double subtotal = p.quantidade * p.preco;
                total += subtotal;

                string alerta = (p.quantidade < 5) ? " [REPOSIÇÃO NECESSÁRIA]" : "";

                cout << p.nome << " - Qtd: " << p.quantidade
                     << " - Valor: R$ " << fixed << setprecision(2)
                     << subtotal << alerta << endl;
            }

            cout << "\nValor total: R$ " << fixed << setprecision(2) << total << endl;
        }

        else if (opcao == 4) {
            cout << "Encerrando... 👋\n";
            break;
        }

        else {
            cout << "Opção inválida!\n";
        }
    }

    return 0;
}
