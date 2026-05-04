
public class ContaBancaria {
    private String titular;
    private double saldo;

    // Construtor
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado.");
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else if (valor <= 0) {
            System.out.println("Valor inválido.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
        }
    }

    public void verSaldo() {
        System.out.println("Titular: " + titular + " | Saldo atual: R$" + saldo);
    }

    public void transferir(ContaBancaria outraConta, double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido.");
        } else if (saldo < valor) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            outraConta.saldo += valor;
            System.out.println("Transferência realizada.");
        }
    }
}

//TESTE

class Main{
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Caio", 1000);
        ContaBancaria conta2 = new ContaBancaria("João", 500);

        conta1.depositar(200);
        conta1.sacar(150);
        conta1.verSaldo();

        conta1.transferir(conta2, 300);

        conta1.verSaldo();
        conta2.verSaldo();
    }
}
