# Versão 1 - Procedural

Celsius = float(input("Digite a temperatura em graus Celsius: "))
Fahrenheit = (Celsius * 9/5) + 32

print(f"A temperatura {Celsius}° Celsius equivale a {Fahrenheit}° Fahrenheit")


# Versão 2 - Modular com Funções

def celsius_para_fahrenheit(Celsius):
    return (Celsius * 9/5) + 32

# Programa principal

Celsius = float(input("Digite a temperatura em graus Celsius: "))
Fahrenheit = celsius_para_fahrenheit(Celsius)
print(f"A tmeperatura {Celsius}° é igual a {Fahrenheit}° Fahrenheit")
