import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int TOTAL_PERSONS = 10;

        int contHomens = 0;
        int contMulheres = 0;
        double somaSalarioHomens = 0.0;
        double somaSalarioTotal = 0.0;

        double maiorSalario = 0.0;
        char sexoMaiorSalario = ' ';

        for (int i = 0; i < TOTAL_PERSONS; i++) {

            char sexo = sc.next().toLowerCase().charAt(0);

            double salario = sc.nextDouble();

            somaSalarioTotal += salario;

            if (sexo == 'm') {
                contHomens++;
                somaSalarioHomens += salario;
            } else {
                contMulheres++;
            }

            if (salario > maiorSalario) {
                maiorSalario = salario;
                sexoMaiorSalario = sexo;
            }
        }


        double mediaSalarioTotal = somaSalarioTotal / TOTAL_PERSONS;

        double mediaSalarioHomens = 0.0;
        if (contHomens > 0) {
            mediaSalarioHomens = somaSalarioHomens / contHomens;
        }

        System.out.println(contHomens);

        System.out.println(contMulheres);

        System.out.printf("%.1f\n", mediaSalarioTotal);


        System.out.println(sexoMaiorSalario);

        System.out.printf("%.1f\n", mediaSalarioHomens);
    }
}
