package exercicio_02;

public class TestFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("João da Silva", "Rua A, 123", "123-456-7890", 1000, 200);

        System.out.println(fornecedor);

        System.out.println("\nNome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Saldo: " + fornecedor.obterSaldo());
    }
}
