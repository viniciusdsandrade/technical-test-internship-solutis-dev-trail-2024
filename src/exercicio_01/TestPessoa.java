package exercicio_01;

public class TestPessoa {

    public static void main(String[] args) {
        // Testando construtor padrão
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Vinícius Andrade");
        pessoa1.setEndereco("Rua A, 123");
        pessoa1.setTelefone("(11) 98765-4321");
        System.out.println("Pessoa1 (construtor padrão):");
        System.out.println(pessoa1);

        // Testando construtor com nome
        Pessoa pessoa2 = new Pessoa("Bianca Coelho");
        pessoa2.setEndereco("Rua B, 456");
        pessoa2.setTelefone("(21) 91234-5678");
        System.out.println("Pessoa2 (construtor com nome):");
        System.out.println(pessoa2);

        // Testando construtor com nome e endereço
        Pessoa pessoa3 = new Pessoa("Lucas Silva", "Rua C, 789");
        pessoa3.setTelefone("(31) 99876-5432");
        System.out.println("Pessoa3 (construtor com nome e endereço):");
        System.out.println(pessoa3);

        // Testando construtor com todos os atributos
        Pessoa pessoa4 = new Pessoa("Mariana Souza", "Rua D, 101", "(41) 98765-4321");
        System.out.println("Pessoa4 (construtor com todos os atributos):");
        System.out.println(pessoa4);

        // Testando getters
        System.out.println("Getters de pessoa4:");
        System.out.println("Nome: " + pessoa4.getNome());
        System.out.println("Endereço: " + pessoa4.getEndereco());
        System.out.println("Telefone: " + pessoa4.getTelefone());

        // Testando equals (deve ser true)
        Pessoa pessoa5 = new Pessoa("Mariana Souza", "Rua D, 101", "(41) 98765-4321");
        System.out.println("Pessoa4 é igual a pessoa5? " + pessoa4.equals(pessoa5));

        // Testando equals (deve ser false)
        Pessoa pessoa6 = new Pessoa("João Pereira", "Rua E, 202", "(51) 97654-3210");
        System.out.println("Pessoa4 é igual a pessoa6? " + pessoa4.equals(pessoa6));

        // Testando hashCode
        System.out.println("HashCode de pessoa4: " + pessoa4.hashCode());
        System.out.println("HashCode de pessoa5: " + pessoa5.hashCode());
        System.out.println("HashCode de pessoa6: " + pessoa6.hashCode());

        // Testando toString
        System.out.println("toString de pessoa4:");
        System.out.println(pessoa4);

        // Criação de objeto original
        Pessoa pessoaOriginal = new Pessoa("Vinícius Andrade", "Rua A, 123", "(11) 98765-4321");

        // Criando cópia profunda usando o construtor de cópia
        Pessoa pessoaCopiaConstrutor = new Pessoa(pessoaOriginal);

        // Criando cópia profunda usando o metodo clone
        Pessoa pessoaCopiaClone = (Pessoa) pessoaOriginal.clone();

        System.out.println("Pessoa original:");
        System.out.println(pessoaOriginal);

        System.out.println("Pessoa cópia (construtor):");
        System.out.println(pessoaCopiaConstrutor);

        System.out.println("Pessoa cópia (clone):");
        System.out.println(pessoaCopiaClone);

        System.out.println("hashCode de pessoaOriginal:         " + pessoaOriginal.hashCode());
        System.out.println("hashCode de pessoaCopiaConstrutor:  " + pessoaCopiaConstrutor.hashCode());
        System.out.println("hashCode de pessoaCopiaClone:       " + pessoaCopiaClone.hashCode());

        // Comparando endereços de memória
        System.out.println("pessoaOriginal == pessoaCopiaConstrutor? " + (pessoaOriginal == pessoaCopiaConstrutor));  // false
        System.out.println("pessoaOriginal == pessoaCopiaClone? " + (pessoaOriginal == pessoaCopiaClone));  // false

        // Comparando conteúdo
        System.out.println("pessoaOriginal.equals(pessoaCopiaConstrutor)? " + pessoaOriginal.equals(pessoaCopiaConstrutor)); // true
        System.out.println("pessoaOriginal.equals(pessoaCopiaClone)? " + pessoaOriginal.equals(pessoaCopiaClone)); // true

        System.out.println("Modificando o nome da cópia (construtor)...");
        pessoaCopiaConstrutor.setNome("Lucas Silva");
        System.out.println("Nome do original: " + pessoaOriginal.getNome()); // Vinícius Andrade
        System.out.println("Nome da cópia (construtor): " + pessoaCopiaConstrutor.getNome()); // Lucas Silva

        System.out.println("Modificando o endereço da cópia (clone)...");
        pessoaCopiaClone.setEndereco("Rua B, 456");
        System.out.println("Endereço do original: " + pessoaOriginal.getEndereco()); // Rua A, 123
        System.out.println("Endereço da cópia (clone): " + pessoaCopiaClone.getEndereco()); // Rua B, 456
    }
}

