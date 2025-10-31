import java.util.Scanner;

public class Question18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int QUANTITY_NUMBERS = 10;
        int[] numbers = new int[QUANTITY_NUMBERS];

        System.out.println("Digite 10 números inteiros: ");

        for (int i = 0; i < QUANTITY_NUMBERS; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Número a ser buscado: ");
        int searchNumber = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < QUANTITY_NUMBERS; i++) {
            if (numbers[i] == searchNumber) {
                count++;
            }
        }

        System.out.println("Quantidade de ocorrências: " + count);
    }
}