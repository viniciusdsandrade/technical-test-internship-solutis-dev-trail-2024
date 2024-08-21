import java.text.Normalizer;
import java.util.Scanner;

public class ListaDeExercicio02 {

    /*
    1. Qual a saída do seguinte programa:

    class teste {
        public static void main( String args[] ){
        int i = 5;
        int j = i;
        j = 10;
        System.out.println( "i + j = " + j + i );
        }
    }

    2. Faça um programa que receba 2 valores e retorne o maior entre eles.

    3. Crie uma classe e na função main() implemente um programa que lê um número inteiro do teclado e imprime todos os números primos menores que ele (divisíveis por 1 ou por ele mesmo).

    4. Pretende-se escrever um programa que leia do teclado uma distância expressa em milhas, converte-a para quilômetros e apresenta o resultado no console. (fórmula de conversão: 1 milha (1.609,34 m) = 1.609 km).

    5. Faça um programa que solicite ao usuário um número de 1 a 7, e imprima na tela o dia da semana correspondente. Suponha que Segunda corresponde a 1 , Terça corresponde a 2, e assim por diante. Utilizando Array.

    6. Imprima produto dos números de ímpares de 15 a 30, usando os tipos de dados int e float.

    7. Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e 100, usando os tipos de dados int e double .

    8. Criar uma classe Java que receba uma palavra (String) retorne uma mensagem caso a
    palavra fornecida seja uma palavra que pode ser lida da esquerda pra direita ou da direita pra esquerda obtendo-se a mesma palavra. Ex.: Ana, arara, osso, etc.

    9. Escreva uma classe para calcular a área de um círculo, sabendo que a área é A = PI * r2, onde o raio (r) deve ser informado pelo usuário e o resultado terá que ser arredondado.

    10. Escreva uma classe que conte a quantidade de vogais, espaços em brancos e consoantes de uma cadeia de caracteres.

    11. Escreva um programa que tenha duas palavras como entrada, e a saída imprima as palavras em ordem alfabética (utilize o metodo compareTo da classe String),.
    Informe também, qual das palavras tem o maior número de caracteres.

    12. Os motoristas se preocupam com a quilometragem obtida por seus automóveis. Um
    motorista monitorou vários tanques cheios de gasolina registrando a quilometragem dirigida e a quantidade de combustível em litros utilizados para cada tanque cheio.
    Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e os litros de gasolina consumidos (ambos com inteiros) para cada tanque cheio.
    O programa deve calcular e exibir o consumo em quilômetros/litro para cada tanque cheio e imprimir a quilometragem combinada e a soma total de litros de combustível consumidos até esse ponto.
    Todos os cálculos de média devem produzir resultados de ponto flutuante.

    Observação: os exercícios da lista devem ser entregues até 31/07/2023 às 9h00m via class room e github
     */

    public static void main(String[] args) {
        /*
        1. Qual a saída do seguinte programa:
        class teste {
            public static void main( String args[] ){
                int i = 5;
                int j = i;
                j = 10;
                System.out.println( "i + j = " + j + i );
            }
        }
         */
        exercicio01();

        /*
        2. Faça um programa que receba 2 valores e retorne o maior entre eles.
         */
        exercicio02();

        /*
        3. Crie uma classe e na função main() implemente um programa que lê um
        número inteiro do teclado e imprime todos os números primos menores que
        ele (divisíveis por 1 ou por ele mesmo).
         */
        exercicio03();

        /*
        4. Pretende-se escrever um programa que leia do teclado uma distância expressa em milhas,
        converte-a para quilômetros e apresenta o resultado no console.
        (fórmula de conversão: 1 milha = 1.609 km).
         */
        exercicio04();

        /*
        5. Faça um programa que solicite ao usuário um número de 1 a 7,
        e imprima na tela o dia da semana correspondente.
        Suponha que Segunda corresponde a 1,
        Terça corresponde a 2, e assim por diante.
        Utilizando Array.
         */
        exercicio05();

        /*
        6. Imprima produto dos números de ímpares de 15 a 30, usando os tipos de dados int e float.
         */
        exercicio06();

        /*
        7. Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e 100, usando os tipos de dados int e double .
         */
        exercicio07();

        /*
        8. Criar uma classe Java que receba uma palavra (String) retorne uma mensagem caso a
        palavra fornecida seja uma palavra que pode ser lida da esquerda pra direita ou da direita pra esquerda obtendo-se a mesma palavra. Ex.: Ana, arara, osso, etc.
         */
        exercicio08();

        /*
        9. Escreva uma classe para calcular a área de um círculo, sabendo que a área é A = PI * r2, onde o raio (r)
        deve ser informado pelo usuário e o resultado terá que ser arredondado.
         */
        exercicio09();

        /*
        10. Escreva uma classe que conte a quantidade de vogais, espaços em brancos e consoantes de uma cadeia de caracteres.
         */
        exercicio10();

        /*
        11. Escreva um programa que tenha duas palavras como entrada, e a saída imprima as palavras em ordem alfabética (utilize o metodo compareTo da classe String),.
        Informe também, qual das palavras tem o maior número de caracteres.
         */
        exercicio11();

        /*
        12. Os motoristas se preocupam com a quilometragem obtida por seus automóveis.
        Um motorista monitorou vários tanques cheios de gasolina registrando a quilometragem
        dirigida e a quantidade de combustível em litros utilizados para cada tanque cheio.
        Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e os
        litros de gasolina consumidos (ambos com inteiros) para cada tanque cheio.
        O programa deve calcular e exibir o consumo em quilômetros/litro para cada tanque cheio
        e imprimir a quilometragem combinada e a soma total de litros de combustível
        consumidos até esse ponto.
        Todos os cálculos de média devem produzir resultados de ponto flutuante.
         */
        exercicio12();
    }

