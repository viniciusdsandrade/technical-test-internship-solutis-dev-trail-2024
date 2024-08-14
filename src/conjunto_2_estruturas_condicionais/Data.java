package conjunto_2_estruturas_condicionais;

/*
Escreva uma classe Data cuja instância (objeto) represente uma data.

Esta classe deverá dispor dos seguintes métodos:
    1 - construtor define a data que determinado objeto (por parâmetro), este metodo verifica se a
        data está correta, caso não esteja a data é configurada como 01/01/0001
        compara recebe como parâmetro outro objeto da Classe data, compare com a data corrente e
        retorne:
            0  se as datas forem iguais;
            1  se a data corrente for maior que a do parâmetro;
           −1  se a data do parâmetro for maior que a corrente.
    2 - getDia retorna o dia da data
    3 - getMes retorna o mês da data
    4 - getMesExtenso retorna o mês da data corrente por extenso
    5 - getAno retorna o ano da data
    6 - isBissexto retorna verdadeiro se o ano da data corrente for bissexto e falso caso contrário
    7 - clone o objeto clona a si próprio, para isto, ele cria um novo objeto da classe Data com os
        mesmos valores de atributos e retorna sua referência pelo metodo
 */

import java.time.LocalDate;
import java.util.Objects;

import static conjunto_2_estruturas_condicionais.ShallowOrDeepCopy.verifyAndCopy;

public class Data implements Comparable<Data>, Cloneable {

    private byte dia, mes;
    private short ano;

    public Data(byte dia, byte mes, short ano) {

        if (!isValidDate(dia, mes, ano))
            throw new IllegalArgumentException("A data não é válida.");

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data() {
    }

    public static boolean isValidDate(byte dia, byte mes, short ano) {
        if (dia < 1 || dia > 31) return false;
        if (mes < 1 || mes > 12) return false;
        if (ano == 0) return false;
        if (ano == 1582 && mes == 10 && dia >= 5 && dia <= 14) return false;
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) return false;
        if (mes == 2 && dia > 29) return false;
        return mes != 2 || dia != 29 || isBissexto(ano);
    }

    public static boolean isBissexto(short ano) {
        if (ano < 1583) return ano % 4 == 0;
        if (ano % 400 == 0) return true;
        return ano % 4 == 0 && ano % 100 != 0;
    }

    public static String getBimestre(byte mes) {
        return switch (mes) {
            case 1, 2 -> "1º";
            case 3, 4 -> "2º";
            case 5, 6 -> "3º";
            case 7, 8 -> "4º";
            case 9, 10 -> "5º";
            case 11, 12 -> "6º";
            default -> "Erro";
        };
    }

    public static String getTrimestre(byte mes) {
        return switch (mes) {
            case 1, 2, 3 -> "1º";
            case 4, 5, 6 -> "2º";
            case 7, 8, 9 -> "3º";
            case 10, 11, 12 -> "4º";
            default -> "Erro";
        };
    }

    public static String getQuadrimestre(byte mes) {
        return switch (mes) {
            case 1, 2, 3, 4 -> "1º";
            case 5, 6, 7, 8 -> "2º";
            case 9, 10, 11, 12 -> "3º";
            default -> "Erro";
        };
    }

    public static String getSemestre(byte mes) {
        return switch (mes) {
            case 1, 2, 3, 4, 5, 6 -> "1º";
            case 7, 8, 9, 10, 11, 12 -> "2º";
            default -> "Erro";
        };
    }

    public static String getSigno(byte dia, byte mes) {
        return switch (mes) {
            case 1 -> dia < 20 ? "Capricórnio" : "Aquário";
            case 2 -> dia < 19 ? "Aquário" : "Peixes";
            case 3 -> dia < 21 ? "Peixes" : "Áries";
            case 4 -> dia < 20 ? "Áries" : "Touro";
            case 5 -> dia < 21 ? "Touro" : "Gêmeos";
            case 6 -> dia < 21 ? "Gêmeos" : "Câncer";
            case 7 -> dia < 23 ? "Câncer" : "Leão";
            case 8 -> dia < 23 ? "Leão" : "Virgem";
            case 9 -> dia < 23 ? "Virgem" : "Libra";
            case 10 -> dia < 23 ? "Libra" : "Escorpião";
            case 11 -> dia < 22 ? "Escorpião" : "Sagitário";
            case 12 -> dia < 22 ? "Sagitário" : "Capricórnio";
            default -> "Erro";
        };
    }

