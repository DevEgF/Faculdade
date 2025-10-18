import java.util.Random;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int age = scanner.nextInt();

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

        Scanner reader = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int number = reader.nextInt();


        if(number > 0) {
            System.out.println("O número é positivo.");
        } else if (number < 0) {
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

        Scanner scanner = new Scanner(System.in);

        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;

        int number = 0;

        System.out.println("Eu sorteei um número entre 1 e 100. Tente adivinhar!");

        do {
            System.out.print("Digite seu palpite: ");
            number = scanner.nextInt();

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

        String correctPassword = "senha123";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, insira a senha: ");
        String attempt = scanner.nextLine();

        while (!attempt.equals(correctPassword)) {
            System.out.println("Senha incorreta!");
            System.out.println("Tente novamente: ");

            attempt = scanner.nextLine();
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

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro em reais (entre 1 e 1000): R$ ");
        int value = scanner.nextInt();

        if (value < 1 || value > 1000) {
            System.out.println("Valor inválido! Por favor, insira um valor entre 1 e 1000.");
        } else {
            System.out.println("\nPara sacar R$ " + value + ",00, você precisará de:");

            int remainder = value;

            int notes100 = remainder / 100;
            remainder %= 100;

            int notes50 = remainder / 50;
            remainder %= 50;

            int notes20 = remainder / 20;
            remainder %= 20;

            int notes10 = 0;
            int notes5 = 0;
            int notes2 = 0;

            if (remainder == 1 || remainder == 3) {
            } else {
                while (remainder > 0 && remainder % 5 != 0) {
                    remainder -= 2;
                    notes2++;
                }
            }

            notes10 = remainder / 10;
            remainder %= 10;

            notes5 = remainder / 5;
            remainder %= 5;

            int finalRemainder = remainder;


            if (notes100 > 0) System.out.println(notes100 + " nota(s) de R$ 100");
            if (notes50 > 0) System.out.println(notes50 + " nota(s) de R$ 50");
            if (notes20 > 0) System.out.println(notes20 + " nota(s) de R$ 20");
            if (notes10 > 0) System.out.println(notes10 + " nota(s) de R$ 10");
            if (notes5 > 0) System.out.println(notes5 + " nota(s) de R$ 5");
            if (notes2 > 0) System.out.println(notes2 + " nota(s) de R$ 2");
            if (finalRemainder > 0) System.out.println("e sobrará R$ " + finalRemainder + ",00");
        }
    }
}

class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        int number = scanner.nextInt();

        while(number >= 1) {

        }
    }
}

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a escala de temperatura (C, F ou K): ");
        char scale = scanner.next().toUpperCase().charAt(0);

        System.out.print("Digite o valor da temperatura: ");
        double temperature = scanner.nextDouble();

        double celsius, fahrenheit, kelvin;

        System.out.println("\n--- RESULTADO ---");

        switch (scale) {
            case 'C':
                celsius = temperature;
                fahrenheit = (celsius * 9.0 / 5.0) + 32;
                kelvin = celsius + 273.15;

                System.out.printf("%.2f °C equivale a:\n", celsius);
                System.out.printf("%.2f °F\n", fahrenheit);
                System.out.printf("%.2f K\n", kelvin);
                break;

            case 'F':
                fahrenheit = temperature;
                celsius = (fahrenheit - 32) * 5.0 / 9.0;
                kelvin = celsius + 273.15;

                System.out.printf("%.2f °F equivale a:\n", fahrenheit);
                System.out.printf("%.2f °C\n", celsius);
                System.out.printf("%.2f K\n", kelvin);
                break;

            case 'K':
                kelvin = temperature;
                celsius = kelvin - 273.15;
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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do pH da solução (ex: 7.0): ");

        double ph = scanner.nextDouble();

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

public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota (0 a 100): ");
        double grade1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota (0 a 100): ");
        double grade2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota (0 a 100): ");
        double grade3 = scanner.nextDouble();

        if (grade1 < 0 || grade1 > 100 || grade2 < 0 || grade2 > 100 || grade3 < 0 || grade3 > 100) {
            System.out.println("Erro: Uma ou mais notas estão fora do intervalo válido (0 a 100).");
        } else {
            double average = (grade1 + grade2 + grade3) / 3.0;

            System.out.printf("\nA sua média final é: %.2f\n", average);
            System.out.print("Situação: ");

            if (average >= 70 && average <= 100) {
                System.out.println("Aprovado");
            } else if (average >= 40 && average < 70) {
                System.out.println("Final");
            } else if (average >= 0 && average < 40) {
                System.out.println("Reprovado");
            } else {
                System.out.println("Média inválida");
            }
        }
    }
}

import java.util.Scanner;

public class Question13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua temperatura em graus Celsius: ");

        if (!scanner.hasNextDouble()) {
            System.out.println("\nEntrada inválida. Por favor, digite um valor numérico para a temperatura.");
            return;
        }
        double temperature = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Está com secreção nasal? (S/N): ");
        String nasalSecretion = scanner.nextLine().toUpperCase().trim();

        System.out.print("Está com tosse? (S/N): ");
        String cough = scanner.nextLine().toUpperCase().trim();

        System.out.print("Está com dor no corpo? (S/N): ");
        String bodyAche = scanner.nextLine().toUpperCase().trim();

        if ((!nasalSecretion.equals("S") && !nasalSecretion.equals("N")) ||
                (!cough.equals("S") && !cough.equals("N")) ||
                (!bodyAche.equals("S") && !bodyAche.equals("N"))) {

            System.out.println("\nEntrada inválida. Por favor, responda apenas com 'S' ou 'N'.");
            return;
        }

        boolean allSymptomsYes = nasalSecretion.equals("S") && cough.equals("S") && bodyAche.equals("S");
        boolean allSymptomsNo = nasalSecretion.equals("N") && cough.equals("N") && bodyAche.equals("N");

        if (temperature >= 37.0) {
            if (allSymptomsYes) {
                System.out.println("\nResultado: Exames Especiais");
            } else if (allSymptomsNo) {
                System.out.println("\nResultado: Exames Básicos");
            }

        } else {
            if (allSymptomsNo) {
                System.out.println("\nResultado: Liberado");
            } else {
                System.out.println("\nResultado: Exames Básicos");
            }
        }
    }
}

import java.util.Scanner;

public class Question14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano da primeira dose da vacina: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um ano válido.");
            return;
        }
        int firstDoseYear = scanner.nextInt();

        System.out.print("Digite o intervalo de anos entre as doses (periodicidade): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro para o intervalo.");
            return;
        }
        int yearInterval = scanner.nextInt();

        System.out.println("\n--- Calendário de Vacinação ---");


        for (int i = 0; i < 4; i++) {

            int doseYear = firstDoseYear + (i * yearInterval);

            System.out.println((i + 1) + "ª dose: " + doseYear);
        }
    }
}

import java.util.Scanner;

public class Question15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas moedas de R$ 0,25 você tem? ");
        int coins25 = scanner.nextInt();

        System.out.println("Quantas moedas de R$ 0,50 você tem? ");
        int coins50 = scanner.nextInt();

        System.out.println("Quantas moedas de R$ 1,00 você tem? ");
        int coins100 = scanner.nextInt();

        double totalFrom25 = coins25 * 0.25;
        double totalFrom50 = coins50 * 0.50;
        double totalFrom100 = coins100 * 1.00;

        double totalValue = totalFrom25 + totalFrom50 + totalFrom100;

        System.out.printf("O valor total economizado é: R$ %.2f\n", totalValue);
    }
}