#include <iostream>
using namespace std;

int main() {

    double num1, num2, resultado;
    int operacao;

    cout << "=== Calculadora ===" << endl;

    cout << "Digite o primeiro numero: ";
    cin >> num1;

    cout << "Digite o segundo numero: ";
    cin >> num2;

    cout << "\nEscolha a operacao:" << endl;
    cout << "1 - Soma" << endl;
    cout << "2 - Subtracao" << endl;
    cout << "3 - Multiplicacao" << endl;
    cout << "4 - Divisao" << endl;

    cin >> operacao;

    switch (operacao) {

        case 1:
            resultado = num1 + num2;
            cout << "Resultado: " << resultado << endl;
            break;

        case 2:
            resultado = num1 - num2;
            cout << "Resultado: " << resultado << endl;
            break;

        case 3:
            resultado = num1 * num2;
            cout << "Resultado: " << resultado << endl;
            break;

        case 4:
            if (num2 != 0) {
                resultado = num1 / num2;
                cout << "Resultado: " << resultado << endl;
            } else {
                cout << "Erro: divisao por zero!" << endl;
            }
            break;

        default:
            cout << "Operacao invalida!" << endl;
    }

    return 0;
}
