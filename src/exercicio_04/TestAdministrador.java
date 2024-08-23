package exercicio_04;

public class TestAdministrador {
    public static void main(String[] args) {
        // Testando construtor padrão
        Administrador admin1 = new Administrador();
        admin1.setNome("Ana Pereira");
        admin1.setEndereco("Rua X, 123");
        admin1.setTelefone("(11) 98765-4321");
        admin1.setCodigoSetor(1);
        admin1.setSalarioBase(5000);
        admin1.setImposto(15);
        admin1.setAjudaDeCusto(1000);
        System.out.println("Administrador1 (construtor padrão):");
        System.out.println(admin1);

        // Testando construtor com nome, codigoSetor, salarioBase, imposto e ajudaDeCusto
        Administrador admin2 = new Administrador("Carlos Lima", 2, 6000, 10, 1500);
        admin2.setEndereco("Rua Y, 456");
        admin2.setTelefone("(21) 91234-5678");
        System.out.println("Administrador2 (construtor com nome, codigoSetor, salarioBase, imposto e ajudaDeCusto):");
        System.out.println(admin2);

        // Testando construtor com nome, endereço, codigoSetor, salarioBase, imposto e ajudaDeCusto
        Administrador admin3 = new Administrador("Julia Santos", "Rua Z, 789", 3, 7000, 5, 2000);
        admin3.setTelefone("(31) 99876-5432");
        System.out.println("Administrador3 (construtor com nome, endereço, codigoSetor, salarioBase, imposto e ajudaDeCusto):");
        System.out.println(admin3);

        // Testando construtor com todos os atributos
        Administrador admin4 = new Administrador("Eduardo Alves", "Rua W, 101", "(41) 98765-4321", 4, 8000, 20, 2500);
        System.out.println("Administrador4 (construtor com todos os atributos):");
        System.out.println(admin4);

        // Testando getters
        System.out.println("Getters de admin4:");
        System.out.println("Nome: " + admin4.getNome());
        System.out.println("Endereço: " + admin4.getEndereco());
        System.out.println("Telefone: " + admin4.getTelefone());
        System.out.println("Código Setor: " + admin4.getCodigoSetor());
        System.out.println("Salário Base: " + admin4.getSalarioBase());
        System.out.println("Imposto: " + admin4.getImposto());
        System.out.println("Ajuda de Custo: " + admin4.getAjudaDeCusto());
        System.out.println("Salário Líquido: " + admin4.calcularSalario());

        // Testando equals (deve ser true)
        Administrador admin5 = new Administrador("Eduardo Alves", "Rua W, 101", "(41) 98765-4321", 4, 8000, 20, 2500);
        System.out.println("Administrador4 é igual a administrador5? " + admin4.equals(admin5));

        // Testando equals (deve ser false)
        Administrador admin6 = new Administrador("Fernando Silva", "Rua V, 202", "(51) 97654-3210", 5, 9000, 25, 3000);
        System.out.println("Administrador4 é igual a administrador6? " + admin4.equals(admin6));

        // Testando hashCode
        System.out.println("HashCode de admin4: " + admin4.hashCode());
        System.out.println("HashCode de admin5: " + admin5.hashCode());
        System.out.println("HashCode de admin6: " + admin6.hashCode());

        // Testando toString
        System.out.println("toString de admin4:");
        System.out.println(admin4);

        // Criação de objeto original
        Administrador adminOriginal = new Administrador("Ana Pereira", "Rua X, 123", "(11) 98765-4321", 1, 5000, 15, 1000);

        // Criando cópia profunda usando o construtor de cópia
        Administrador adminCopiaConstrutor = new Administrador(adminOriginal);

        // Criando cópia profunda usando o método clone
        Administrador adminCopiaClone = (Administrador) adminOriginal.clone();

        System.out.println("Administrador original:");
        System.out.println(adminOriginal);

        System.out.println("Administrador cópia (construtor):");
        System.out.println(adminCopiaConstrutor);

        System.out.println("Administrador cópia (clone):");
        System.out.println(adminCopiaClone);

        System.out.println("HashCode de adminOriginal:         " + adminOriginal.hashCode());
        System.out.println("HashCode de adminCopiaConstrutor:  " + adminCopiaConstrutor.hashCode());
        System.out.println("HashCode de adminCopiaClone:       " + adminCopiaClone.hashCode());

        // Comparando endereços de memória
        System.out.println("adminOriginal == adminCopiaConstrutor? " + (adminOriginal == adminCopiaConstrutor));  // false
        System.out.println("adminOriginal == adminCopiaClone? " + (adminOriginal == adminCopiaClone));  // false

        // Comparando conteúdo
        System.out.println("adminOriginal.equals(adminCopiaConstrutor)? " + adminOriginal.equals(adminCopiaConstrutor)); // true
        System.out.println("adminOriginal.equals(adminCopiaClone)? " + adminOriginal.equals(adminCopiaClone)); // true

        System.out.println("Modificando o nome da cópia (construtor)...");
        adminCopiaConstrutor.setNome("Bruna Costa");
        System.out.println("Nome do original: " + adminOriginal.getNome()); // Ana Pereira
        System.out.println("Nome da cópia (construtor): " + adminCopiaConstrutor.getNome()); // Bruna Costa

        System.out.println("Modificando o endereço da cópia (clone)...");
        adminCopiaClone.setEndereco("Rua Y, 456");
        System.out.println("Endereço do original: " + adminOriginal.getEndereco()); // Rua X, 123
        System.out.println("Endereço da cópia (clone): " + adminCopiaClone.getEndereco()); // Rua Y, 456
    }
}
