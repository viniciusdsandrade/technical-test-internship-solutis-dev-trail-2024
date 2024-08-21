package exercicio_05;

public class TestOperario {
    public static void main(String[] args) {
            Operario operario = new Operario(
                "João",
                "Rua 1",
                "123456789",
                1,
                1000,
                100,
                1000,
                100
            );

            System.out.println(operario);

            System.out.println("Nome: " + operario.getNome());
            System.out.println("Endereço: " + operario.getEndereco());
            System.out.println("Telefone: " + operario.getTelefone());
            System.out.println("Código do Setor: " + operario.getCodigoSetor());
            System.out.println("Salário Base: " + operario.getSalarioBase());
            System.out.println("Imposto: " + operario.getImposto());
            System.out.println("Valor de Produção: " + operario.getValorProducao());
            System.out.println("Comissão: " + operario.getComissao());
            System.out.println("Salário Líquido: " + operario.calcularSalario());
    }
}
