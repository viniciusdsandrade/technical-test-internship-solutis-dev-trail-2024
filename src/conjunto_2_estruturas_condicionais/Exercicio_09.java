package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

import static conjunto_2_estruturas_condicionais.CommonMethods02.getInt;

public class Exercicio_09 {
    /*
    9. Verifique se o usuário é maior de idade ou não.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 09");
        Scanner entrada = new Scanner(System.in);
        int idade;

        System.out.print("Digite a idade do usuário: ");
        idade = getInt(entrada);

        if (isMaiorIdade(idade)) {
            System.out.println("O usuário é maior de idade.");
        } else {
            System.out.println("O usuário não é maior de idade.");
        }

        entrada.close();
    }

    public static boolean isMaiorIdade(int idade) {
        return idade >= 18;
    }
}
