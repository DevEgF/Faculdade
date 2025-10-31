import java.util.Arrays;

public class Question12 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sumPairs = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sumPairs = sumPairs + number;
            }
        }

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("A soma dos números pares é: " + sumPairs);
    }
}
