public class Insumo {

    // Atributos privados (encapsulamento)
    private String nome;
    private int quantidade;
    private int mesValidade;

    // Construtor
    public Insumo(String nome, int quantidade, int mesValidade) {
        this.nome = nome;
        this.quantidade = quantidade;

        // usa o método validador
        setMesValidade(mesValidade);
    }

    // Getter do nome
    public String getNome() {
        return nome;
    }

    // Getter da quantidade
    public int getQuantidade() {
        return quantidade;
    }

    // Getter do mês de validade
    public int getMesValidade() {
        return mesValidade;
    }

    // Setter com validação
    public void setMesValidade(int mes) {

        // Verifica se o mês está entre 1 e 12
        if (mes >= 1 && mes <= 12) {
            this.mesValidade = mes;
        } else {
            System.out.println("⚠ ERRO: mês inválido! Digite um valor entre 1 e 12.");
        }
    }

    // Método para verificar se o produto ainda está válido
    public boolean estaValido(int mesAtual) {

        // retorna true se o mês de validade
        // for maior ou igual ao mês atual
        return mesValidade >= mesAtual;
    }

    // Exibir informações do insumo
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Mês de validade: " + mesValidade);
    }

    // Método principal para teste
    public static void main(String[] args) {

        // Criando um insumo válido
        Insumo amendoim = new Insumo("Amendoim", 10, 8);

        amendoim.exibirInfo();

        // Tentativa de mês inválido
        amendoim.setMesValidade(13);

        // Verificando validade
        int mesAtual = 6;

        if (amendoim.estaValido(mesAtual)) {
            System.out.println("✅ Insumo válido para uso.");
        } else {
            System.out.println("❌ Insumo vencido.");
        }
    }
}