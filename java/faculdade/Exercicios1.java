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

mport java.util.Scanner;

public class Exercicie8 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite um valor em dolar: ");
        double valueUS = scr.nextDouble();

        double valueBRL = 5.10;

        double convertedValue = valueUS * valueBRL;

        System.out.printf("O valor equivalente em reais é %.2f", convertedValue);

    }
}

//9. Cálculo do IMC
//Peça o peso e a altura, calcule o IMC e exiba com duas casas decimais.
//Fórmula: IMC = peso / (altura * altura)

import java.util.Scanner;

public class Exercicie9 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite seu peso em kg: ");
        double weight = scr.nextDouble();

        System.out.println("Digite sua altura em metros: ");
        double height = scr.nextDouble();

        double imc = weight / Math.pow(height,2);

        System.out.printf("Seu IMC é %.2f", imc);
    }
}
//10. Área de um Retângulo
//Peça a base e a altura e calcule:
//Área = base × altura

import java.util.Scanner;

public class Exercicie10 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite o valor da base do retângulo em cm: ");
        double base = scr.nextDouble();

        System.out.println("Digite o valor da altura do retângulo em cm: ");
        double height = scr.nextDouble();

        double area = base * height;

        System.out.printf("A área do retângulo é %.2f", area);
    }
}

//11. Idade em Segundos
//Leia a idade da pessoa e mostre quantos segundos ela viveu.
//Considere:
//• 1 ano = 365 dias
//• 1 dia = 86400 segundos

import java.util.Scanner;

public class Exercicie11 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int year = scr.nextInt();

        int yearsInMonths = year * 12;

        int yearsPerSecond = year * 86400;

        System.out.printf("Você viveu exatos %s meses \n", yearsInMonths);
        System.out.printf("Você viveu exatos %s segundos \n", yearsPerSecond);
    }
}

//12. Teorema de Pitágoras
//Peça os valores dos catetos a e b, e calcule a hipotenusa:
//hipotenusa = √(a² + b²)
//Use Math.sqrt() e System.out.printf() com 2 casas decimais.

import java.util.Scanner;

public class Exercicie12 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        double a = scr.nextDouble();

        System.out.println("Digite o volar de b: ");
        double b = scr.nextDouble();

        double aPow = Math.pow(a, 2);
        double bPow = Math.pow(b, 2);

        double sumAB = aPow + bPow;

        double hypotenuse = Math.sqrt(sumAB);

        System.out.printf("O valor da hipotenusa é: %.2f", hypotenuse);
    }
}

//13. Volume de uma Esfera
//Peça o raio (entre 1.0 e 50.0) e calcule o volume:
//V = (4/3) × π × r³
//Use π = 3.14 e arredonde com 2 casas decimais.

import java.util.Scanner;

public class Exercicie13 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite o raio da esfera (entre 1.0 e 50.0): ");
        double raio = scr.nextDouble();

        double PI = 3.14;

        double volume = (4.0/3.0) * PI * Math.pow(raio, 3);

        System.out.printf("O raio da esfera é %.2f", volume);
    }
}

//14. Conversão de Minutos em Horas e Minutos
//Solicite uma quantidade de minutos e converta para horas e minutos.

import java.util.Scanner;

public class Exercicie14 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos: ");
        int totalMinutos = scr.nextInt();

        int horas = totalMinutos / 60;
        int minutos = totalMinutos % 60;


        System.out.printf("%d minutos -> %d horas e %d minutos\n", totalMinutos, horas, minutos);
    }
}

//15. Custo de uma Refeição com Taxa de Serviço
//Peça o valor da refeição (em reais).
//Calcule o total com taxa de serviço de 10% e exiba com duas casas decimais.

import java.util.Scanner;

public class Exercicie15 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.print("Digite o valor da refeição em reais: R$ ");
        double snackValue = scr.nextDouble();

        double service = 1.10;

        double snackService = snackValue * service;


        System.out.printf("O valor total da refeição é: %.2f", snackService);
    }
}