package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

import static conjunto_2_estruturas_condicionais.CommonMethods02.*;

public class Exercicio_10 {
    /*
    10. Um banco concede empréstimo a seus clientes no valor máximo de 30% do valor do seu
    salário líquido. Receba o valor do salário bruto, o valor dos descontos e o valor do possível
    empréstimo de um cliente, em seguida avise se ele poderá ou não fazer o empréstimo.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 10");

        Scanner entrada = new Scanner(System.in);
        double salarioBruto, descontos, valorEmprestimo;

        System.out.print("Digite o salário bruto: ");
        salarioBruto = getSalario(entrada);

        System.out.print("Digite o valor dos descontos: ");
        descontos = getDesconto(entrada);

        System.out.print("Digite o valor do possível empréstimo: ");
        valorEmprestimo = getEmprestimo(entrada);


        if (podeFazerEmprestimo(salarioBruto, descontos, valorEmprestimo)) {
            System.out.println("O cliente pode fazer o empréstimo.");
        } else {
            System.out.println("O cliente não pode fazer o empréstimo.");
        }

        entrada.close();
    }

    public static boolean podeFazerEmprestimo(double salarioBruto,
                                              double descontos,
                                              double valorEmprestimo) {
        double salarioLiquido = salarioBruto - descontos;
        double valorMaximoEmprestimo = salarioLiquido * 0.3;
        return valorEmprestimo <= valorMaximoEmprestimo;
    }
}
