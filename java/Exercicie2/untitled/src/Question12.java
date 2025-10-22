import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota (0 a 100): ");
        double grade1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota (0 a 100): ");
        double grade2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota (0 a 100): ");
        double grade3 = scanner.nextDouble();

        if (grade1 < 0 || grade1 > 100 || grade2 < 0 || grade2 > 100 || grade3 < 0 || grade3 > 100) {
            System.out.println("Erro: Uma ou mais notas estão fora do intervalo válido (0 a 100).");
        } else {
            double average = (grade1 + grade2 + grade3) / 3.0;

            System.out.printf("\nA sua média final é: %.2f\n", average);
            System.out.print("Situação: ");

            if (average >= 70 && average <= 100) {
                System.out.println("Aprovado");
            } else if (average >= 40 && average < 70) {
                System.out.println("Final");
            } else if (average >= 0 && average < 40) {
                System.out.println("Reprovado");
            } else {
                System.out.println("Média inválida");
            }
        }
    }
}