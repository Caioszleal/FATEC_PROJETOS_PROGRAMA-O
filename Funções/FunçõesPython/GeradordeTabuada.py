# Versão 1 - Procedural

numero = int(input("Digite um número inteiro: "))
for c in range(1,11):
    print(f"{c} x {numero} = {c*numero}")

# Versão 2 - Modular com Funções

def gerar_tabuada(numero):
    print("===== TABUADA =====")
    for c in range(1,11):
        print(f"{c} x {numero} = {c*numero}")
    print("="*20)

# Programa principal

numero = int(input("Digite um número inteiro: "))
funcao = gerar_tabuada(numero)
