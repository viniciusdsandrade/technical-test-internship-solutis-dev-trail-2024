package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

public class Exercicio_08 {
    /*
    8. Transforme um número Racional (formado por numerador e denominador) para um número
    Real. Antes de dividir, verifique se o denominador é diferente de zero. Emita uma
    mensagem de alerta ao usuário se for zero.
     */

    /*
    Recaptulando a definição de um número Racionial:
     Dado um número inteiro q ≠ 1 e -1, o inverso de que não existe em ℤ: 1/q ∉ ℤ.
     Por isso não podemos definir em ℤ a divisão de divisão, dando significado ao símbolo p/q

     Chama-se conjunto dos números racionais - símbolo ℚ - o conjunto de todos os números que
     podem ser escritos na forma p/q, onde p e q ∈ ℤ e q ≠ 0.

    Recaptulando a definição de um número Real:

    O conjunto dos números reais - símbolo ℝ - é o conjunto de todos os números que podem ser
    representados por uma expansão decimal infinita, finita ou infinita e periódica.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 08");
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o numerador: ");
        int numerador = entrada.nextInt();

        System.out.print("Digite o denominador: ");
        int denominador = entrada.nextInt();

        // Realiza a transformação e exibe o resultado
        double resultado = transformarRacionalParaReal(numerador, denominador);

        if (!Double.isNaN(resultado)) {
            System.out.printf("O número real é: %.4f%n", resultado);
        }

        entrada.close();
    }

    public static double transformarRacionalParaReal(int numerador, int denominador) {
        if (denominador == 0) {
            System.out.println("Erro: O denominador não pode ser zero. Divisão não realizada.");
            return Double.NaN;
        } else {
            return (double) numerador / denominador;
        }
    }
}
