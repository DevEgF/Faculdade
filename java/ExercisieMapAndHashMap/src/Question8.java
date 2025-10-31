import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(42);
        numbers.add(7);
        numbers.add(99);
        numbers.add(30);

        System.out.println("Lista de números: " + numbers);

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite o número que você deseja buscar: ");
        int numeroParaBuscar = scanner.nextInt();

        boolean researched = numbers.contains(numeroParaBuscar);

        if (researched) {
            System.out.println("O número " + numeroParaBuscar + " FOI encontrado na lista!");
        } else {
            System.out.println("O número " + numeroParaBuscar + " NÃO foi encontrado na lista.");
        }
    }
}

