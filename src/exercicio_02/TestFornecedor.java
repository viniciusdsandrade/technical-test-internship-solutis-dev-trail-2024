package exercicio_02;

public class TestFornecedor {

    public static void main(String[] args) {
        // Testando construtor padrão
        Fornecedor fornecedor1 = new Fornecedor();
        fornecedor1.setNome("Vinícius Andrade");
        fornecedor1.setEndereco("Rua A, 123");
        fornecedor1.setTelefone("(11) 98765-4321");
        fornecedor1.setValorCredito(10000.00);
        fornecedor1.setValorDivida(2500.00);
        System.out.println("Fornecedor1 (construtor padrão):");
        System.out.println(fornecedor1);

        // Testando construtor com nome, valorCredito e valorDivida
        Fornecedor fornecedor2 = new Fornecedor("Bianca Coelho", 15000.00, 3500.00);
        fornecedor2.setEndereco("Rua B, 456");
        fornecedor2.setTelefone("(21) 91234-5678");
        System.out.println("Fornecedor2 (construtor com nome, valorCredito e valorDivida):");
        System.out.println(fornecedor2);

        // Testando construtor com nome, endereço, valorCredito e valorDivida
        Fornecedor fornecedor3 = new Fornecedor("Lucas Silva", "Rua C, 789", 20000.00, 5000.00);
        fornecedor3.setTelefone("(31) 99876-5432");
        System.out.println("Fornecedor3 (construtor com nome, endereço, valorCredito e valorDivida):");
        System.out.println(fornecedor3);

        // Testando construtor com todos os atributos
        Fornecedor fornecedor4 = new Fornecedor("Mariana Souza", "Rua D, 101", "(41) 98765-4321", 25000.00, 7500.00);
        System.out.println("Fornecedor4 (construtor com todos os atributos):");
        System.out.println(fornecedor4);

        // Testando getters
        System.out.println("Getters de fornecedor4:");
        System.out.println("Nome: " + fornecedor4.getNome());
        System.out.println("Endereço: " + fornecedor4.getEndereco());
        System.out.println("Telefone: " + fornecedor4.getTelefone());
        System.out.println("Valor Crédito: " + fornecedor4.getValorCredito());
        System.out.println("Valor Dívida: " + fornecedor4.getValorDivida());
        System.out.println("Saldo: " + fornecedor4.obterSaldo());

        // Testando equals (deve ser true)
        Fornecedor fornecedor5 = new Fornecedor("Mariana Souza", "Rua D, 101", "(41) 98765-4321", 25000.00, 7500.00);
        System.out.println("Fornecedor4 é igual a fornecedor5? " + fornecedor4.equals(fornecedor5));

        // Testando equals (deve ser false)
        Fornecedor fornecedor6 = new Fornecedor("João Pereira", "Rua E, 202", "(51) 97654-3210", 30000.00, 10000.00);
        System.out.println("Fornecedor4 é igual a fornecedor6? " + fornecedor4.equals(fornecedor6));

        // Testando hashCode
        System.out.println("HashCode de fornecedor4: " + fornecedor4.hashCode());
        System.out.println("HashCode de fornecedor5: " + fornecedor5.hashCode());
        System.out.println("HashCode de fornecedor6: " + fornecedor6.hashCode());

        // Testando toString
        System.out.println("toString de fornecedor4:");
        System.out.println(fornecedor4);

        // Criação de objeto original
        Fornecedor fornecedorOriginal = new Fornecedor("Vinícius Andrade", "Rua A, 123", "(11) 98765-4321", 10000.00, 2500.00);

        // Criando cópia profunda usando o construtor de cópia
        Fornecedor fornecedorCopiaConstrutor = new Fornecedor(fornecedorOriginal);

        // Criando cópia profunda usando o metodo clone
        Fornecedor fornecedorCopiaClone = (Fornecedor) fornecedorOriginal.clone();

        System.out.println("Fornecedor original:");
        System.out.println(fornecedorOriginal);

        System.out.println("Fornecedor cópia (construtor):");
        System.out.println(fornecedorCopiaConstrutor);

        System.out.println("Fornecedor cópia (clone):");
        System.out.println(fornecedorCopiaClone);

        System.out.println("hashCode de fornecedorOriginal:         " + fornecedorOriginal.hashCode());
        System.out.println("hashCode de fornecedorCopiaConstrutor:  " + fornecedorCopiaConstrutor.hashCode());
        System.out.println("hashCode de fornecedorCopiaClone:       " + fornecedorCopiaClone.hashCode());

        // Comparando endereços de memória
        System.out.println("fornecedorOriginal == fornecedorCopiaConstrutor? " + (fornecedorOriginal == fornecedorCopiaConstrutor));  // false
        System.out.println("fornecedorOriginal == fornecedorCopiaClone? " + (fornecedorOriginal == fornecedorCopiaClone));  // false

        // Comparando conteúdo
        System.out.println("fornecedorOriginal.equals(fornecedorCopiaConstrutor)? " + fornecedorOriginal.equals(fornecedorCopiaConstrutor)); // true
        System.out.println("fornecedorOriginal.equals(fornecedorCopiaClone)? " + fornecedorOriginal.equals(fornecedorCopiaClone)); // true

        System.out.println("Modificando o nome da cópia (construtor)...");
        fornecedorCopiaConstrutor.setNome("Lucas Silva");
        System.out.println("Nome do original: " + fornecedorOriginal.getNome()); // Vinícius Andrade
        System.out.println("Nome da cópia (construtor): " + fornecedorCopiaConstrutor.getNome()); // Lucas Silva

        System.out.println("Modificando o endereço da cópia (clone)...");
        fornecedorCopiaClone.setEndereco("Rua B, 456");
        System.out.println("Endereço do original: " + fornecedorOriginal.getEndereco()); // Rua A, 123
        System.out.println("Endereço da cópia (clone): " + fornecedorCopiaClone.getEndereco()); // Rua B, 456
    }
}
