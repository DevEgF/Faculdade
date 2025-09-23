public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculadora Simples");
        System.out.println("Soma: " + somar(5, 3));
        System.out.println("Subtração: " + subtrair(5, 3));
        System.out.println("Multiplicação: " + multiplicar(5, 3));
        System.out.println("Divisão: " + dividir(5, 2));
        System.out.println("Módulo: " + mod(5, 2));
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

    public static int mod(int a, int b) {
        return a % b;
    }
}