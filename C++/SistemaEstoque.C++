#include <iostream>
#include <fstream>
#include <string>

using namespace std;

const string ARQUIVO_ESTOQUE = "estoque.txt";

// ------------------------------------------
// CRIAR ARQUIVO SE NÃO EXISTIR
// ------------------------------------------
void inicializarArquivo() {

    ifstream arquivoLeitura(ARQUIVO_ESTOQUE);

    if (!arquivoLeitura) {

        cout << "Arquivo não encontrado." << endl;
        cout << "Criando arquivo automaticamente..." << endl;

        ofstream arquivoEscrita(ARQUIVO_ESTOQUE);

        arquivoEscrita << 50;

        arquivoEscrita.close();

        cout << "Arquivo criado com estoque inicial de 50." << endl;
    }

    arquivoLeitura.close();
}

// ------------------------------------------
// LER ESTOQUE
// ------------------------------------------
int lerEstoque() {

    ifstream arquivo(ARQUIVO_ESTOQUE);

    int estoque;

    arquivo >> estoque;

    arquivo.close();

    return estoque;
}

// ------------------------------------------
// SALVAR ESTOQUE
// ------------------------------------------
void salvarEstoque(int estoque) {

    ofstream arquivo(ARQUIVO_ESTOQUE);

    arquivo << estoque;

    arquivo.close();
}

// ------------------------------------------
// MAIN
// ------------------------------------------
int main() {

    inicializarArquivo();

    try {

        int estoque = lerEstoque();

        cout << "\n===== SISTEMA DE ESTOQUE =====" << endl;
        cout << "Estoque atual: " << estoque << endl;

        int venda;

        cout << "Quantidade vendida: ";
        cin >> venda;

        // verifica erro de entrada
        if (cin.fail()) {
            throw invalid_argument("Digite apenas números.");
        }

        if (venda <= 0) {

            cout << "Erro: valor deve ser maior que zero." << endl;

        } else if (venda > estoque) {

            cout << "Erro: estoque insuficiente." << endl;

        } else {

            estoque -= venda;

            salvarEstoque(estoque);

            cout << "\nVenda realizada com sucesso." << endl;
            cout << "Novo estoque: " << estoque << endl;
        }

    } catch (invalid_argument& erro) {

        cout << "Erro: " << erro.what() << endl;

    } catch (...) {

        cout << "Erro inesperado." << endl;

    }

    cout << "\nRotina de persistência finalizada, recursos liberados." << endl;

    return 0;
}