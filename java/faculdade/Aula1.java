public class Aula1 {
    public static void main(String[] args) {
        int age = 33;
        double heigh = 1.75;
        char gender = 'M';
        boolean approved = true;

        System.out.println(age);
        System.out.println(heigh);
        System.out.println(gender);
        System.out.println(approved);

        System.out.printf("Age: %s | Heigh: %.2f | Gender: %s | Approved: %s \n", age, heigh, gender, approved);

        int a = 10, b = 20;

        boolean result = (a < b) && (b > 15);
        System.out.println(result);


        // Classe Math
        double raiz = Math.sqrt(25);
        double potencia = Math.pow(2, 3);
        double abs = Math.abs(-10);
        double senp = Math.sin(Math.PI/2);

        System.out.printf("A raiz de 25 é: %.2f \n", raiz);
        System.out.printf("2 elevado a 3 é: %.2f \n", potencia);
        System.out.printf("Valor absoluto: %.2f \n", abs);
        System.out.printf("Seno de 90 é: %.2f \n", senp);
    }
}