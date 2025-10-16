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

import java.util.Scanner;

class Question8 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um valor inteiro em reais (entre 1 e 1000): R$ ");
        int valor = teclado.nextInt();

        if (valor < 1 || valor > 1000) {
            System.out.println("Valor inválido! Por favor, insira um valor entre 1 e 1000.");
        } else {
            System.out.println("Para sacar R$ " + valor + ",00, você precisará de:");

            int resto = valor;

            int notas100 = resto / 100;
            if (notas100 > 0) {
                System.out.println(notas100 + " nota(s) de R$ 100");
                resto = resto % 100;
            }

            int notas50 = resto / 50;
            if (notas50 > 0) {
                System.out.println(notas50 + " nota(s) de R$ 50");
                resto = resto % 50;
            }

            int notas20 = resto / 20;
            if (notas20 > 0) {
                System.out.println(notas20 + " nota(s) de R$ 20");
                resto = resto % 20;
            }

            int notas10 = resto / 10;
            if (notas10 > 0) {
                System.out.println(notas10 + " nota(s) de R$ 10");
                resto = resto % 10;
            }

            int notas5 = resto / 5;
            if (notas5 > 0) {
                System.out.println(notas5 + " nota(s) de R$ 5");
                resto = resto % 5;
            }
            int notas2 = resto / 2;
            if (notas2 > 0) {
                System.out.println(notas2 + " nota(s) de R$ 2");
                resto = resto % 2;
            }

            if (resto > 0) {
                System.out.println("e sobrará R$ " + resto + ",00 (que seriam moedas de R$ 1).");
            }
        }
    }
}