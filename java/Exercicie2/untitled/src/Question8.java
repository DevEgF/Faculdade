import java.util.Scanner;

class Question8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro em reais (entre 1 e 1000): R$ ");
        int value = scanner.nextInt();

        if (value < 1 || value > 1000) {
            System.out.println("Valor inválido! Por favor, insira um valor entre 1 e 1000.");
        } else {
            System.out.println("\nPara sacar R$ " + value + ",00, você precisará de:");

            int remainder = value;

            int notes100 = remainder / 100;
            remainder %= 100;

            int notes50 = remainder / 50;
            remainder %= 50;

            int notes20 = remainder / 20;
            remainder %= 20;

            int notes10 = 0;
            int notes5 = 0;
            int notes2 = 0;

            if (remainder == 1 || remainder == 3) {
            } else {
                while (remainder > 0 && remainder % 5 != 0) {
                    remainder -= 2;
                    notes2++;
                }
            }

            notes10 = remainder / 10;
            remainder %= 10;

            notes5 = remainder / 5;
            remainder %= 5;

            int finalRemainder = remainder;


            if (notes100 > 0) System.out.println(notes100 + " nota(s) de R$ 100");
            if (notes50 > 0) System.out.println(notes50 + " nota(s) de R$ 50");
            if (notes20 > 0) System.out.println(notes20 + " nota(s) de R$ 20");
            if (notes10 > 0) System.out.println(notes10 + " nota(s) de R$ 10");
            if (notes5 > 0) System.out.println(notes5 + " nota(s) de R$ 5");
            if (notes2 > 0) System.out.println(notes2 + " nota(s) de R$ 2");
            if (finalRemainder > 0) System.out.println("e sobrará R$ " + finalRemainder + ",00");
        }
    }
}