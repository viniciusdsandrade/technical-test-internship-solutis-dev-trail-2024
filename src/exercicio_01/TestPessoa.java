package exercicio_01;

public class TestPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", "Rua 1", "123456789");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.getTelefone());

        System.out.println(pessoa);
    }
}
