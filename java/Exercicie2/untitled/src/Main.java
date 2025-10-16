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
