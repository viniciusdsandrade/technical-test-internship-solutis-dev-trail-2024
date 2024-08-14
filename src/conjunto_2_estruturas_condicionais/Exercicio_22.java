package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

import static conjunto_2_estruturas_condicionais.CommonMethods02.getDia;

public class Exercicio_22 {

    /*
    22. Verifique se duas datas de aniversário (dia e mês) são iguais.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 22");

        Scanner entrada = new Scanner(System.in);
        byte dia1, mes1, dia2, mes2;

        System.out.print("Digite o dia do primeiro aniversário: ");
        dia1 = getDia(entrada);

        System.out.print("Digite o mês do primeiro aniversário: ");
        mes1 = getDia(entrada);

        System.out.print("Digite o dia do segundo aniversário: ");
        dia2 = getDia(entrada);

        System.out.print("Digite o mês do segundo aniversário: ");
        mes2 = getDia(entrada);

        if (dia1 == dia2 && mes1 == mes2) {
            System.out.println("As datas de aniversário são iguais.");
        } else {
            System.out.println("As datas de aniversário são diferentes.");
        }

        entrada.close();
    }
}
