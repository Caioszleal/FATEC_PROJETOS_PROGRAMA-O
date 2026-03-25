produtos = []

while True:
    print("\n=== Gerenciador de Estoque ===")
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
            print("Produto cadastrado com sucesso! ✅")

    elif opcao == "2":
        if len(produtos) == 0:
            print("Nenhum produto cadastrado.")
        else:
            print("\n=== Produtos em Estoque ===")
            for p in produtos:
                alerta = ""
                if p["quantidade"] < 5:
                    alerta = " [REPOSIÇÃO NECESSÁRIA]"

                print(f"Produto: {p['nome']}{alerta}")
                print(f"Quantidade: {p['quantidade']}")
                print(f"Preço: R$ {p['preco']:.2f}")
                print("---------------------------")

    elif opcao == "3":
        print("\n=== FECHAMENTO DO ESTOQUE ===")
        
        if len(produtos) == 0:
            print("Nenhum produto cadastrado.")
        else:
            total_geral = 0

            for p in produtos:
                subtotal = p["quantidade"] * p["preco"]
                total_geral += subtotal

                alerta = ""
                if p["quantidade"] < 5:
                    alerta = " [REPOSIÇÃO NECESSÁRIA]"

                print(f"{p['nome']} - Qtd: {p['quantidade']} - "
                      f"Valor: R$ {subtotal:.2f}{alerta}")

            print("\nValor total em estoque: R$ {:.2f}".format(total_geral))

    elif opcao == "4":
        print("Encerrando o sistema... 👋")
        break

    else:
        print("Opção inválida!")
