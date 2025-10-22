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