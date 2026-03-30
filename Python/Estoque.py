produtos = []

def verificar_estoque_critico(quantidade):
    if quantidade < 5:
        return " [REPOSIÇÃO NECESSÁRIA]"
    return ""

def exibir_cabecalho():
    print("=" * 35)
    print("      SORVETERIA DO CACA 🍦")
    print("=" * 35)

while True:
    exibir_cabecalho()
    print("\n--- Gerenciador de Estoque ---")
    print("1 - Adicionar novo produto")
    print("2 - Listar produtos")
    print("3 - Fechamento do estoque")
    print("4 - Sair")

    opcao = input("Escolha uma opção: ")

    if opcao == "1":
        nome = input("Nome do produto: ")

        try:
            quantidade = int(input("Quantidade em estoque: "))
            preco = float(input("Preço unitário: "))
        except ValueError:
            print("Erro: digite valores válidos!")
            continue

        if quantidade < 0:
            print("Erro: a quantidade não pode ser negativa!")
        else:
            produto = {
                "nome": nome,
                "quantidade": quantidade,
                "preco": preco
            }
            produtos.append(produto)
            print("Produto cadastrado com sucesso ✅")

    elif opcao == "2":
        if len(produtos) == 0:
            print("Nenhum produto cadastrado.")
        else:
            print("\n--- Produtos em Estoque ---")
            for p in produtos:
                alerta = verificar_estoque_critico(p["quantidade"])

                print(f"Produto: {p['nome']}{alerta}")
                print(f"Quantidade: {p['quantidade']}")
                print(f"Preço: R$ {p['preco']:.2f}")
                print("-" * 30)

    elif opcao == "3":
        print("\n--- FECHAMENTO DO ESTOQUE ---")

        if len(produtos) == 0:
            print("Nenhum produto cadastrado.")
        else:
            total_geral = 0

            for p in produtos:
                subtotal = p["quantidade"] * p["preco"]
                total_geral += subtotal

                alerta = verificar_estoque_critico(p["quantidade"])

                print(f"{p['nome']}{alerta}")
                print(f"Valor: R$ {subtotal:.2f}")

            print(f"\nValor total em estoque: R$ {total_geral:.2f}")

    elif opcao == "4":
        print("Encerrando o sistema... 👋")
        break

    else:
        print("Opção inválida!")
