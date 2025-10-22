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