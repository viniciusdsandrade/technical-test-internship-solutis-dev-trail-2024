package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

import static conjunto_2_estruturas_condicionais.CommonMethods02.*;
import static conjunto_2_estruturas_condicionais.Data.*;

public class Exercicio_17 {
    /*
    17. Acrescente no exercício anterior a apresentação do signo do horóscopo da pessoa.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 17");

        Scanner entrada = new Scanner(System.in);
        byte dia, mes;
        short ano;

        System.out.print("Digite o dia do seu nascimento: ");
        dia = getDia(entrada);

        System.out.print("Digite o mês do seu nascimento: ");
        mes = getMes(entrada);

        System.out.print("Digite o ano do seu nascimento: ");
        ano = getAno(entrada);

        if (isValidDate(dia, mes, ano)) {
            System.out.println("Data válida.");
            System.out.println("A pessoa nasceu no " + getTrimestre(mes) + " trimestre.");
        } else {
            System.out.println("Data inválida.");
        }

        System.out.println("Signo do horóscopo: " + getSigno(dia, mes));

        entrada.close();
    }
}
