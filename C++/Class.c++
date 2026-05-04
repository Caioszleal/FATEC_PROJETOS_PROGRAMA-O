
#include <iostream>
using namespace std;

class ContaBancaria {
private:
    string titular;
    double saldo;

public:
    // Construtor
    ContaBancaria(string t, double s) {
        titular = t;
        saldo = s;
    }

    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            cout << "Deposito de R$" << valor << " realizado." << endl;
        } else {
            cout << "Valor invalido." << endl;
        }
    }

    void sacar(double valor) {
        if (valor > saldo) {
            cout << "Saldo insuficiente." << endl;
        } else if (valor <= 0) {
            cout << "Valor invalido." << endl;
        } else {
            saldo -= valor;
            cout << "Saque de R$" << valor << " realizado." << endl;
        }
    }

    void verSaldo() {
        cout << "Saldo atual: R$" << saldo << endl;
    }

    void transferir(ContaBancaria &outraConta, double valor) {
        if (valor <= 0) {
            cout << "Valor invalido." << endl;
        } else if (saldo < valor) {
            cout << "Saldo insuficiente." << endl;
        } else {
            saldo -= valor;
            outraConta.saldo += valor;
            cout << "Transferencia realizada." << endl;
        }
    }
};

//TESTE

int main() {
    ContaBancaria conta1("Caio", 1000);
    ContaBancaria conta2("João", 500);

    conta1.depositar(200);
    conta1.sacar(150);
    conta1.verSaldo();

    conta1.transferir(conta2, 300);

    conta1.verSaldo();
    conta2.verSaldo();

    return 0;
}
