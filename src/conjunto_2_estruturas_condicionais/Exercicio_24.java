package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

import static conjunto_2_estruturas_condicionais.CommonMethods02.getDia;

public class Exercicio_24 {
    /*
    24. Faça a verificação da validade de uma data completa (dia, mês e ano).
    Obs: um ano é bissexto, cujo mês de fevereiro possui 29 dias, se o resto da divisão do ano
    por 4 e também por 100 for zero, ou ainda se o resto da divisão por 400 for zero. Os meses
    com 30 dias são 4, 6, 9 e 11, os demais tem 31 dias.

    Obs. Resto da divisão em Java é calculado com o operador %.
     */

    // Como mencionado no exercicio 15, fiz uma classe Data em uma disciplina de Orientação a Objetos do curso Técnico.
    // Vou reaproveitar seus metodos aqui

    public static void main(String[] args) {
        System.out.println("Exercício 24");

        Scanner entrada = new Scanner(System.in);

        byte dia, mes;
        short ano;

        System.out.print("Digite o dia: ");
        dia = getDia(entrada);

        System.out.print("Digite o mês: ");
        mes = getDia(entrada);

        System.out.print("Digite o ano: ");
        ano = entrada.nextShort();

        if (isValidDate(dia, mes, ano)) {
            System.out.println("Data válida.");
        } else {
            System.out.println("Data inválida.");
        }
    }

    /**
     * Verifica se uma data é válida, considerando dia, mês e ano.
     *
     * @param dia o dia do mês (valor entre 1 e 31)
     * @param mes o mês do ano (valor entre 1 e 12)
     * @param ano o ano (um valor positivo, exceto 0)
     * @return {@code true} se a data for válida; {@code false} caso contrário
     */
    public static boolean isValidDate(byte dia, byte mes, short ano) {
        if (dia < 1 || dia > 31) return false;
        if (mes < 1 || mes > 12) return false;
        if (ano == 0) return false;
        if (ano == 1582 && mes == 10 && dia >= 5 && dia <= 14) return false;
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) return false;
        if (mes == 2 && dia > 29) return false;
        return mes != 2 || dia != 29 || isBissexto(ano);
    }

    /**
     * Verifica se um ano é bissexto.
     *
     * @param ano o ano a ser verificado
     * @return {@code true} se o ano for bissexto; {@code false} caso contrário
     */
    public static boolean isBissexto(short ano) {
        if (ano < 1583) return ano % 4 == 0;
        if (ano % 400 == 0) return true;
        return ano % 4 == 0 && ano % 100 != 0;
    }

}
