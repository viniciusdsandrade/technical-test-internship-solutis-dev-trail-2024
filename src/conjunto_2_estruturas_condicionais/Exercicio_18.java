package conjunto_2_estruturas_condicionais;

import java.time.LocalDate;
import java.util.Scanner;

import static conjunto_2_estruturas_condicionais.CommonMethods02.*;
import static conjunto_2_estruturas_condicionais.Data.*;
import static java.time.LocalDate.now;

public class Exercicio_18 {

    /*
    18. Inclua no exercício anterior a solicitação do ano de nascimento e também da data de hoje.
    A partir destas informações, apresente a idade atual desta pessoa.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 18");
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

        // Obtém a data atual do sistema
        LocalDate dataAtual = now();

        byte diaAtual, mesAtual;
        short anoAtual;

        diaAtual = (byte) dataAtual.getDayOfMonth();
        mesAtual = (byte) dataAtual.getMonthValue();
        anoAtual = (short) dataAtual.getYear();

        Data dataNascimento = new Data(dia, mes, ano);
        Data hoje = new Data(diaAtual, mesAtual, anoAtual);

        System.out.println("Idade do usuário: ");
        System.out.println("Em dia:     " + getIdadeEmDias(dataNascimento, hoje));
        System.out.println("Em Semanas  " + getIdadeEmSemanas(dataNascimento, hoje));
        System.out.println("Em meses:   " + getIdadeEmMeses(dataNascimento, hoje));
        System.out.println("Em anos:    " + getIdadeEmAnos(dataNascimento, hoje));

        entrada.close();
    }
}
