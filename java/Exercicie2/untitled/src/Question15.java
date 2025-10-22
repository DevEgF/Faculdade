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