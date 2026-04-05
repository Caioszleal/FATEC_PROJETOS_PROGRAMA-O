# Versão 1 - Procedural

valor = float(input("Digite o valor da compra(em R$): "))
desconto = int(input("Digite o desconto aplicado sobre a compra: "))

calculodesconto = valor * (desconto/100)

print(f"O valor final da compra com desconto será de R${valor - calculodesconto}")

# Versão 2 - Modular com Funções

def aplicar_desconto(valor, desconto):
    calculodesconto = valor * (desconto/100)
    print(f"O valor final da compra com o desconto é de R${valor - calculodesconto}")

# Programa principal

valor = float(input("Digite o valor da compra(em R$): "))
desconto = int(input("Digite o desconto aplicado sobre a compra: "))
valorfinal = aplicar_desconto(valor, desconto)
