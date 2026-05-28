# ==========================================
# SISTEMA DE ESTOQUE RESILIENTE
# Linguagem de Programação I
# ==========================================

ARQUIVO_ESTOQUE = "estoque.txt"


# ------------------------------------------
# FUNÇÃO PARA CRIAR O ARQUIVO SE NÃO EXISTIR
# ------------------------------------------
def inicializar_arquivo():
    try:
        with open(ARQUIVO_ESTOQUE, "r") as arquivo:
            pass

    except FileNotFoundError:
        print("Arquivo de estoque não encontrado.")
        print("Criando arquivo automaticamente...")

        with open(ARQUIVO_ESTOQUE, "w") as arquivo:
            arquivo.write("50")

        print("Arquivo criado com estoque inicial de 50 produtos.")


# ------------------------------------------
# FUNÇÃO PARA LER O ESTOQUE
# ------------------------------------------
def ler_estoque():
    with open(ARQUIVO_ESTOQUE, "r") as arquivo:
        estoque = int(arquivo.read())

    return estoque


# ------------------------------------------
# FUNÇÃO PARA SALVAR O ESTOQUE
# ------------------------------------------
def salvar_estoque(estoque):
    with open(ARQUIVO_ESTOQUE, "w") as arquivo:
        arquivo.write(str(estoque))


# ------------------------------------------
# FUNÇÃO PRINCIPAL
# ------------------------------------------
def sistema_estoque():

    try:
        estoque = ler_estoque()

        print("\n===== SISTEMA DE ESTOQUE =====")
        print(f"Estoque atual: {estoque}")

        venda = int(input("Quantidade vendida: "))

        if venda <= 0:
            print("Erro: A quantidade deve ser maior que zero.")

        elif venda > estoque:
            print("Erro: Estoque insuficiente.")

        else:
            estoque -= venda

            salvar_estoque(estoque)

            print("\nVenda realizada com sucesso.")
            print(f"Novo estoque: {estoque}")

    except ValueError:
        print("Erro: Digite apenas números inteiros.")

    except Exception as erro:
        print(f"Erro inesperado: {erro}")

    finally:
        print("\nRotina de persistência finalizada, recursos liberados.")


# ------------------------------------------
# EXECUÇÃO DO SISTEMA
# ------------------------------------------
inicializar_arquivo()
sistema_estoque()