    public static Data getProximoAniversario(Data dataNascimento) {
        // Obtém a data atual do sistema
        LocalDate dataAtual = LocalDate.now();

        // Cria uma instância de Data para o próximo aniversário com o mesmo dia e mês de nascimento
        Data proximoAniversario = new Data(dataNascimento.getDia(), dataNascimento.getMes(), (short) dataAtual.getYear());

        // Compara a data atual com o próximo aniversário
        if (dataAtual.isAfter(LocalDate.of(proximoAniversario.getAno(), proximoAniversario.getMes(), proximoAniversario.getDia()))) {
            proximoAniversario.setAno((short) (proximoAniversario.getAno() + 1));
        }

        return proximoAniversario;
    }

    public static int getIdadeEmDias(Data dataNascimento, Data dataAtual) {
        return dataNascimento.diferencaEmDias(dataAtual);
    }

    public static int getIdadeEmSemanas(Data dataNascimento, Data dataAtual) {
        return dataNascimento.diferencaEmDias(dataAtual) / 7;
    }

    public static int getIdadeEmMeses(Data dataNascimento, Data dataAtual) {
        int anos = dataNascimento.diferencaEmDias(dataAtual) / 365;
        return anos * 12;
    }

    public static float getIdadeEmAnos(Data dataNascimento, Data dataAtual) {
        return dataNascimento.diferencaEmDias(dataAtual) / 365.25f;
    }

    public byte getDia() {
        return dia;
    }

    public byte getMes() {
        return mes;
    }

    public short getAno() {
        return ano;
    }

    public void setDia(byte dia) {
        if (!isValidDate(dia, this.mes, this.ano))
            throw new IllegalArgumentException("O dia não é válido.");

        this.dia = dia;
    }

    public void setMes(byte mes) {
        if (!isValidDate(this.dia, mes, this.ano))
            throw new IllegalArgumentException("O mês não é válido.");

        this.mes = mes;
    }

    public void setAno(short ano) {
        if (!isValidDate(this.dia, this.mes, ano))
            throw new IllegalArgumentException("O ano não é válido.");

        this.ano = ano;
    }

    public String diaDaSemana() {
        int dia = this.dia;
        int mes = this.mes;
        int ano = this.ano;

        if (mes == 1 || mes == 2) {
            mes += 12;
            ano--;
        }

        int k = ano % 100;
        int j = ano / 100;

        int diaDaSemana = (dia + (13 * (mes + 1)) / 5 + k + (k / 4) + (j / 4) - (2 * j)) % 7;

        return switch (diaDaSemana) {
            case 0 -> "Sábado";
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            default -> "Erro";
        };
    }

    public int diferencaEmDias(Data data) {
        int days = 0;
        Data data1 = new Data(this);
        Data data2 = new Data(data);
        if (data1.compareTo(data2) == 0) return 0;
        if (data1.compareTo(data2) > 0) {
            while (data1.compareTo(data2) > 0) {
                data2.avanceUmDia();
                days++;
            }
        } else {
            while (data1.compareTo(data2) < 0) {
                data1.avanceUmDia();
                days++;
            }
        }
        return days;
    }

    public String getDiaDoAno() {
        int dia = this.dia;
        int mes = this.mes;
        int ano = this.ano;

        if (mes == 1 || mes == 2) {
            mes += 12;
            ano--;
        }

        int k = ano % 100;
        int j = ano / 100;

        int diaDaSemana = (dia + (13 * (mes + 1)) / 5 + k + (k / 4) + (j / 4) - (2 * j)) % 7;

        int dias = 0;
        for (int i = 1; i < mes; i++) {
            if (i == 2) {
                if (isBissexto((short) ano)) {
                    dias += 29;
                } else {
                    dias += 28;
                }
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                dias += 30;
            } else {
                dias += 31;
            }
        }
        dias += dia;

        if (isBissexto((short) ano))
            dias += 1;

        return "Dia " + dias;
    }

    public String getSemanaDoAno() {
        int dia = this.dia;
        int mes = this.mes;
        int ano = this.ano;

        if (mes == 1 || mes == 2) {
            mes += 12;
            ano--;
        }

        int k = ano % 100;
        int j = ano / 100;

        int diaDaSemana = (dia + (13 * (mes + 1)) / 5 + k + (k / 4) + (j / 4) - (2 * j)) % 7;

        int dias = 0;
        for (int i = 1; i < mes; i++) {
            if (i == 2) {
                if (isBissexto((short) ano)) {
                    dias += 29;
                } else {
                    dias += 28;
                }
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                dias += 30;
            } else {
                dias += 31;
            }
        }
        dias += dia;

        if (isBissexto((short) ano))
            dias += 1;

        return "Semana " + ((dias + diaDaSemana - 1) / 7 + 1);
    }

    public String getMesPorExtenso() {
        return switch (this.mes) {
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> "Erro";
        };
    }

