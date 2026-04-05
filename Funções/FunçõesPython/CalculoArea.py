#Versão 1 - Procedural

altura = float(input("Coloque o valor da altura em metros: "))
largura = float(input("Coloque o valor da largura em metros: "))

Area = altura * largura

print(f"A área é {Area}m²")

#Versão 2 - Modular em função

def verificar_paridade(altura, largura):
    return altura * largura

# Programa principal

altura = float(input("Coloque o valor da altura em metros: "))
largura = float(input("Coloque o valor da largura em metros: "))
area = verificar_paridade()(altura, largura)
print(f"O valor da área do retângulo é {area}m²")

