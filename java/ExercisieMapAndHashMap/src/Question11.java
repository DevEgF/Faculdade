import java.util.ArrayList;

public class Question11 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("Bruno");
        names.add("Amanda");
        names.add("Carlos");
        names.add("Antônio");
        names.add("alice");

        System.out.println("Nomes que começam com a letra 'A':");

        for (String name : names) {

            if (name.startsWith("A")) {
                System.out.println(name);
            }
        }
    }
}
