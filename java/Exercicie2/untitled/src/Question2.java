import java.util.Scanner;

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