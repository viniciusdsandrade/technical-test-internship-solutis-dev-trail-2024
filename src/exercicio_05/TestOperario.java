package exercicio_05;

public class TestOperario {
    public static void main(String[] args) {
        // Testando construtor padrão
        Operario operario1 = new Operario();
        operario1.setNome("Pedro Oliveira");
        operario1.setEndereco("Avenida A, 123");
        operario1.setTelefone("(11) 98765-4321");
        operario1.setCodigoSetor(1);
        operario1.setSalarioBase(5000);
        operario1.setImposto(12);
        operario1.setValorProducao(2000);
        operario1.setComissao(5);
        System.out.println("Operário1 (construtor padrão):");
        System.out.println(operario1);

        // Testando construtor com nome, codigoSetor, salarioBase, imposto, valorProducao e comissao
        Operario operario2 = new Operario("João Silva", 2, 6000, 10, 3000, 7);
        operario2.setEndereco("Avenida B, 456");
        operario2.setTelefone("(21) 91234-5678");
        System.out.println("Operário2 (construtor com nome, codigoSetor, salarioBase, imposto, valorProducao e comissao):");
        System.out.println(operario2);

        // Testando construtor com nome, endereço, codigoSetor, salarioBase, imposto, valorProducao e comissao
        Operario operario3 = new Operario("Maria Santos", "Avenida C, 789", 3, 7000, 8, 2500, 10);
        operario3.setTelefone("(31) 99876-5432");
        System.out.println("Operário3 (construtor com nome, endereço, codigoSetor, salarioBase, imposto, valorProducao e comissao):");
        System.out.println(operario3);

        // Testando construtor com todos os atributos
        Operario operario4 = new Operario("Lucas Almeida", "Avenida D, 101", "(41) 98765-4321", 4, 8000, 15, 3500, 12);
        System.out.println("Operário4 (construtor com todos os atributos):");
        System.out.println(operario4);

        // Testando getters
        System.out.println("Getters de operario4:");
        System.out.println("Nome: " + operario4.getNome());
        System.out.println("Endereço: " + operario4.getEndereco());
        System.out.println("Telefone: " + operario4.getTelefone());
        System.out.println("Código Setor: " + operario4.getCodigoSetor());
        System.out.println("Salário Base: " + operario4.getSalarioBase());
        System.out.println("Imposto: " + operario4.getImposto());
        System.out.println("Valor de Produção: " + operario4.getValorProducao());
        System.out.println("Comissão: " + operario4.getComissao());
        System.out.println("Salário Total: " + operario4.calcularSalario());

        // Testando equals (deve ser true)
        Operario operario5 = new Operario("Lucas Almeida", "Avenida D, 101", "(41) 98765-4321", 4, 8000, 15, 3500, 12);
        System.out.println("Operário4 é igual a operário5? " + operario4.equals(operario5));

        // Testando equals (deve ser false)
        Operario operario6 = new Operario("Fernanda Costa", "Avenida E, 202", "(51) 97654-3210", 5, 9000, 20, 4000, 15);
        System.out.println("Operário4 é igual a operário6? " + operario4.equals(operario6));

        // Testando hashCode
        System.out.println("HashCode de operario4: " + operario4.hashCode());
        System.out.println("HashCode de operario5: " + operario5.hashCode());
        System.out.println("HashCode de operario6: " + operario6.hashCode());

        // Testando toString
        System.out.println("toString de operario4:");
        System.out.println(operario4);

        // Criação de objeto original
        Operario operarioOriginal = new Operario("Pedro Oliveira", "Avenida A, 123", "(11) 98765-4321", 1, 5000, 12, 2000, 5);

        // Criando cópia profunda usando o construtor de cópia
        Operario operarioCopiaConstrutor = new Operario(operarioOriginal);

        // Criando cópia profunda usando o método clone
        Operario operarioCopiaClone = (Operario) operarioOriginal.clone();

        System.out.println("Operário original:");
        System.out.println(operarioOriginal);

        System.out.println("Operário cópia (construtor):");
        System.out.println(operarioCopiaConstrutor);

        System.out.println("Operário cópia (clone):");
        System.out.println(operarioCopiaClone);

        System.out.println("HashCode de operarioOriginal:         " + operarioOriginal.hashCode());
        System.out.println("HashCode de operarioCopiaConstrutor:  " + operarioCopiaConstrutor.hashCode());
        System.out.println("HashCode de operarioCopiaClone:       " + operarioCopiaClone.hashCode());

        // Comparando endereços de memória
        System.out.println("operarioOriginal == operarioCopiaConstrutor? " + (operarioOriginal == operarioCopiaConstrutor));  // false
        System.out.println("operarioOriginal == operarioCopiaClone? " + (operarioOriginal == operarioCopiaClone));  // false

        // Comparando conteúdo
        System.out.println("operarioOriginal.equals(operarioCopiaConstrutor)? " + operarioOriginal.equals(operarioCopiaConstrutor)); // true
        System.out.println("operarioOriginal.equals(operarioCopiaClone)? " + operarioOriginal.equals(operarioCopiaClone)); // true

        System.out.println("Modificando o nome da cópia (construtor)...");
        operarioCopiaConstrutor.setNome("Amanda Silva");
        System.out.println("Nome do original: " + operarioOriginal.getNome()); // Pedro Oliveira
        System.out.println("Nome da cópia (construtor): " + operarioCopiaConstrutor.getNome()); // Amanda Silva

        System.out.println("Modificando o endereço da cópia (clone)...");
        operarioCopiaClone.setEndereco("Avenida B, 456");
        System.out.println("Endereço do original: " + operarioOriginal.getEndereco()); // Avenida A, 123
        System.out.println("Endereço da cópia (clone): " + operarioCopiaClone.getEndereco()); // Avenida B, 456
    }
}
