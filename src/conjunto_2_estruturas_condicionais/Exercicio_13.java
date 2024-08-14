package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

import static conjunto_2_estruturas_condicionais.CommonMethods02.getNota;
import static conjunto_2_estruturas_condicionais.Exercicio_12.mediaTresNotas;

public class Exercicio_13 {
    /*
    13. Acrescente no problema anterior possibilidade dele fazer prova final em caso de
    recuperação. Neste caso a nota de aprovação passa a ser >= 5.0
     */

    public static void main(String[] args) {
        System.out.println("Exercício 13");
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3;

        System.out.print("Digite a 1ª nota: ");
        nota1 = getNota(entrada);

        System.out.print("Digite a 2ª nota: ");
        nota2 = getNota(entrada);

        System.out.print("Digite a 3ª nota: ");
        nota3 = getNota(entrada);

        double media = mediaTresNotas(nota1, nota2, nota3);

        if (media >= 5.0 && media < 7.0) {
            System.out.println("Recuperação.");
            System.out.print("Digite a nota da prova final: ");
            double notaProvaFinal = getNota(entrada);
            media = (media + notaProvaFinal) / 2;
            if (media >= 5.0) {
                System.out.println("Aprovado.");
            } else {
                System.out.println("Reprovado.");
            }
        } else if (media >= 7.0) {
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado.");
        }

        entrada.close();
    }
}
