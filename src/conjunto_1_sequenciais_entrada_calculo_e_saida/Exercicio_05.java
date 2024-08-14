package conjunto_1_sequenciais_entrada_calculo_e_saida;

import java.util.Scanner;

public class exercicio_05 {

    /*
    5. Calcule e exiba o valor final de uma dívida.
    Para isto pergunte ao usuário o valor inicial do débito,
    a quantidade de meses e os juros mensais.
    Use o cálculo de juros simples.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 05");
        Scanner entrada = new Scanner(System.in);

        double valorInicial, jurosMensais, valorFinal;
        int quantidadeMeses;

        System.out.print("Digite o valor inicial da dívida: ");
        valorInicial = getDouble(entrada);

        System.out.print("Digite a quantidade de meses: ");
        quantidadeMeses = getInt(entrada);

        System.out.print("Digite o juros mensais: ");
        jurosMensais = getDouble(entrada);

        valorFinal = calcularValorFinal(valorInicial, jurosMensais, quantidadeMeses);

        System.out.println("O valor final da dívida é: " + valorFinal);

        entrada.close();
    }

    public static double calcularValorFinal(double valorInicial,
                                            double jurosMensais,
                                            int quantidadeMeses) {
        return valorInicial * (1 + jurosMensais * quantidadeMeses);
    }

    public static double getDouble(Scanner entrada) {
        double valor = -1;
        boolean validInput = false;

        do {
            try {
                valor = Double.parseDouble(entrada.nextLine().trim());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            }
        } while (!validInput);

        return valor;
    }

    public static int getInt(Scanner entrada) {
        int valor = -1;
        boolean validInput = false;

        do {
            try {
                valor = Integer.parseInt(entrada.nextLine().trim());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            }
        } while (!validInput);

        return valor;
    }
}
