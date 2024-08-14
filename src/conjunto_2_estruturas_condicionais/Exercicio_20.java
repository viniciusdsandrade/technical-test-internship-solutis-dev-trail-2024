package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

import static conjunto_2_estruturas_condicionais.CommonMethods02.getIdade;
import static conjunto_2_estruturas_condicionais.CommonMethods02.getString;

public class Exercicio_20 {
    /*
    20. Solicite o nome e a idade de duas pessoas.
    Em seguida exiba o nome da pessoa mais velha e o nome da pessoa mais nova.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 20");
        Scanner entrada = new Scanner(System.in);

        String nome1, nome2;
        int idade1, idade2;

        System.out.print("Digite o nome da 1º pessoa: ");
        nome1 = getString(entrada);

        System.out.print("Digite a idade da 1º pessoa: ");
        idade1 = getIdade(entrada);

        System.out.print("Digite o nome da 2º pessoa: ");
        nome2 = getString(entrada);

        System.out.print("Digite a idade da 2º pessoa: ");
        idade2 = getIdade(entrada);

        if (idade1 > idade2) {
            System.out.println("A pessoa mais velha é: " + nome1);
            System.out.println("A pessoa mais nova é: " + nome2);
        } else if (idade1 < idade2) {
            System.out.println("A pessoa mais velha é: " + nome2);
            System.out.println("A pessoa mais nova é: " + nome1);
        } else {
            System.out.println("As duas pessoas têm a mesma idade.");
        }

        entrada.close();
    }
}
