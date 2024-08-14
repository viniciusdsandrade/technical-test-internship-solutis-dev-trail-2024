package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

import static conjunto_2_estruturas_condicionais.CommonMethods02.getString;

public class Exercicio_14 {
    /*
    14.Receba do usuário o nome de um mês. Exiba o número equivalente.

    Obs.: para comparar Strings em Java deve-se usar o metodo equals ou equalsIgnoreCase,
    mas nunca o operador “==”. Por exemplo, para comparar a variável nome com “Maria”
    deve-se usar: if(nome.equals(“Maria”) ...
     */

    public static void main(String[] args) {
        System.out.println("Exercício 14");

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o nome de um mês: ");
        String mes;

        mes = getString(entrada);
        int numeroMes = getNumeroMes(mes);

        if (numeroMes == -1) {
            System.out.println("Mês inválido.");
        } else {
            System.out.println("O número equivalente ao mês " + mes + " é: " + numeroMes);
        }

        entrada.close();
    }

    public static int getNumeroMes(String mes) {
        return switch (mes.toLowerCase()) {
            case "janeiro" -> 1;
            case "fevereiro" -> 2;
            case "março" -> 3;
            case "abril" -> 4;
            case "maio" -> 5;
            case "junho" -> 6;
            case "julho" -> 7;
            case "agosto" -> 8;
            case "setembro" -> 9;
            case "outubro" -> 10;
            case "novembro" -> 11;
            case "dezembro" -> 12;
            default -> -1;
        };
    }
}
