package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

import static conjunto_2_estruturas_condicionais.CommonMethods02.getIdade;

public class Exercicio_11 {
    /*
    11. A partir da idade informada de um cidadão diga se ele não pode votar (idade inferior a 16),
    ou se o voto é facultativo (idade menor ou igual a 16, ou maior ou igual a 65), ou ainda se o
    voto é obrigatório.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 11");

        Scanner entrada = new Scanner(System.in);
        byte idade;

        System.out.print("Digite a idade do cidadão: ");
        idade = getIdade(entrada);

        if (idade < 16) {
            System.out.println("Não pode votar.");
        } else if (idade == 16 || idade >= 65) {
            System.out.println("Voto facultativo.");
        } else {
            System.out.println("Voto obrigatório.");
        }

        entrada.close();
    }
}
