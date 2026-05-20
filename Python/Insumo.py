class Insumo:

    # Construtor
    def __init__(self, nome, quantidade, mes_validade):
        self.__nome = nome
        self.__quantidade = quantidade
        self.__mes_validade = 1  # valor padrão seguro

        # Usa o método validador
        self.set_mes_validade(mes_validade)

    # Getter do nome
    def get_nome(self):
        return self.__nome

    # Getter da quantidade
    def get_quantidade(self):
        return self.__quantidade

    # Getter do mês de validade
    def get_mes_validade(self):
        return self.__mes_validade

    # Setter com validação
    def set_mes_validade(self, mes):

        # Verifica se o mês está entre 1 e 12
        if 1 <= mes <= 12:
            self.__mes_validade = mes
        else:
            print("⚠ ERRO: mês inválido! Digite um valor entre 1 e 12.")

    # Verifica se o produto ainda está válido
    def esta_valido(self, mes_atual):

        return self.__mes_validade >= mes_atual

    # Exibir informações
    def exibir_info(self):
        print(f"Nome: {self.__nome}")
        print(f"Quantidade: {self.__quantidade}")
        print(f"Mês de validade: {self.__mes_validade}")


# Programa principal
amendoim = Insumo("Amendoim", 10, 8)

amendoim.exibir_info()

# Tentativa inválida
amendoim.set_mes_validade(15)

# Verificação
mes_atual = 6

if amendoim.esta_valido(mes_atual):
    print("✅ Insumo válido para uso.")
else:
    print("❌ Insumo vencido.")