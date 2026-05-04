
class ContaBancaria:
    def __init__(self, titular, saldo=0):
        self.titular = titular  #atributo público
        self._saldo = saldo      #atributo "protegido"


    def depositar(self, valor):
        if valor > 0:
            self._saldo += valor
            print(f"Depósito de R${valor} realizado com sucesso.")
        else:
            print("Valor inválido para depósito.")


    def sacar(self, valor):
        if valor > self._saldo:
            print("Saldo insuficiente.")
        elif valor <= 0:
            print("Valor inválido para saque.")
        else:
            self._saldo -= valor
            print(f"Saque de R${valor} realizado com sucesso.")


    def ver_saldo(self):
        print(f"Saldo atual: R${self._saldo}")


    def transferir(self, outra_conta, valor):
        if valor <= 0:
            print("Valor inválido para tranferência.")
        elif self._saldo < valor:
            print("Saldo insuficiente para tranferência.")
        else:
            self._saldo -= valor
            outra_conta._saldo += valor
            print(f"Tranferência de R${valor} realizada com sucesso.")

#Teste

conta1 = ContaBancaria("Caio", 1000)
conta2 = ContaBancaria("João", 500)

conta1.depositar(200)
conta1.sacar(150)
conta1.ver_saldo()

conta1.transferir(conta2, 300)

conta1.ver_saldo()
conta2.ver_saldo()
