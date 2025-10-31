import java.util.Scanner;

public class Question16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int DAYS_PER_WEEK = 7;
        final int DAILY_GOAL = 100;

        int daysGoalAchieved = 0;
        int totalDeliveries = 0;

        System.out.println("--- Controle de Entregas de São João ---");
        System.out.println("Meta diária: " + DAILY_GOAL + " correspondências.");

        for (int day = 1; day <= DAYS_PER_WEEK; day++) {

            System.out.print("Entregas do dia " + day + ": ");

            int dailyDeliveries = sc.nextInt();

            totalDeliveries += dailyDeliveries;

            if (dailyDeliveries >= DAILY_GOAL) {
                daysGoalAchieved++;
            }
        }

        double averageDeliveries = (double) totalDeliveries / DAYS_PER_WEEK;

        System.out.println("\n--- Relatório Semanal ---");

        System.out.println("Dias que bateu a meta: " + daysGoalAchieved);

        System.out.printf("Média de entregas: %.2f%n", averageDeliveries);
    }
}
