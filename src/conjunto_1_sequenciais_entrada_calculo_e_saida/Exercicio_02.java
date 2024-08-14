package conjunto_1_sequenciais_entrada_calculo_e_saida;

import java.util.Scanner;

public class Exercicio_02 {
    /*
       2. Calcule e exiba a quantidade de salários mínimos que um determinado funcionário ganha.
       Para isto, peça o valor do seu salário e o valor do salário mínimo atual.
    */
    public static void main(String[] args) {
        System.out.println("Exercício 02");

        Scanner scanner = new Scanner(System.in);
        double salario, salarioMinimo;

        System.out.print("Digite o valor do salário: ");
        salario = scanner.nextDouble();

        System.out.print("Digite o valor do salário mínimo atual: ");
        salarioMinimo = scanner.nextDouble();

        double quantidadeSalariosMinimos = salario / salarioMinimo;
        System.out.println("A quantidade de salários mínimos que o funcionário ganha é: " + quantidadeSalariosMinimos);

        scanner.close();
    }
}
