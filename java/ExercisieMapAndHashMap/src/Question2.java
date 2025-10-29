import java.util.ArrayList;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> dynamicList = new ArrayList<>();

        System.out.println("Digite novos elementos para serem adicionados ao array: ");

        String input;

        while (true) {
            System.out.print("Digite um novo elemento: ");
            input = scanner.nextLine();

            if (dynamicList.size() == 5) {
                break;
            }
            dynamicList.add(input);
        }

        for(String list: dynamicList) {
            System.out.println(list);
        }
    }
}
