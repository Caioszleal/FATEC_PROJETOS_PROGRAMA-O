# Versão 1 - Procedural

nome = input("Digite seu nome: ")
idade = int(input("Digite sua idade: "))

print(f"Seja bem-vindo(a), {nome}! Você tem {idade} anos.")


# Versão 2 - Modular com Funções

def gerar_mensagem_boas_vindas(nome, idade):
    return f"Seja bem vindo! {nome} sua idade é {idade}"

# Programa principal

nome = input("Digite seu nome: ")
idade = int(input("Digite sua idade: "))
mensagem = gerar_mensagem_boas_vindas(nome, idade)
print(mensagem)
