#include <iostream>
using namespace std;

string gerarMensagem(string nome, int idade){
    return "Seja bem-vindo(a), " + nome + "! Você tem " + to_string(idade) + " anos.";
}

int main(){
    string nome;
    int idade;

    cout << "--- Procedural ---\n";
    cout << "Nome: ";
    cin >> nome;
    cout << "Idade: ";
    cin >> idade;

    cout << "Seja bem-vindo(a), " << nome << "! Você tem " << idade << " anos.\n";

    cout << "\n--- Modular ---\n";
    cout << gerarMensagem(nome, idade);

    return 0;
}
