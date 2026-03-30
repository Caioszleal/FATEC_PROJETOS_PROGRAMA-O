#include <iostream>
#include <vector>
#include <iomanip>

using namespace std;

struct Produto {
    string nome;
    int quantidade;
    double preco;
};

string verificarEstoqueCritico(int quantidade) {
    if (quantidade < 5) {
        return " [REPOSIÇÃO NECESSÁRIA]";
    }
    return "";
}

void exibirCabecalho() {
    cout << "==================================" << endl;
    cout << "       SORVETERIA DO CACA 🍦" << endl;
    cout << "==================================" << endl;
}

int main() {

    vector<Produto> produtos;
    int opcao;

    while (true) {

        exibirCabecalho();

        cout << "\n--- Gerenciador de Estoque ---" << endl;
        cout << "1 - Adicionar novo produto" << endl;
        cout << "2 - Listar produtos" << endl;
        cout << "3 - Fechamento do estoque" << endl;
        cout << "4 - Sair" << endl;
        cout << "Escolha uma opção: ";
        cin >> opcao;
        cin.ignore();

        if (opcao == 1) {
            Produto p;

            cout << "Nome do produto: ";
            getline(cin, p.nome);

            cout << "Quantidade em estoque: ";
            cin >> p.quantidade;

            cout << "Preço unitário: ";
            cin >> p.preco;

            if (p.quantidade < 0) {
                cout << "Erro: quantidade não pode ser negativa!" << endl;
            } else {
                produtos.push_back(p);
                cout << "Produto cadastrado com sucesso ✅" << endl;
            }

        } else if (opcao == 2) {

            if (produtos.empty()) {
                cout << "Nenhum produto cadastrado." << endl;
            } else {
                for (auto &p : produtos) {

                    string alerta = verificarEstoqueCritico(p.quantidade);

                    cout << "\nProduto: " << p.nome << alerta << endl;
                    cout << "Quantidade: " << p.quantidade << endl;
                    cout << fixed << setprecision(2);
                    cout << "Preço: R$ " << p.preco << endl;
                }
            }

        } else if (opcao == 3) {

            double total = 0;

            for (auto &p : produtos) {
                double subtotal = p.quantidade * p.preco;
                total += subtotal;

                string alerta = verificarEstoqueCritico(p.quantidade);

                cout << p.nome << alerta << endl;
                cout << "Valor: R$ " << fixed << setprecision(2) << subtotal << endl;
            }

            cout << "\nValor total em estoque: R$ " << total << endl;

        } else if (opcao == 4) {

            cout << "Encerrando o sistema... 👋" << endl;
            break;

        } else {
            cout << "Opção inválida!" << endl;
        }
    }

    return 0;
}
