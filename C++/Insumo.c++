#include <iostream>
#include <string>

using namespace std;

class Insumo {

private:
    string nome;
    int quantidade;
    int mesValidade;

public:

    // Construtor
    Insumo(string nome, int quantidade, int mesValidade) {
        this->nome = nome;
        this->quantidade = quantidade;

        // valor padrão seguro
        this->mesValidade = 1;

        // usa o método validador
        setMesValidade(mesValidade);
    }

    // Getter do nome
    string getNome() {
        return nome;
    }

    // Getter da quantidade
    int getQuantidade() {
        return quantidade;
    }

    // Getter do mês de validade
    int getMesValidade() {
        return mesValidade;
    }

    // Setter com validação
    void setMesValidade(int mes) {

        if (mes >= 1 && mes <= 12) {
            mesValidade = mes;
        }
        else {
            cout << "⚠ ERRO: mês inválido! Digite um valor entre 1 e 12." << endl;
        }
    }

    // Verifica se o insumo ainda está válido
    bool estaValido(int mesAtual) {

        return mesValidade >= mesAtual;
    }

    // Exibir informações
    void exibirInfo() {

        cout << "Nome: " << nome << endl;
        cout << "Quantidade: " << quantidade << endl;
        cout << "Mês de validade: " << mesValidade << endl;
    }
};

int main() {

    // Criando um insumo válido
    Insumo amendoim("Amendoim", 10, 8);

    amendoim.exibirInfo();

    // Tentativa inválida
    amendoim.setMesValidade(13);

    // Verificação
    int mesAtual = 6;

    if (amendoim.estaValido(mesAtual)) {
        cout << "✅ Insumo válido para uso." << endl;
    }
    else {
        cout << "❌ Insumo vencido." << endl;
    }

    return 0;
}