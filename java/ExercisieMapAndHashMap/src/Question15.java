import java.util.Scanner;

public class Question15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int DAYS_WEEK = 7;
        final double META_ADDITION = 0.50;

        double totalSaved = 0.0;
        int daysGoalCompletion = 0;
        double previousDayValue = 0.0;

        System.out.println("--- Economia Semanal de Poliana ---");

        for (int day = 1; day <= DAYS_WEEK; day++) {

            System.out.print("Digite o valor do dia " + day + ": ");

            double currentDayValue = sc.nextDouble();

            totalSaved += currentDayValue;

            if (day > 1) {
                if (currentDayValue >= (previousDayValue + META_ADDITION)) {
                    daysGoalCompletion++;
                }
            }

            previousDayValue = currentDayValue;
        }

        System.out.println("\n--- Resultado ---");

        System.out.printf("R$ %.2f\n", totalSaved);

        System.out.println("ias em que a meta foi cumprida "+ daysGoalCompletion);
    }
}