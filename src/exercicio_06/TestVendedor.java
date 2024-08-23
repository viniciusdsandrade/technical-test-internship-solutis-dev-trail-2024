package exercicio_06;

public class TestVendedor {
    public static void main(String[] args) {
        // Testando construtor padrão
        Vendedor vendedor1 = new Vendedor();
        vendedor1.setNome("Carlos Silva");
        vendedor1.setEndereco("Rua X, 123");
        vendedor1.setTelefone("(11) 98765-4321");
        vendedor1.setCodigoSetor(1);
        vendedor1.setSalarioBase(4000);
        vendedor1.setImposto(15);
        vendedor1.setValorVendas(2500);
        vendedor1.setComissao(10);
        System.out.println("Vendedor1 (construtor padrão):");
        System.out.println(vendedor1);

        // Testando construtor com nome, codigoSetor, salarioBase, imposto, valorVendas e comissao
        Vendedor vendedor2 = new Vendedor("Ana Costa", 2, 5000, 12, 3000, 8);
        vendedor2.setEndereco("Rua Y, 456");
        vendedor2.setTelefone("(21) 91234-5678");
        System.out.println("Vendedor2 (construtor com nome, codigoSetor, salarioBase, imposto, valorVendas e comissao):");
        System.out.println(vendedor2);

        // Testando construtor com nome, endereço, codigoSetor, salarioBase, imposto, valorVendas e comissao
        Vendedor vendedor3 = new Vendedor("Maria Oliveira", "Rua Z, 789", 3, 6000, 10, 3500, 6);
        vendedor3.setTelefone("(31) 99876-5432");
        System.out.println("Vendedor3 (construtor com nome, endereço, codigoSetor, salarioBase, imposto, valorVendas e comissao):");
        System.out.println(vendedor3);

        // Testando construtor com todos os atributos
        Vendedor vendedor4 = new Vendedor("Roberto Santos", "Rua W, 101", "(41) 98765-4321", 4, 7000, 8, 4000, 7);
        System.out.println("Vendedor4 (construtor com todos os atributos):");
        System.out.println(vendedor4);

        // Testando getters
        System.out.println("Getters de vendedor4:");
        System.out.println("Nome: " + vendedor4.getNome());
        System.out.println("Endereço: " + vendedor4.getEndereco());
        System.out.println("Telefone: " + vendedor4.getTelefone());
        System.out.println("Código Setor: " + vendedor4.getCodigoSetor());
        System.out.println("Salário Base: " + vendedor4.getSalarioBase());
        System.out.println("Imposto: " + vendedor4.getImposto());
        System.out.println("Valor de Vendas: " + vendedor4.getValorVendas());
        System.out.println("Comissão: " + vendedor4.getComissao());
        System.out.println("Salário Total: " + vendedor4.calcularSalario());

        // Testando equals (deve ser true)
        Vendedor vendedor5 = new Vendedor("Roberto Santos", "Rua W, 101", "(41) 98765-4321", 4, 7000, 8, 4000, 7);
        System.out.println("Vendedor4 é igual a vendedor5? " + vendedor4.equals(vendedor5));

        // Testando equals (deve ser false)
        Vendedor vendedor6 = new Vendedor("Joana Almeida", "Rua V, 202", "(51) 97654-3210", 5, 8000, 10, 4500, 9);
        System.out.println("Vendedor4 é igual a vendedor6? " + vendedor4.equals(vendedor6));

        // Testando hashCode
        System.out.println("HashCode de vendedor4: " + vendedor4.hashCode());
        System.out.println("HashCode de vendedor5: " + vendedor5.hashCode());
        System.out.println("HashCode de vendedor6: " + vendedor6.hashCode());

        // Testando toString
        System.out.println("toString de vendedor4:");
        System.out.println(vendedor4);

        // Criação de objeto original
        Vendedor vendedorOriginal = new Vendedor("Carlos Silva", "Rua X, 123", "(11) 98765-4321", 1, 4000, 15, 2500, 10);

        // Criando cópia profunda usando o construtor de cópia
        Vendedor vendedorCopiaConstrutor = new Vendedor(vendedorOriginal);

        // Criando cópia profunda usando o método clone
        Vendedor vendedorCopiaClone = (Vendedor) vendedorOriginal.clone();

        System.out.println("Vendedor original:");
        System.out.println(vendedorOriginal);

        System.out.println("Vendedor cópia (construtor):");
        System.out.println(vendedorCopiaConstrutor);

        System.out.println("Vendedor cópia (clone):");
        System.out.println(vendedorCopiaClone);

        System.out.println("HashCode de vendedorOriginal:         " + vendedorOriginal.hashCode());
        System.out.println("HashCode de vendedorCopiaConstrutor:  " + vendedorCopiaConstrutor.hashCode());
        System.out.println("HashCode de vendedorCopiaClone:       " + vendedorCopiaClone.hashCode());

        // Comparando endereços de memória
        System.out.println("vendedorOriginal == vendedorCopiaConstrutor? " + (vendedorOriginal == vendedorCopiaConstrutor));  // false
        System.out.println("vendedorOriginal == vendedorCopiaClone? " + (vendedorOriginal == vendedorCopiaClone));  // false

        // Comparando conteúdo
        System.out.println("vendedorOriginal.equals(vendedorCopiaConstrutor)? " + vendedorOriginal.equals(vendedorCopiaConstrutor)); // true
        System.out.println("vendedorOriginal.equals(vendedorCopiaClone)? " + vendedorOriginal.equals(vendedorCopiaClone)); // true

        System.out.println("Modificando o nome da cópia (construtor)...");
        vendedorCopiaConstrutor.setNome("Eduardo Silva");
        System.out.println("Nome do original: " + vendedorOriginal.getNome()); // Carlos Silva
        System.out.println("Nome da cópia (construtor): " + vendedorCopiaConstrutor.getNome()); // Eduardo Silva

        System.out.println("Modificando o endereço da cópia (clone)...");
        vendedorCopiaClone.setEndereco("Rua Y, 456");
        System.out.println("Endereço do original: " + vendedorOriginal.getEndereco()); // Rua X, 123
        System.out.println("Endereço da cópia (clone): " + vendedorCopiaClone.getEndereco()); // Rua Y, 456
    }
}
