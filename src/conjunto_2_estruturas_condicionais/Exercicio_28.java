package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

import static conjunto_2_estruturas_condicionais.CommonMethods02.getDouble;

public class Exercicio_28 {

    /*
    28. Coloque em ordem crescente três números quaisquer.
    Como desafio, tente depois fazer uma solução com apenas 3 estruturas de decisão.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 28");
        Scanner entrada = new Scanner(System.in);

        double numero1, numero2, numero3, menor, meio, maior;

        System.out.print("Digite o primeiro número: ");
        numero1 = getDouble(entrada);

        System.out.print("Digite o segundo número: ");
        numero2 = getDouble(entrada);

        System.out.print("Digite o terceiro número: ");
        numero3 = getDouble(entrada);

        if (numero1 <= numero2 && numero1 <= numero3) {
            menor = numero1;
            meio = Math.min(numero2, numero3);
            maior = Math.max(numero2, numero3);
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            menor = numero2;
            meio = Math.min(numero1, numero3);
            maior = Math.max(numero1, numero3);
        } else {
            menor = numero3;
            meio = Math.min(numero1, numero2);
            maior = Math.max(numero1, numero2);
        }

        // Exibe os números em ordem crescente
        System.out.printf("Números em ordem crescente: %.2f, %.2f, %.2f%n", menor, meio, maior);

        entrada.close();
    }
}
