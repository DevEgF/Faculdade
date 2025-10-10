import java.util.Scanner;

/**
 * Programa que solicita o nome do usuário e exibe uma saudação.
 */
public class Exercicio1 {
    /**
     * Método principal que executa o programa.
     * Pede ao usuário para digitar um nome e imprime "Olá, [nome]".
     */
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = scr.nextLine();

        System.out.printf("Olá, %s!%n", name);

        scr.close(); // Boa prática: fechar o scanner para liberar recursos.
    }
}

import java.util.Scanner;

/**
 * Calcula a média aritmética de três números fornecidos pelo usuário.
 */
public class Exercicio2 {
    /**
     * Método principal que executa o programa.
     * Solicita três números (double), calcula a média e a exibe
     * formatada com duas casas decimais.
     */
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double number1 = scr.nextDouble();

        System.out.println("Digite o segundo número: ");
        double number2 = scr.nextDouble();

        System.out.println("Digite o terceiro número: ");
        double number3 = scr.nextDouble();

        double sum = number1 + number2 + number3;
        double media = sum / 3;

        System.out.printf("A média aritmética é: %.2f%n", media);

        scr.close();
    }
}

import java.util.Scanner;
import java.time.Year;

/**
 * Calcula a idade do usuário com base no ano de nascimento.
 */
public class Exercicio3 {
    /**
     * Método principal que executa o programa.
     * Pede o ano de nascimento, subtrai do ano atual
     * e exibe a idade resultante.
     */
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        // Para tornar o código dinâmico, utilizo o Year.now.getValue() informar o ano atual
        int currentYear = Year.now().getValue();

        System.out.println("Digite o ano do seu nascimento: ");
        int year = scr.nextInt();

        int age = currentYear - year;

        System.out.printf("A sua idade é %s anos", age);

        scr.close();
    }
}

import java.util.Scanner;

/**
 * Converte uma temperatura de graus Celsius para Fahrenheit.
 */
public class Exercicio4 {
    /**
     * Método principal que executa o programa.
     * Pede uma temperatura em Celsius e a converte para Fahrenheit usando a
     * fórmula F = (C * 9/5) + 32.
     */
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        double celsiusTemperature = scr.nextDouble();

        // Usei 9.0 / 5.0 para garantir a divisão de ponto flutuante.
        double fahrenheit = (celsiusTemperature * 9.0 / 5.0) + 32;

        System.out.printf("A temperatura em Fahrenheit é: %.2f Fahrenheits", fahrenheit);

        scr.close();
    }
}


import java.util.Scanner;

/**
 * Realiza as quatro operações matemáticas básicas (soma, subtração,
 * multiplicação e divisão) com dois números inteiros fornecidos pelo usuário.
 */
public class Exercicio5 {
    /**
     * Método principal que executa o programa.
     * Pede dois números inteiros e exibe os resultados das operações.
     * A divisão é tratada como ponto flutuante para maior precisão.
     */
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int number1 = scr.nextInt();

        System.out.println("Digite o segundo número: ");
        int number2 = scr.nextInt();

        int sum = number1 + number2;
        System.out.printf("A soma é: %d%n", sum);

        int sub = number1 - number2;
        System.out.printf("A subtração é: %d%n", sub);

        int mul = number1 * number2;
        System.out.printf("A multiplicação é: %d%n", mul);

        double div = number1 / number2;
        System.out.printf("A divisão é: %.2f%n", div);

        scr.close();
    }
}

import java.util.Scanner;

/**
 * Calcula o tempo estimado de uma viagem, com base na distância
 * (km) e na velocidade média (km/h) informadas pelo usuário.
 */
public class Exercicio6 {

    /**
     * Método principal que executa o programa.
     * Pede a distância e a velocidade média, calcula o tempo de viagem
     * em horas (distancia/velocidade) e o converte para minutos.
     */
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Digite a distância em km: ");
        double km = scr.nextDouble();

        System.out.println("Digite a velocidade média em km/h: ");
        double velocity = scr.nextDouble();


        double time = (km/velocity) * 60;

        System.out.printf("O tempo de viagem em minutos é %.2f", time);

        scr.close();
    }
}

import java.util.Scanner;
import java.lang.Math;

/**
 * Calcula a área e o perímetro (circunferência) de um círculo com base no raio
 * fornecido pelo usuário.
 */
public class Exercicio7 {
    /**
     * Método principal que executa o programa.
     * Solicita o raio de um círculo, calcula a área e o perímetro,
     * e exibe os resultados formatados com duas casas decimais.
     */
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        double radius = scr.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);

        // Cálculo do Perímetro (Circunferência): P = 2 * π * r
        double perimeter = 2 * Math.PI * radius;

        System.out.println("A Área é: " + area);
        System.out.println("O Perímetro é: " + perimeter);

        scr.close();
    }
}