public class Question9 {
    public static void main(String[] args) {

        int[] numbers = {10, 75, 20, 50, 89, 42, 51, 9, 100};

        int counter = 0;

       for (int number : numbers) {
            if (number > 50) {
                counter++;
            }
        }

        System.out.println("Array original: ");
        System.out.println(java.util.Arrays.toString(numbers));

        System.out.println("\nTotal de números maiores que 50: " + counter);
    }
}
