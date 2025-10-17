import java.util.Random;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int age = teclado.nextInt();

        if (age <= 12) {
            System.out.println("Você é uma criança");
        } else if (age <= 17) {
            System.out.println("Você é um adolescente");
        } else if (age <= 59) {
            System.out.println("Você é um adulto");
        } else {
            System.out.println("Você é um idoso");
        }
    }
}

public class Question2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = leitor.nextInt();


        if(numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é igual a zero.");
        }
    }
}


public class Question3 {
    public static void main(String[] args) {
        for(int i = 1; i <= 50; i++) {
            System.out.println("O valor de i" + i);
        }
    }
}

import java.util.Random;
import java.util.Scanner;

class Question4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;

        int number = 0;

        System.out.println("Eu sorteei um número entre 1 e 100. Tente adivinhar!");

        do {
            System.out.print("Digite seu palpite: ");
            number = teclado.nextInt();

            if (number < randomNumber) {
                System.out.println("O número que eu pensei é MAIOR.");
            } else if (number > randomNumber) {
                System.out.println("O número que eu pensei é MENOR.");
            }

        } while (number != randomNumber);

        System.out.println("Parabéns! Você acertou! O número era " + randomNumber + ".");
    }
}

class Question5 {
    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++) {
            if(i%2 == 0) {
                System.out.println("O número é" + i);
            }
        }
    }
}

import java.util.Scanner;

class Question6 {
    public static void main(String[] args) {

        String senhaCorreta = "senha123";

        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, insira a senha: ");
        String tentativa = teclado.nextLine();

        while (!tentativa.equals(senhaCorreta)) {
            System.out.println("Senha incorreta!");
            System.out.println("Tente novamente: ");

            tentativa = teclado.nextLine();
        }

        System.out.println("Acesso permitido!");
    }
}

class Question7 {
    public static void main(String[] args) {
        for(int i = 10; i >= 0; i-- ) {
            System.out.println(i);
        }
    }
}

import java.util.Scanner;

class Question8 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um valor inteiro em reais (entre 1 e 1000): R$ ");
        int valor = teclado.nextInt();

        if (valor < 1 || valor > 1000) {
            System.out.println("Valor inválido! Por favor, insira um valor entre 1 e 1000.");
        } else {
            System.out.println("\nPara sacar R$ " + valor + ",00, você precisará de:");

            int resto = valor;

            int notas100 = resto / 100;
            resto %= 100;

            int notas50 = resto / 50;
            resto %= 50;

            int notas20 = resto / 20;
            resto %= 20;

            int notas10 = 0;
            int notas5 = 0;
            int notas2 = 0;

            if (resto == 1 || resto == 3) {
                // Para esses casos, a solução anterior com as notas altas é a única possível,
                // então o resto será a sobra final.
            } else {
                while (resto > 0 && resto % 5 != 0) {
                    resto -= 2;
                    notas2++;
                }
            }

            notas10 = resto / 10;
            resto %= 10;

            notas5 = resto / 5;
            resto %= 5;

            int sobraFinal = resto;


            if (notas100 > 0) System.out.println(notas100 + " nota(s) de R$ 100");
            if (notas50 > 0) System.out.println(notas50 + " nota(s) de R$ 50");
            if (notas20 > 0) System.out.println(notas20 + " nota(s) de R$ 20");
            if (notas10 > 0) System.out.println(notas10 + " nota(s) de R$ 10");
            if (notas5 > 0) System.out.println(notas5 + " nota(s) de R$ 5");
            if (notas2 > 0) System.out.println(notas2 + " nota(s) de R$ 2");
            if (sobraFinal > 0) System.out.println("e sobrará R$ " + sobraFinal + ",00");
        }
    }
}

class Question9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        int numero = teclado.nextInt();

        while(numero >= 1) {

        }
    }
}

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        // Usar Locale.US para garantir que o ponto decimal seja lido corretamente
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a escala de temperatura (C, F ou K): ");
        // Lê a primeira letra da entrada e a converte para maiúscula
        char escala = teclado.next().toUpperCase().charAt(0);

        System.out.print("Digite o valor da temperatura: ");
        double temperatura = teclado.nextDouble();

        double celsius, fahrenheit, kelvin;

        System.out.println("\n--- RESULTADO ---");

        switch (escala) {
            case 'C':
                celsius = temperatura;
                // Fórmula de Celsius para Fahrenheit: F = (C * 9/5) + 32
                fahrenheit = (celsius * 9.0 / 5.0) + 32;
                // Fórmula de Celsius para Kelvin: K = C + 273.15
                kelvin = celsius + 273.15;

                System.out.printf("%.2f °C equivale a:\n", celsius);
                System.out.printf("%.2f °F\n", fahrenheit);
                System.out.printf("%.2f K\n", kelvin);
                break;

            case 'F':
                fahrenheit = temperatura;
                // Fórmula de Fahrenheit para Celsius: C = (F - 32) * 5/9
                celsius = (fahrenheit - 32) * 5.0 / 9.0;
                // Calcula Kelvin a partir do valor em Celsius
                kelvin = celsius + 273.15;

                System.out.printf("%.2f °F equivale a:\n", fahrenheit);
                System.out.printf("%.2f °C\n", celsius);
                System.out.printf("%.2f K\n", kelvin);
                break;

            case 'K':
                kelvin = temperatura;
                // Fórmula de Kelvin para Celsius: C = K - 273.15
                celsius = kelvin - 273.15;
                // Calcula Fahrenheit a partir do valor em Celsius
                fahrenheit = (celsius * 9.0 / 5.0) + 32;

                System.out.printf("%.2f K equivale a:\n", kelvin);
                System.out.printf("%.2f °C\n", celsius);
                System.out.printf("%.2f °F\n", fahrenheit);
                break;

            default:
                System.out.println("Escala inválida! Por favor, use C, F ou K.");
                break;
        }
    }
}

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do pH da solução (ex: 7.0): ");

        double ph = teclado.nextDouble();

        if (ph < 7.0) {
            System.out.println("A solução é Ácida.");
        } else if (ph == 7.0) {
            System.out.println("A solução é Neutra.");
        } else {
            System.out.println("A solução é Básica.");
        }
    }
}

import java.util.Scanner;
import java.util.Locale;

public class Quesiton12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- CÁLCULO DE MÉDIA ACADÊMICA ---");
        System.out.print("Digite a primeira nota (0 a 100): ");
        double nota1 = teclado.nextDouble();

        System.out.print("Digite a segunda nota (0 a 100): ");
        double nota2 = teclado.nextDouble();

        System.out.print("Digite a terceira nota (0 a 100): ");
        double nota3 = teclado.nextDouble();

        if (nota1 < 0 || nota1 > 100 || nota2 < 0 || nota2 > 100 || nota3 < 0 || nota3 > 100) {
            System.out.println("\nErro: Uma ou mais notas estão fora do intervalo válido (0 a 100).");
        } else {
            double media = (nota1 + nota2 + nota3) / 3.0;

            System.out.printf("\nA sua média final é: %.2f\n", media);
            System.out.print("Situação: ");

            if (media >= 70 && media <= 100) {
                System.out.println("Aprovado");
            } else if (media >= 40 && media < 70) {
                System.out.println("Final");
            } else if (media >= 0 && media < 40) {
                System.out.println("Reprovado");
            } else {
                System.out.println("Média inválida");
            }
        }
    }
}