    public static void exercicio01() {
        int i = 5;
        int j = i;
        j = 10;
        System.out.println("i + j = " + j + i);
    }

    public static void exercicio02() {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else {
            System.out.println("O maior número é: " + num2);
        }
    }

    public static void exercicio03() {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Digite um número inteiro: ");
        num = scanner.nextInt();

        for (int i = 1; i < num; i++) {
            if (isPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrimo(int num) {
        if (num < 2) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void exercicio04() {
        Scanner scanner = new Scanner(System.in);
        double milhas, km;

        System.out.println("Digite a distância em milhas: ");
        milhas = scanner.nextDouble();

        km = milhas * 1.609;

        System.out.println("A distância em quilômetros é: " + km);
    }

    public static void exercicio05() {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Digite um número de 1 a 7: ");
        num = scanner.nextInt();

        String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};

        System.out.println("O dia da semana correspondente é: " + dias[num - 1]);
    }

    public static void exercicio06() {
        int produto = 1;
        float produtoFloat = 1;

        for (int i = 15; i <= 30; i++) {
            if (!isPar(i)) {
                produto *= i;
                produtoFloat *= i;
            }
        }

        System.out.println("Produto dos números ímpares de 15 a 30 (int): " + produto);
        System.out.println("Produto dos números ímpares de 15 a 30 (float): " + produtoFloat);
    }

    public static boolean isPar(int num) {
        return num % 2 == 0;
    }

    public static void exercicio07() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Divisão por 2 de " + i + ": " + (i / 2));
                System.out.println("Divisão por 2 de " + i + ": " + ((double) i / 2));
            }
        }
    }

