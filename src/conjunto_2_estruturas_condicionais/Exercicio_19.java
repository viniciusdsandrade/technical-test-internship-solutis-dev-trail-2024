package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

import static conjunto_2_estruturas_condicionais.CommonMethods02.getNumber;

public class Exercicio_19 {

    /*
    19. Exiba dois números fornecidos pelo usuário em ordem crescente.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 19");
        Scanner entrada = new Scanner(System.in);

        // Como não sei qual tipo numerico o usuário vai digitar, coloco o tipo mais genérico no Java
        System.out.print("Digite o primeiro número: ");
        Number numero1 = getNumber(entrada);

        System.out.print("Digite o segundo número: ");
        Number numero2 = getNumber(entrada);

        if (numero1.doubleValue() < numero2.doubleValue()) {
            System.out.println("Os números em ordem crescente são: " + numero1 + " e " + numero2);
        } else {
            System.out.println("Os números em ordem crescente são: " + numero2 + " e " + numero1);
        }

        entrada.close();
    }
}
