package exercicio_04;

public class TestAdministrador {
    public static void main(String[] args) {

        Administrador administrador = new Administrador(
                "João da Silva",
                "Rua A, 123",
                "3246-1383",
                1234,
                1000,
                10,
                100
        );

        System.out.println(administrador);

        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Código do Setor: " + administrador.getCodigoSetor());
        System.out.println("Salário Base: " + administrador.getSalarioBase());
        System.out.println("Imposto: " + administrador.getImposto());
        System.out.println("Ajuda de Custo: " + administrador.getAjudaDeCusto());
        System.out.println("Salário Líquido: " + administrador.calcularSalario());

    }
}
