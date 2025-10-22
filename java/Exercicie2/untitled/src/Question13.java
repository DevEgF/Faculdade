import java.util.Scanner;

public class Question13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua temperatura em graus Celsius: ");

        if (!scanner.hasNextDouble()) {
            System.out.println("\nEntrada inválida. Por favor, digite um valor numérico para a temperatura.");
            return;
        }
        double temperature = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Está com secreção nasal? (S/N): ");
        String nasalSecretion = scanner.nextLine().toUpperCase().trim();

        System.out.print("Está com tosse? (S/N): ");
        String cough = scanner.nextLine().toUpperCase().trim();

        System.out.print("Está com dor no corpo? (S/N): ");
        String bodyAche = scanner.nextLine().toUpperCase().trim();

        if ((!nasalSecretion.equals("S") && !nasalSecretion.equals("N")) ||
                (!cough.equals("S") && !cough.equals("N")) ||
                (!bodyAche.equals("S") && !bodyAche.equals("N"))) {

            System.out.println("\nEntrada inválida. Por favor, responda apenas com 'S' ou 'N'.");
            return;
        }

        boolean allSymptomsYes = nasalSecretion.equals("S") && cough.equals("S") && bodyAche.equals("S");
        boolean allSymptomsNo = nasalSecretion.equals("N") && cough.equals("N") && bodyAche.equals("N");

        if (temperature >= 37.0) {
            if (allSymptomsYes) {
                System.out.println("\nResultado: Exames Especiais");
            } else if (allSymptomsNo) {
                System.out.println("\nResultado: Exames Básicos");
            }

        } else {
            if (allSymptomsNo) {
                System.out.println("\nResultado: Liberado");
            } else {
                System.out.println("\nResultado: Exames Básicos");
            }
        }
    }
}