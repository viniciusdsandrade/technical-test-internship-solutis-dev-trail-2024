package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

import static conjunto_2_estruturas_condicionais.CommonMethods02.*;

public class Exercicio_26 {

    /*
    26. Receba 2 horários e exiba a diferença entre eles em segundos.
    A entrada destes horários pode ocorrer em qualquer ordem.
    Dica: transforme os dois horários para segundos.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 26");
        Scanner entrada = new Scanner(System.in);

        byte horas1, minutos1, segundos1, horas2, minutos2, segundos2;
        int totalSegundos1, totalSegundos2, diferenca;

        System.out.print("Digite as horas do primeiro horário: ");
        horas1 = getHora(entrada);

        System.out.print("Digite os minutos do primeiro horário: ");
        minutos1 = getMinuto(entrada);

        System.out.print("Digite os segundos do primeiro horário: ");
        segundos1 = getSegundo(entrada);

        System.out.print("Digite as horas do segundo horário: ");
        horas2 = getHora(entrada);

        System.out.print("Digite os minutos do segundo horário: ");
        minutos2 = getMinuto(entrada);

        System.out.print("Digite os segundos do segundo horário: ");
        segundos2 = getSegundo(entrada);

        totalSegundos1 = horas1 * 3600 + minutos1 * 60 + segundos1;
        totalSegundos2 = horas2 * 3600 + minutos2 * 60 + segundos2;

        diferenca = Math.abs(totalSegundos1 - totalSegundos2);

        System.out.println("A diferença entre os horários é de " + diferenca + " segundos.");

        entrada.close();
    }
}
