package conjunto_1_sequenciais_entrada_calculo_e_saida;

public class exercicio_07 {

    /*
    7. Calcule e exiba a comissão de 10% de um garçom num restaurante a partir do valor da
    despesa de um cliente.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 07");

        double despesaCliente = 100;
        double comissao = calcularComissaoGarcom(despesaCliente);

        System.out.println("A comissão do garçom é: " + comissao);
    }

    public static double calcularComissaoGarcom(double despesaCliente) {
        return despesaCliente * 0.1;
    }
}
