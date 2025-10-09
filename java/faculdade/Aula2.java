import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {
        double value = 3.75;

        System.out.println("Original: " + value);
        System.out.println("Arredondamento: " + Math.round(value));
        System.out.println("Para cima: " + Math.ceil(value));
        System.out.println("Para baixo: " + Math.floor(value));

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = scr.nextLine();

        System.out.println("Digite sua idade: ");
        double age = scr.nextDouble();

        System.out.printf("Olá %s, você tem %s", name, age);
    }
}