public class Question5 {
    public static void main(String[] args) {

        int[] numbers = {
                42, 15, 89, 7, 63, 21, 98, 34, 5, 76,
                52, 11, 29, 83, 47, 6, 91, 38, 72, 19,
                55, 88, 3, 67, 25, 94, 13, 41, 60, 33
        };

        int maxValue = numbers[0];
        int minValue = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }

        System.out.println("Maior valor: " + maxValue);
        System.out.println("Menor valor: " + minValue);
    }
}
