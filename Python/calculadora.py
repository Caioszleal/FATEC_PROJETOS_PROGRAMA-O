# Calculadora simples em Python

print("=== Calculadora ===")

# Entrada de números
num1 = float(input("Digite o primeiro número: "))
num2 = float(input("Digite o segundo número: "))

# Menu de operações
print("\nEscolha a operação:")
print("1 - Soma")
print("2 - Subtração")
print("3 - Multiplicação")
print("4 - Divisão")

operacao = input("Digite o número da operação: ")

# Cálculo
if operacao == "1":
    resultado = num1 + num2
    print("Resultado:", resultado)

elif operacao == "2":
    resultado = num1 - num2
    print("Resultado:", resultado)

elif operacao == "3":
    resultado = num1 * num2
    print("Resultado:", resultado)

elif operacao == "4":
    if num2 != 0:
        resultado = num1 / num2
        print("Resultado:", resultado)
    else:
        print("Erro: divisão por zero!")

else:
    print("Operação inválida!")
