import java.util.Scanner;

class Question6 {
    public static void main(String[] args) {

        String correctPassword = "senha123";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, insira a senha: ");
        String attempt = scanner.nextLine();

        while (!attempt.equals(correctPassword)) {
            System.out.println("Senha incorreta!");
            System.out.println("Tente novamente: ");

            attempt = scanner.nextLine();
        }

        System.out.println("Acesso permitido!");
    }
}