package conjunto_1_sequenciais_entrada_calculo_e_saida;

import java.util.Scanner;

public class Exercicio_03 {
    /*
    3. Solicite a quantidade de homens e de mulheres de uma turma da faculdade. Em seguida
    calcule e exiba o percentual (separadamente) de homens e mulheres desta turma.

    Obs.: em Java a divisão de valores inteiros dá como resultado um número inteiro, ao menos
    que um dos números seja do tipo ponto flutuante (double, por exemplo). Para transformar
    inteiro para double basta fazer um cast: “(double)x” - transforma “x” em double.
     */
    public static void main(String[] args) {
        System.out.println("Exercício 03");

        Scanner scanner = new Scanner(System.in);
        int qtdHomens, qtdMulheres;

        System.out.print("Digite a quantidade de homens: ");
        qtdHomens = scanner.nextInt();

        System.out.print("Digite a quantidade de mulheres: ");
        qtdMulheres = scanner.nextInt();

        int totalAlunos = qtdHomens + qtdMulheres;

        double percentualHomens = (double) qtdHomens / totalAlunos * 100;
        double percentualMulheres = (double) qtdMulheres / totalAlunos * 100;

        System.out.println("O percentual de homens é: " + percentualHomens + "%");
        System.out.println("O percentual de mulheres é: " + percentualMulheres + "%");
    }
}
