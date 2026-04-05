# Versão 1 - Procedural

numero = int(input("Digite um número: "))

if numero % 2 == 0:
    print("O número é par.")
else:
    print("O número é ímpar.")


# Versão 2 - Modular com Funções

def verificar_paridade(numero):
    if numero % 2 == 0:
        print("O número é par.")
    else:
        print("O número é ímpar.")

# Programa principal
numero = int(input("Digite um número: "))
verificar_paridade(numero)

