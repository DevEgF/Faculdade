import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a escala de temperatura (C, F ou K): ");
        char scale = scanner.next().toUpperCase().charAt(0);

        System.out.print("Digite o valor da temperatura: ");
        double temperature = scanner.nextDouble();

        double celsius, fahrenheit, kelvin;

        System.out.println("\n--- RESULTADO ---");

        switch (scale) {
            case 'C':
                celsius = temperature;
                fahrenheit = (celsius * 9.0 / 5.0) + 32;
                kelvin = celsius + 273.15;

                System.out.printf("%.2f °C equivale a:\n", celsius);
                System.out.printf("%.2f °F\n", fahrenheit);
                System.out.printf("%.2f K\n", kelvin);
                break;

            case 'F':
                fahrenheit = temperature;
                celsius = (fahrenheit - 32) * 5.0 / 9.0;
                kelvin = celsius + 273.15;

                System.out.printf("%.2f °F equivale a:\n", fahrenheit);
                System.out.printf("%.2f °C\n", celsius);
                System.out.printf("%.2f K\n", kelvin);
                break;

            case 'K':
                kelvin = temperature;
                celsius = kelvin - 273.15;
                fahrenheit = (celsius * 9.0 / 5.0) + 32;

                System.out.printf("%.2f K equivale a:\n", kelvin);
                System.out.printf("%.2f °C\n", celsius);
                System.out.printf("%.2f °F\n", fahrenheit);
                break;

            default:
                System.out.println("Escala inválida! Por favor, use C, F ou K.");
                break;
        }
    }
}