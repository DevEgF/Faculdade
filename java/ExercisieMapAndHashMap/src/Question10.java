import java.util.ArrayList;
import java.util.Collections;

public class Question10 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Maria");
        names.add("João");
        names.add("Ana");
        names.add("Bruno");
        names.add("Carla");
        names.add("Zacarias");
        names.add("Beatriz");

        System.out.println("Lista original: " + names);

        Collections.sort(names);

        System.out.println("\nLista em ordem alfabética:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