    public void avanceUmDia() {

        if (this.dia == 4 && this.mes == 10 && this.ano == 1582) {
            this.dia = (byte) 15;
        } else if (isValidDate((byte) (this.dia + 1), this.mes, this.ano)) {
            this.dia++;
        } else if (isValidDate((byte) 1, (byte) (this.mes + 1), this.ano)) {
            this.dia = (byte) 1;
            this.mes++;
        } else {
            this.dia = (byte) 1;
            this.mes = (byte) 1;
            this.ano++;
            if (this.ano == 0) {
                this.ano++;
            }
        }
    }

    public void avanceUmaSemana() {
        avanceDias(7);
    }

    public void avanceUmMes() {
        if (isValidDate(this.dia, (byte) (this.mes + 1), this.ano)) {
            this.mes++;
        } else {
            this.mes = 1;
            this.ano++;
        }
    }

    public void avanceUmAno() {
        if (isValidDate(this.dia, this.mes, (short) (this.ano + 1)))
            this.ano++;
        else
            this.ano = 1;
    }

    public void retrocedaUmDia() {
        if (this.dia == 15 && this.mes == 10 && this.ano == 1582) {
            this.dia = 4;
        } else if (this.dia == 1 && this.mes == 10 && this.ano == 1582) {
            this.dia = 30;
            this.mes = 9;
        } else if (isValidDate((byte) (this.dia - 1), this.mes, this.ano)) {
            this.dia--;
        } else if (this.mes == 2 && isValidDate((byte) 28, (byte) (this.mes - 1), this.ano)) {
            this.dia = 28;
            this.mes--;
        } else if (isValidDate((byte) 31, (byte) (this.mes - 1), this.ano)) {
            this.mes--;
            if (this.mes == 1 || this.mes == 3 ||
                    this.mes == 5 || this.mes == 7 ||
                    this.mes == 8 || this.mes == 10 || this.mes == 12) {
                this.dia = 31;
            } else {
                this.dia = 30;
            }
        } else if (isValidDate((byte) 31, (byte) 12, (short) (this.ano - 1))) {
            this.dia = 31;
            this.mes = 12;
            this.ano--;
        }
    }

    public void retrocedaUmaSemana() {
        retrocedaDias(7);
    }

    public void retrocedaUmMes() {
        if (isValidDate(this.dia, (byte) (this.mes - 1), this.ano)) {
            this.mes--;
        } else {
            this.mes = 12;
            this.ano--;
        }
    }

    public void retrocedaUmAno() {
        if (isValidDate(this.dia, this.mes, (short) (this.ano - 1)))
            this.ano--;
        else
            this.ano = -1;

    }

    public void avanceDias(int dias) {
        if (dias < 0) throw new IllegalArgumentException("O número de dias não pode ser negativo.");

        while (dias > 0) {
            avanceUmDia();
            dias--;
        }
    }

    public void avanceMeses(int meses) {
        if (meses < 0) throw new IllegalArgumentException("O número de meses não pode ser negativo.");

        while (meses > 0) {
            avanceUmMes();
            meses--;
        }
    }

    public void avanceAnos(int anos) {
        if (anos < 0) throw new IllegalArgumentException("O número de anos não pode ser negativo.");

        while (anos > 0) {
            avanceUmAno();
            anos--;
        }
    }

    public void retrocedaDias(int dias) {
        if (dias < 0) throw new IllegalArgumentException("O número de dias não pode ser negativo.");

        while (dias > 0) {
            retrocedaUmDia();
            dias--;
        }
    }

    public void retrocedaMeses(int meses) {
        if (meses < 0) throw new IllegalArgumentException("O número de meses não pode ser negativo.");

        while (meses > 0) {
            retrocedaUmMes();
            meses--;
        }
    }

    public void retrocedaAnos(int anos) {
        if (anos < 0) throw new IllegalArgumentException("O número de anos não pode ser negativo.");

        while (anos > 0) {
            retrocedaUmAno();
            anos--;
        }
    }

    public Data getDiaSeguinte() {
        Data ret = null;

        try {
            ret = new Data((byte) (this.dia + 1), this.mes, this.ano);
        } catch (Exception erro1) {
            try {
                ret = new Data((byte) 1, (byte) (this.mes + 1), this.ano);
            } catch (Exception erro2) {
                try {
                    ret = new Data((byte) 1, (byte) 1, (short) (this.ano + 1));
                } catch (Exception erro3) {
                    try {
                        ret = new Data((byte) 1, (byte) 1, (short) (this.ano + 2));
                    } catch (Exception erro4) {
                        try {
                            ret = new Data((byte) 15, (byte) 10, (short) 1582);
                        } catch (Exception ignored) {
                        }
                    }
                }
            }
        }
        return ret;
    }

    public Data getSemanaSeguinte() {
        Data ret = new Data(this);
        ret.avanceDias(7);
        return ret;
    }

