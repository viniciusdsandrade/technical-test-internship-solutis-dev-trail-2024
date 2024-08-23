package exercicio_03;

public class TestEmpregado {
    public static void main(String[] args) {
        // Testando construtor padrão
        Empregado empregado1 = new Empregado();
        empregado1.setNome("Vinícius Andrade");
        empregado1.setEndereco("Rua A, 123");
        empregado1.setTelefone("(11) 98765-4321");
        empregado1.setCodigoSetor(1);
        empregado1.setSalarioBase(5000);
        empregado1.setImposto(15);
        System.out.println("Empregado1 (construtor padrão):");
        System.out.println(empregado1);

        // Testando construtor com nome, codigoSetor, salarioBase e imposto
        Empregado empregado2 = new Empregado("Bianca Coelho", 2, 6000, 10);
        empregado2.setEndereco("Rua B, 456");
        empregado2.setTelefone("(21) 91234-5678");
        System.out.println("Empregado2 (construtor com nome, codigoSetor, salarioBase e imposto):");
        System.out.println(empregado2);

        // Testando construtor com nome, endereço, codigoSetor, salarioBase e imposto
        Empregado empregado3 = new Empregado("Lucas Silva", "Rua C, 789", 3, 7000, 5);
        empregado3.setTelefone("(31) 99876-5432");
        System.out.println("Empregado3 (construtor com nome, endereço, codigoSetor, salarioBase e imposto):");
        System.out.println(empregado3);

        // Testando construtor com todos os atributos
        Empregado empregado4 = new Empregado("Mariana Souza", "Rua D, 101", "(41) 98765-4321", 4, 8000, 20);
        System.out.println("Empregado4 (construtor com todos os atributos):");
        System.out.println(empregado4);

        // Testando getters
        System.out.println("Getters de empregado4:");
        System.out.println("Nome: " + empregado4.getNome());
        System.out.println("Endereço: " + empregado4.getEndereco());
        System.out.println("Telefone: " + empregado4.getTelefone());
        System.out.println("Código Setor: " + empregado4.getCodigoSetor());
        System.out.println("Salário Base: " + empregado4.getSalarioBase());
        System.out.println("Imposto: " + empregado4.getImposto());
        System.out.println("Salário Líquido: " + empregado4.calcularSalario());

        // Testando equals (deve ser true)
        Empregado empregado5 = new Empregado("Mariana Souza", "Rua D, 101", "(41) 98765-4321", 4, 8000, 20);
        System.out.println("Empregado4 é igual a empregado5? " + empregado4.equals(empregado5));

        // Testando equals (deve ser false)
        Empregado empregado6 = new Empregado("João Pereira", "Rua E, 202", "(51) 97654-3210", 5, 9000, 25);
        System.out.println("Empregado4 é igual a empregado6? " + empregado4.equals(empregado6));

        // Testando hashCode
        System.out.println("HashCode de empregado4: " + empregado4.hashCode());
        System.out.println("HashCode de empregado5: " + empregado5.hashCode());
        System.out.println("HashCode de empregado6: " + empregado6.hashCode());

        // Testando toString
        System.out.println("toString de empregado4:");
        System.out.println(empregado4);

        // Criação de objeto original
        Empregado empregadoOriginal = new Empregado("Vinícius Andrade", "Rua A, 123", "(11) 98765-4321", 1, 5000, 15);

        // Criando cópia profunda usando o construtor de cópia
        Empregado empregadoCopiaConstrutor = new Empregado(empregadoOriginal);

        // Criando cópia profunda usando o metodo clone
        Empregado empregadoCopiaClone = (Empregado) empregadoOriginal.clone();

        System.out.println("Empregado original:");
        System.out.println(empregadoOriginal);

        System.out.println("Empregado cópia (construtor):");
        System.out.println(empregadoCopiaConstrutor);

        System.out.println("Empregado cópia (clone):");
        System.out.println(empregadoCopiaClone);

        System.out.println("hashCode de empregadoOriginal:         " + empregadoOriginal.hashCode());
        System.out.println("hashCode de empregadoCopiaConstrutor:  " + empregadoCopiaConstrutor.hashCode());
        System.out.println("hashCode de empregadoCopiaClone:       " + empregadoCopiaClone.hashCode());

        // Comparando endereços de memória
        System.out.println("empregadoOriginal == empregadoCopiaConstrutor? " + (empregadoOriginal == empregadoCopiaConstrutor));  // false
        System.out.println("empregadoOriginal == empregadoCopiaClone? " + (empregadoOriginal == empregadoCopiaClone));  // false

        // Comparando conteúdo
        System.out.println("empregadoOriginal.equals(empregadoCopiaConstrutor)? " + empregadoOriginal.equals(empregadoCopiaConstrutor)); // true
        System.out.println("empregadoOriginal.equals(empregadoCopiaClone)? " + empregadoOriginal.equals(empregadoCopiaClone)); // true

        System.out.println("Modificando o nome da cópia (construtor)...");
        empregadoCopiaConstrutor.setNome("Lucas Silva");
        System.out.println("Nome do original: " + empregadoOriginal.getNome()); // Vinícius Andrade
        System.out.println("Nome da cópia (construtor): " + empregadoCopiaConstrutor.getNome()); // Lucas Silva

        System.out.println("Modificando o endereço da cópia (clone)...");
        empregadoCopiaClone.setEndereco("Rua B, 456");
        System.out.println("Endereço do original: " + empregadoOriginal.getEndereco()); // Rua A, 123
        System.out.println("Endereço da cópia (clone): " + empregadoCopiaClone.getEndereco()); // Rua B, 456
    }
}
