package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

import static conjunto_2_estruturas_condicionais.CommonMethods02.getInt;
import static conjunto_2_estruturas_condicionais.CommonMethods02.getSalario;

public class Exercicio_21 {

    /*
    21. Exiba o valor do empréstimo possível para um funcionário de uma empresa.
    Sabe-se:

    Cargo           % do salário
    Diretoria           30%
    Gerência            25%
    Operacional         20%
     */

    public static void main(String[] args) {
        System.out.println("Exercício 21");
        Scanner entrada = new Scanner(System.in);

        double salarioBruto;
        int cargo;

        System.out.print("Digite o salário bruto do funcionário: ");
        salarioBruto = getSalario(entrada);

        System.out.println("Cargo do funcionário: ");
        System.out.println("1 - Diretoria");
        System.out.println("2 - Gerência");
        System.out.println("3 - Operacional");

        System.out.print("Digite o número correspondente ao cargo do funcionário: ");
        cargo = getInt(entrada);

        double valorEmprestimo = getValorEmprestimo(salarioBruto, cargo);
        System.out.println("O valor do empréstimo possível é: " + valorEmprestimo);
    }

    public static double getValorEmprestimo(double salarioBruto,
                                            int cargo) {
        double salarioLiquido = salarioBruto;

        switch (cargo) {
            case 1 -> salarioLiquido *= 0.7;
            case 2 -> salarioLiquido *= 0.75;
            case 3 -> salarioLiquido *= 0.8;
            default -> {
                System.out.println("Cargo inválido.");
                return -1;
            }
        }
        return salarioLiquido;
    }
}