    public Data getMesSeguinte() {
        Data ret = new Data(this);
        ret.avanceUmMes();
        return ret;
    }

    public Data getAnoSeguinte() {
        Data ret = new Data(this);
        ret.avanceUmAno();
        return ret;
    }

    public Data getDecadaSeguinte() {
        Data ret = new Data(this);
        ret.avanceAnos(10);
        return ret;
    }

    public Data getSeculoSeguinte() {
        Data ret = new Data(this);
        ret.avanceAnos(100);
        return ret;
    }

    public Data getMilenioSeguinte() {
        Data ret = new Data(this);
        ret.avanceAnos(1000);
        return ret;
    }

    public Data getDiaAnterior() {
        Data ret = null;

        try {
            ret = new Data((byte) (this.dia - 1), this.mes, this.ano); // Retorno de um dia permitido
        } catch (Exception erro1) {
            try {
                ret = new Data((byte) (this.dia - 10), this.mes, this.ano); // Data do Papa
            } catch (Exception erro2) {
                try {
                    ret = new Data((byte) 31, (byte) (this.mes - 1), this.ano); // Retornar um mes caso a data seja
                    // 1/xx/yyyy
                } catch (Exception erro3) {
                    try {
                        ret = new Data((byte) 30, (byte) (this.mes - 1), this.ano); // Se não for um mês com 31 dias,
                        // tentar com 30
                    } catch (Exception erro4) {
                        try {
                            ret = new Data((byte) 29, (byte) (this.mes - 1), this.ano); // Se não for um mês com 30
                            // dias, tentar com 29
                        } catch (Exception erro5) {
                            try {
                                ret = new Data((byte) 28, (byte) (this.mes - 1), this.ano); // Se não for um mês com 29
                                // dias, tentar com 28
                            } catch (Exception erro6) {
                                try {
                                    ret = new Data((byte) 31, (byte) 12, (short) (this.ano - 1)); // se for dia 31/12
                                    // retornar 1 ano
                                } catch (Exception erro7) {
                                    try {
                                        ret = new Data((byte) 31, (byte) 12, (short) (this.ano - 2)); // Se não puder
                                        // retornar 1 ano,
                                        // retornar 2
                                    } catch (Exception erro8) {
                                        try {
                                            ret = new Data((byte) 4, (byte) 10, (short) 1582);// data do papa
                                        } catch (Exception ignored) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return ret;
    }

    public Data getSemanaAnterior() {
        Data ret = new Data(this);
        ret.retrocedaDias(7);
        return ret;
    }

    public Data getMesAnterior() {
        Data ret = new Data(this);
        ret.retrocedaUmMes();
        return ret;
    }

    public Data getAnoAnterior() {
        Data ret = new Data(this);
        ret.retrocedaUmAno();
        return ret;
    }

    public Data getDecadaAnterior() {
        Data ret = new Data(this);
        ret.retrocedaAnos(10);
        return ret;
    }

    public Data getSeculoAnterior() {
        Data ret = new Data(this);
        ret.retrocedaAnos(100);
        return ret;
    }

    public Data getMilenioAnterior() {
        Data ret = new Data(this);
        ret.retrocedaAnos(1000);
        return ret;
    }

    public Data(Data modelo) {
        if (modelo == null) throw new IllegalArgumentException("A data não pode ser nula.");

        this.dia = (byte) verifyAndCopy(modelo.getDia());
        this.mes = (byte) verifyAndCopy(modelo.getMes());
        this.ano = (short) verifyAndCopy(modelo.getAno());
    }

    @Override
    public Object clone() {
        Data clone = null;

        try {
            clone = new Data(this);
        } catch (Exception ignored) {
        }

        return clone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;

        Data that = (Data) o;

        return Objects.equals(this.dia, that.dia) &&
                Objects.equals(this.mes, that.mes) &&
                Objects.equals(this.ano, that.ano);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = 1;

        hash *= prime + Integer.hashCode(this.dia);
        hash *= prime + Integer.hashCode(this.mes);
        hash *= prime + Integer.hashCode(this.ano);

        if (hash < 0) hash *= -1;

        return hash;
    }

    @Override
    public String toString() {

        if (this.dia == 0 || this.mes == 0 || this.ano == 0)
            return "Data vazia";

        if (this.ano > 0)
            return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
        else
            return String.format("%02d/%02d/%04d a.C.", this.dia, this.mes, this.ano * -1);
    }

    @Override
    public int compareTo(Data o) {
        int anoCompare = Integer.compare(this.ano, o.ano);
        if (anoCompare != 0) return anoCompare;

        int mesCompare = Integer.compare(this.mes, o.mes);
        if (mesCompare != 0) return mesCompare;

        return Integer.compare(this.dia, o.dia);
    }
}