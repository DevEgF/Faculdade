import java.util.Scanner;

public class Question17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerName;
        int points;
        int totalPlayers = 0;
        int totalPoints = 0;

        String lowestScoringPlayer = "";
        String highestScoringPlayer = "";
        int minPoints = Integer.MAX_VALUE;
        int maxPoints = Integer.MIN_VALUE;

        System.out.println("Cadastro de Jogadores de Basquete da Unifacisa");
        System.out.println("Digite 'sair' como nome para encerrar o cadastro.\n");

        while (true) {
            System.out.print("Nome do jogador: ");
            playerName = scanner.nextLine();

            if (playerName.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Pontuação do jogador: ");
            points = scanner.nextInt();
            scanner.nextLine();

            totalPlayers++;
            totalPoints += points;

            if (points <= minPoints) {
                minPoints = points;
                lowestScoringPlayer = playerName;
            }

            if (points >= maxPoints) {
                maxPoints = points;
                highestScoringPlayer = playerName;
            }

            System.out.println();
        }


        if (totalPlayers == 0) {
            System.out.println("Nenhum jogador foi registrado.");
        } else {
            double averagePoints = (double) totalPoints / totalPlayers;

            System.out.println("\n--- Relatório Final ---");
            System.out.println("Jogador com menor pontuação: " + lowestScoringPlayer + " (" + minPoints + " pontos)");
            System.out.println("Jogador com maior pontuação: " + highestScoringPlayer + " (" + maxPoints + " pontos)");
            System.out.printf("Média de pontos: %.2f%n", averagePoints);
        }
    }
}
