public class Question3 {
    public static void main(String[] args) {
        double[] numbers = {7.0, 6.5, 9.0};

        double sum = 0.0;

        for (double num : numbers) {
            sum += num;
        }

        double average = sum / numbers.length;

        System.out.println("Soma dos elementos do array: " + sum);
        System.out.println("Média dos elementos do array: " + average);
    }
}
