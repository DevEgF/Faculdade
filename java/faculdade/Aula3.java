import java.util.Scanner;

class Aula3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota = teclado.nextDouble();

        //If
        if(nota >= 9.0) {
            System.out.println("Aprovado com excelencia");
        } else if (nota >= 60) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        //Switch
        int dia = teclado.nextInt();

        switch(dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Ter");
                break;
            default:
                System.out.println("Dia invalido");
        }


        //while
        int i = 1;
        while (i <= 5) {
            System.out.println("Valor de i: " + i);
            i++;
        }


        //While If
        int x = 1;
        while (x <= 5) {
            System.out.println("Valor de i: " + x);
            x++;

            if(x >= 5){
                break;
            }
        }

        //Do While
        int y = 1;
        do {
            System.out.println("Valor de y:" + y);
            y++;
        } while (y <= 5);

        //for
        for (int z = 1; i <= 5; i++) {
            System.out.println("Valor de z: " + z);
        }

        for(int d = 100; d >= 0; i--) {
            if(d%2 == 0) {

            }
        }
    }
}