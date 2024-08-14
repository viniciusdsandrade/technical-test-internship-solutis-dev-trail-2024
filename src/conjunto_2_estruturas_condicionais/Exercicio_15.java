package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

import static conjunto_2_estruturas_condicionais.CommonMethods02.*;
import static conjunto_2_estruturas_condicionais.Data.getProximoAniversario;
import static conjunto_2_estruturas_condicionais.Data.isValidDate;

public class Exercicio_15 {
    /*
    15. Verifique a validade a proxima data de aniversario do usuario com base na sua data de nascimento
    e a data atual.

    Verifique se a data de nascimento existe

    Meses com 28 dias: fevereiro.(e se for ano bissexto, 29 dias).
    Meses com 30 dias: abril, junho, setembro e novembro.
    Meses com 31 dias: janeiro, março, maio, julho, agosto, outubro e dezembro.
     */

    // Fiz uma classe Data em uma disciplina de Orientação a Objetos do curso Técnico. Vou reaproveitá-la aqui.

    public static void main(String[] args) {
        System.out.println("Exercício 15");
        Scanner entrada = new Scanner(System.in);

        byte dia, mes;
        short ano;
        String nomeMes;

        System.out.print("Digite o dia do seu nascimento: ");
        dia = getDia(entrada);

        System.out.print("Digite o mês do seu nascimento: ");
        mes = getMes(entrada);

        System.out.print("Digite o ano do seu nascimento: ");
        ano = getAno(entrada);

        nomeMes = getNomeMes(mes);

        if (isValidDate(dia, mes, ano)) {
            System.out.println("Data de aniversário válida.");
            System.out.println("Mês: " + nomeMes);
        } else {
            System.out.println("Data de aniversário inválida.");
        }

        Data dataNascimento = new Data(dia, mes, ano);
        Data proximoAniversario = getProximoAniversario(dataNascimento);

        System.out.println("O próximo aniversário será em: " + proximoAniversario);

        entrada.close();
    }
}
