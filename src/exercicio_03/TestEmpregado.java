package exercicio_03;

public class TestEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Empregado(
                "João da Silva",
                "Rua A, 123",
                "3246-1383",
                1234,
                1000,
                10
        );


        System.out.println(empregado);

        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Código do Setor: " + empregado.getCodigoSetor());
        System.out.println("Salário Base: " + empregado.getSalarioBase());
        System.out.println("Imposto: " + empregado.getImposto());
        System.out.println("Salário Líquido: " + empregado.calcularSalario());
    }
}
