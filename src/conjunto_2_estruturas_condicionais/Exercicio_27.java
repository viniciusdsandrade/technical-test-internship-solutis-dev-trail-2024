package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

import static conjunto_2_estruturas_condicionais.CommonMethods02.getNumber;

public class Exercicio_27 {

    /*
    27. Descubra e apresente o maior entre três números fornecidos pelo usuário.
    Caso eles sejam iguais, avise ao usuário.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 27");
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        Number numero1 = getNumber(entrada);

        System.out.print("Digite o segundo número: ");
        Number numero2 = getNumber(entrada);

        System.out.print("Digite o terceiro número: ");
        Number numero3 = getNumber(entrada);

        if (numero1.equals(numero2) && numero2.equals(numero3)) {
            System.out.println("Os números são iguais.");
            return; //Early return
        }

        Number maior = numero1;

        if (numero2.doubleValue() > maior.doubleValue()) maior = numero2;
        if (numero3.doubleValue() > maior.doubleValue()) maior = numero3;

        System.out.println("O maior número é " + maior + ".");
    }
}
