package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

import static conjunto_2_estruturas_condicionais.CommonMethods02.*;
import static conjunto_2_estruturas_condicionais.Data.getTrimestre;
import static conjunto_2_estruturas_condicionais.Data.isValidDate;

public class Exercicio_16 {

    /*
    16.Acrescente no exercício anterior se a pessoa nasceu no 1º, 2º, 3º ou 4º trimestre.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 16");
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

        entrada.close();
    }
}
