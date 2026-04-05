#Versão 1 - Procedural

senha = input("Digite uma senha (mínimo 8 caracteres): ")

while len(senha) < 8:
    print("Senha inválida! Deve ter pelo menos 8 caracteres.")
    senha = input("Digite uma senha novamente: ")

print("Senha válida!")


# Versão 2 - Modular com Funções

def validar_senha(senha):
    return len(senha) >= 8

# Programa principal

senha = input("Digite uma senha (mínimo 8 caracteres): ")

while not validar_senha(senha):
    print("Senha inválida! Deve ter pelo menos 8 caracteres.")
    senha = input("Digite uma senha novamente: ")

print("Senha válida!")

        

