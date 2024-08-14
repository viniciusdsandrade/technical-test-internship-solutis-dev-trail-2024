package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

public class CommonMethods02 {

    public static String getString(Scanner entrada) {
        return entrada.nextLine().trim();
    }

    public static byte getDia(Scanner entrada) {
        byte dia = -1;
        boolean validInput = false;

        do {
            try {
                dia = Byte.parseByte(entrada.nextLine().trim());
                if (dia < 1 || dia > 31) {
                    System.out.println("Dia inválido. Digite um dia entre 1 e 31.");
                } else {
                    validInput = true; // Entrada válida
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            }
        } while (!validInput);

        return dia;
    }

    public static byte getMes(Scanner entrada) {
        byte mes = -1;
        boolean validInput = false;

        do {
            try {
                mes = Byte.parseByte(entrada.nextLine().trim());
                if (mes < 1 || mes > 12) {
                    System.out.println("Mês inválido. Digite um mês entre 1 e 12.");
                } else {
                    validInput = true; // Entrada válida
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            }
        } while (!validInput);

        return mes;
    }

    public static short getAno(Scanner entrada) {
        short ano = -1;
        boolean validInput = false;

        do {
            try {
                ano = Short.parseShort(entrada.nextLine().trim());
                if (ano < 0) {
                    System.out.println("Ano inválido. Digite um ano maior ou igual a 0.");
                } else {
                    validInput = true; // Entrada válida
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            }
        } while (!validInput);

        return ano;
    }

    public static byte getHora(Scanner entrada) {
        byte hora = -1;
        boolean validInput = false;

        do {
            try {
                hora = Byte.parseByte(entrada.nextLine().trim());
                if (hora < 0 || hora > 23) {
                    System.out.println("Hora inválida. Digite uma hora entre 0 e 23.");
                } else {
                    validInput = true; // Entrada válida
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            }
        } while (!validInput);

        return hora;
    }

    public static byte getMinuto(Scanner entrada) {
        byte minuto = -1;
        boolean validInput = false;

        do {
            try {
                minuto = Byte.parseByte(entrada.nextLine().trim());
                if (minuto < 0 || minuto > 59) {
                    System.out.println("Minuto inválido. Digite um minuto entre 0 e 59.");
                } else {
                    validInput = true; // Entrada válida
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            }
        } while (!validInput);

        return minuto;
    }

    public static byte getSegundo(Scanner entrada) {
        byte segundo = -1;
        boolean validInput = false;

        do {
            try {
                segundo = Byte.parseByte(entrada.nextLine().trim());
                if (segundo < 0 || segundo > 59) {
                    System.out.println("Segundo inválido. Digite um segundo entre 0 e 59.");
                } else {
                    validInput = true; // Entrada válida
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            }
        } while (!validInput);

        return segundo;
    }

    public static String getNomeMes(byte mes) {
        return switch (mes) {
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
            default -> "Mês inválido";
        };
    }

    public static int getInt(Scanner entrada) {
        int valor = -1;
        boolean validInput = false;

        do {
            try {
                valor = Integer.parseInt(entrada.nextLine().trim());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            }
        } while (!validInput);

        return valor;
    }

    public static Number getNumber(Scanner entrada) {
        Number numero = null;
        boolean validInput = false;

        do {
            try {
                String input = entrada.nextLine().trim();

                // Tenta converter para Integer primeiro
                try {
                    numero = Integer.parseInt(input);
                    validInput = true;
                } catch (NumberFormatException e1) {
                    // Se falhar, tenta converter para Double
                    try {
                        numero = Double.parseDouble(input);
                        validInput = true;
                    } catch (NumberFormatException e2) {
                        // Se falhar, avisa o usuário e pede uma nova entrada
                        System.out.println("Entrada inválida. Por favor, insira um número válido.");
                    }
                }
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        } while (!validInput);

        return numero;
    }

    public static double getDouble(Scanner entrada) {
        double valor = -1;
        boolean validInput = false;

        do {
            try {
                valor = Double.parseDouble(entrada.nextLine().trim());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            }
        } while (!validInput);

        return valor;
    }

    public static double getNota(Scanner entrada) {
        double nota = -1;
        boolean validInput = false;

        do {
            try {
                nota = Double.parseDouble(entrada.nextLine().trim());
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida. Digite uma nota entre 0 e 10.");
                } else {
                    validInput = true; // Entrada válida
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            }
        } while (!validInput);

        return nota;
    }

    public static byte getIdade(Scanner entrada) {
        byte idade = -1;
        boolean validInput = false;

        do {
            try {
                idade = Byte.parseByte(entrada.nextLine().trim());
                if (idade < 0 || idade > 126) {
                    System.out.println("Idade inválida. Digite uma idade entre 0 e 126.");
                } else {
                    validInput = true; // Entrada válida
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            }
        } while (!validInput);

        return idade;
    }

    public static double getSalario(Scanner entrada) {
        double salario = -1;
        boolean validInput = false;

        do {
            try {
                salario = Double.parseDouble(entrada.nextLine().trim());
                if (salario < 0) {
                    System.out.println("Salário inválido. Digite um salário maior ou igual a 0.");
                } else {
                    validInput = true; // Entrada válida
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            }
        } while (!validInput);

        return salario;
    }

    public static double getDesconto(Scanner entrada) {
        double desconto = -1;
        boolean validInput = false;

        do {
            try {
                desconto = Double.parseDouble(entrada.nextLine().trim());
                if (desconto < 0 || desconto > 100) {
                    System.out.println("Desconto inválido. Digite um desconto entre 0 e 100.");
                } else {
                    validInput = true; // Entrada válida
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            }
        } while (!validInput);

        return desconto;
    }

    public static double getEmprestimo(Scanner entrada) {
        double emprestimo = -1;
        boolean validInput = false;

        do {
            try {
                emprestimo = Double.parseDouble(entrada.nextLine().trim());
                if (emprestimo < 0) {
                    System.out.println("Empréstimo inválido. Digite um valor maior ou igual a 0.");
                } else {
                    validInput = true; // Entrada válida
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            }
        } while (!validInput);

        return emprestimo;
    }
}
