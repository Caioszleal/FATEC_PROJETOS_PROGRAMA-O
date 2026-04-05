# Versão 1 - Procedural

contador = 0
frase = str(input("Digite uma palavra ou frase: ")).strip()
vogais = "aeiouAEIOU"

for caracter in frase:
    if caracter in vogais:
        contador += 1

print("O número de vogais na sua frase/palavra é",contador)

# Versão 2 - Modular com Funções

def contar_vogais(frase):
    vogais = "aeiouAEIOU"
    contador = 0
    for caracter in frase:
        if caracter in vogais:
            contador += 1
    return contador

# Programa principal

frase = str(input("Digite uma palavra ou frase: ")).strip()
nvogais = contar_vogais(frase)
print(f"O número de vogais na frase/palavra é {nvogais}.")
