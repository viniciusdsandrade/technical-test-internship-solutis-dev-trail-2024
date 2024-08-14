package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

import static conjunto_2_estruturas_condicionais.CommonMethods02.*;

public class Exercicio_23 {

    /*
    23. Verifique quem entre duas pessoas faz aniversário primeiro.
    Exiba o nome do primeiro aniversariante considerando que estamos no dia 1 de janeiro.
    Use como entrada o nome, o
    dia e o mês de nascimento de cada pessoa.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 23");
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = getString(entrada);

        System.out.print("Digite o dia de nascimento da primeira pessoa: ");
        byte dia1 = getDia(entrada);

        System.out.print("Digite o mês de nascimento da primeira pessoa: ");
        byte mes1 = getMes(entrada);

        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = getString(entrada);

        System.out.print("Digite o dia de nascimento da segunda pessoa: ");
        byte dia2 = getDia(entrada);

        System.out.print("Digite o mês de nascimento da segunda pessoa: ");
        byte mes2 = getMes(entrada);

        if (mes1 < mes2 || (mes1 == mes2 && dia1 < dia2)) {
            System.out.println("O primeiro aniversariante é: " + nome1);
        } else {
            System.out.println("O primeiro aniversariante é: " + nome2);
        }

        entrada.close();
    }
}
