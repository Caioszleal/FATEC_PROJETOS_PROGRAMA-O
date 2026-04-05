# Versão 1 - Procedural

lado1 = float(input("Digite o comprimento do lado 1(em metros): "))
lado2 = float(input("Digite o comprimento do lado 2(em metros): "))
lado3 = float(input("Digite o comprimento do lado 3(em metros): "))

if lado1 == lado2 == lado3:
    print("O triângulo é Equilátero.")
elif lado1 == lado2 or lado2 == lado3 or lado3 == lado1:
    print("O triângulo é Isósceles.")
else:
    print("O triângulo é Escaleno")

# Versão 2 - Modular com Funções

def classificar_triangulo(lado1, lado2, lado3):
    if lado1 == lado2 == lado3:
        print("O triângulo é Equilátero.")
    elif lado1 == lado2 or lado2 == lado3 or lado3 == lado1:
        print("O triângulo é Isósceles.")
    else:
        print("O triângulo é Escaleno.")

# Programa principal

lado1 = float(input("Digite o comprimento do lado 1(em metros): "))
lado2 = float(input("Digite o comprimento do lado 2(em metros): "))
lado3 = float(input("Digite o comprimento do lado 3(em metros): "))
classificação = classificar_triangulo(lado1, lado2, lado3)
