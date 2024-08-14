package conjunto_1_sequenciais_entrada_calculo_e_saida;

import java.util.Scanner;

public class exercicio_01 {
     /*
        1. Determine qual é a idade que o usuário faz no ano atual.
        Para isso solicite o seu ano de nascimento e o ano atual.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 01");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.println("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        int idade = anoAtual - anoNascimento;

        System.out.println("A idade que o usuário faz no ano atual é: " + idade);

        scanner.close();
    }
}
