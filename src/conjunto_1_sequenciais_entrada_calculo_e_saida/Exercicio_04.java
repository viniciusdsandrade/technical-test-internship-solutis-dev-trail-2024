package conjunto_1_sequenciais_entrada_calculo_e_saida;

import java.util.Scanner;

public class Exercicio_04 {
    /*
    4. Determine e exiba a média aritmética de um aluno a partir de suas 4 notas.
     */
    public static void main(String[] args) {
        System.out.println("Exercício 04");
        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, mediaAritmetica;

        System.out.print("1º nota: ");
        nota1 = getNota(entrada);

        System.out.print("2º nota: ");
        nota2 = getNota(entrada);

        System.out.print("3º nota: ");
        nota3 = getNota(entrada);

        System.out.print("4º nota: ");
        nota4 = getNota(entrada);

        mediaAritmetica = mediaQuatroNotas(nota1, nota2, nota3, nota4);

        System.out.println("As notas digitadas foram: " + nota1 + ", " + nota2 + ", " + nota3 + " e " + nota4);
        System.out.println("A média aritmética das notas é: " + mediaAritmetica);

        entrada.close();
    }

    public static double getNota(Scanner scanner) {
        double nota = -1;
        boolean validInput = false;

        do {
            try {
                nota = Double.parseDouble(scanner.nextLine().trim());
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida. Digite uma nota entre 0 e 10.");
                } else {
                    validInput = true; // Entrada válida
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            }
        } while (!validInput);

        return nota;
    }

    public static double mediaQuatroNotas(double nota1,
                                          double nota2,
                                          double nota3,
                                          double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }
}
