package exercicio_06;

public class TestVendedor {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor(
                "João da Silva",
                "Rua A, 123",
                "3246-1383",
                1234,
                1000,
                10,
                1000,
                0.1
        );

        System.out.println(vendedor);

        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Código do Setor: " + vendedor.getCodigoSetor());
        System.out.println("Salário Base: " + vendedor.getSalarioBase());
        System.out.println("Imposto: " + vendedor.getImposto());
        System.out.println("Valor de Vendas: " + vendedor.getValorVendas());
        System.out.println("Comissão: " + vendedor.getComissao());
        System.out.println("Salário Líquido: " + vendedor.calcularSalario());
    }
}