    public static void exercicio08() {
        Scanner scanner = new Scanner(System.in);
        String palavra;

        System.out.println("Digite uma palavra: ");
        palavra = scanner.nextLine();

        if (isPalindromo(palavra)) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }
    }

    private static boolean isPalindromo(String palavra) {
        if (palavra == null || palavra.isEmpty()) return false; // Retorna falso para entradas nulas ou vazias

        // Normaliza a string removendo acentos e convertendo para minúsculas
        String normalizada = Normalizer.normalize(palavra, Normalizer.Form.NFD);
        normalizada = normalizada.replaceAll("\\p{InCombiningDiacriticalMarks}+", ""); // Remove acentos
        normalizada = normalizada.replaceAll("[^a-zA-Z0-9]", ""); // Remove caracteres não alfanuméricos
        normalizada = normalizada.toLowerCase(); // Converte para minúsculas

        int length = normalizada.length();
        for (int i = 0; i < length / 2; i++) {
            if (normalizada.charAt(i) != normalizada.charAt(length - 1 - i)) {
                return false; // Retorna falso assim que uma diferença for encontrada
            }
        }

        return true; // Retorna verdadeiro se a palavra for um palíndromo
    }

    public static void exercicio09() {
        Scanner scanner = new Scanner(System.in);
        double raio, area;

        System.out.println("Digite o raio do círculo: ");
        raio = scanner.nextDouble();

        area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo é: " + String.format("%.3f", area));
    }

    public static void exercicio10() {
        Scanner scanner = new Scanner(System.in);
        String palavra;
        int vogais = 0, espacos = 0, consoantes = 0;

        System.out.println("Digite uma palavra: ");
        palavra = scanner.nextLine();

        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);

            if (c == ' ') {
                espacos++;
            } else if (isVogal(c)) {
                vogais++;
            } else {
                consoantes++;
            }
        }

        System.out.println("Quantidade de vogais: " + vogais);
        System.out.println("Quantidade de espaços: " + espacos);
        System.out.println("Quantidade de consoantes: " + consoantes);
    }

    public static boolean isVogal(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void exercicio11() {
        Scanner scanner = new Scanner(System.in);
        String palavra1, palavra2;

        System.out.println("Digite a primeira palavra: ");
        palavra1 = scanner.nextLine();

        System.out.println("Digite a segunda palavra: ");
        palavra2 = scanner.nextLine();

        if (palavra1.compareTo(palavra2) < 0) {
            System.out.println("Ordem alfabética: " + palavra1 + ", " + palavra2);
        } else {
            System.out.println("Ordem alfabética: " + palavra2 + ", " + palavra1);
        }

        if (palavra1.length() > palavra2.length()) {
            System.out.println("A primeira palavra tem mais caracteres.");
        } else if (palavra1.length() < palavra2.length()) {
            System.out.println("A segunda palavra tem mais caracteres.");
        } else {
            System.out.println("As palavras têm o mesmo número de caracteres.");
        }
    }

    public static void exercicio12() {
        Scanner scanner = new Scanner(System.in);
        int km, litros, totalKm = 0, totalLitros = 0;
        double consumo;

        System.out.println("Bem-vindo ao monitor de consumo de combustível!");
        System.out.println("Por favor, insira os dados de cada tanque cheio.");
        System.out.println("Quando terminar, digite '0' para sair e visualizar o resumo.");

        // Loop para capturar dados de múltiplos tanques de gasolina.
        while (true) {
            // Solicita ao usuário a entrada da quilometragem dirigida.
            System.out.print("Digite os quilômetros dirigidos (ou 0 para sair): ");
            km = scanner.nextInt();

            // Verifica se o usuário deseja encerrar o programa.
            if (km == 0) {
                System.out.println("Encerrando inserção de dados...");
                break;
            }

            // Solicita ao usuário a entrada da quantidade de litros de gasolina consumidos.
            System.out.print("Digite os litros de gasolina consumidos: ");
            litros = scanner.nextInt();

            // Verifica se os litros informados são válidos.
            if (litros <= 0) {
                System.out.println("Erro: A quantidade de litros deve ser maior que 0.");
                System.out.println("Por favor, insira novamente os dados deste tanque.");
                continue; // Reinicia o loop sem realizar cálculos.
            }

            // Calcula o consumo em quilômetros por litro (km/l).
            consumo = (double) km / litros;

            System.out.println("Consumo do tanque atual: " + String.format("%.2f", consumo) + " km/l.");

            // Atualiza os totais acumulados de quilômetros e litros.
            totalKm += km;
            totalLitros += litros;

            System.out.println("Dados do tanque registrados com sucesso!\n");
        }

        // Exibe o resumo final dos dados inseridos.
        System.out.println("\n--- Resumo Final ---");
        System.out.println("Quilometragem combinada: " + totalKm + " km");
        System.out.println("Total de litros de combustível consumidos: " + totalLitros + " litros");

        // Verifica se foram inseridos dados válidos para calcular a média.
        if (totalLitros > 0) {
            // Calcula e exibe a média geral de consumo em km/l para todos os tanques.
            double mediaConsumo = (double) totalKm / totalLitros;
            System.out.println("Média geral de consumo: " + String.format("%.2f", mediaConsumo) + " km/l.");
        } else {
            // Informa ao usuário que não houve dados suficientes para calcular a média.
            System.out.println("Nenhum dado válido foi inserido para calcular a média.");
        }

        // Mensagem de encerramento.
        System.out.println("\nObrigado por utilizar o monitor de consumo de combustível!");
        System.out.println("Até a próxima!");

        // Fecha o scanner para liberar recursos.
        scanner.close();
    }
}
