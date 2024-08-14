package conjunto_1_sequenciais_entrada_calculo_e_saida;

import java.util.Scanner;

public class Exercicio_01 {
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

    /*
    Vale ressaltar que para calcular a idade do usuário de maneira mais precisa, seria necessário considerar o mês e o dia de nascimento do usuário.
    Além de considerar que a quantidade de dias em um ano não é fixa, sendo necessário considerar se o ano é bissexto ou não.
     */
}
