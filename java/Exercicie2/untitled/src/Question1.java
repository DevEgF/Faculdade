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