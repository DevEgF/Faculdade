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