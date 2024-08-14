package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

import static conjunto_2_estruturas_condicionais.CommonMethods02.getNota;

public class Exercicio_12 {
    /*
    12. A partir de 3 notas fornecidas de um aluno, informe se ele foi aprovado, ficou de
    recuperação ou foi reprovado. A média de aprovação é >= 7.0; a média de recuperação é
    >= 5.0 e < 7.0; e a média do reprovado é < 5.0
     */

    public static void main(String[] args) {
        System.out.println("Exercício 12");
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3;

        System.out.print("Digite a 1ª nota: ");
        nota1 = getNota(entrada);

        System.out.print("Digite a 2ª nota: ");
        nota2 = getNota(entrada);

        System.out.print("Digite a 3ª nota: ");
        nota3 = getNota(entrada);

        double media = mediaTresNotas(nota1, nota2, nota3);

        if (media >= 7.0) {
            System.out.println("Aprovado.");
        } else if (media >= 5.0) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("Reprovado.");
        }

        entrada.close();
    }

    public static double mediaTresNotas(double nota1,
                                        double nota2,
                                        double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }
}
