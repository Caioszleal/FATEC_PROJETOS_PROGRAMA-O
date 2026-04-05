#include <iostream>
using namespace std;

double aplicarDesconto(double valor, int desconto){
    return valor - (valor * desconto/100.0);
}

int main(){
    double valor;
    int desconto;

    cout << "--- Procedural ---\n";
    cin >> valor >> desconto;
    cout << valor - (valor * desconto/100.0) << endl;

    cout << "--- Modular ---\n";
    cout << aplicarDesconto(valor, desconto);

    return 0;
}
