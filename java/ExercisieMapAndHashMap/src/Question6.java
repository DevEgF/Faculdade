import java.util.ArrayList;
import java.util.List;

public class Question6 {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Maçã");
        fruits.add("Banana");
        fruits.add("Laranja");
        fruits.add("Uva");

        System.out.println("Lista original: " + fruits);

        fruits.remove("Banana");

        System.out.println("Lista após remoção: " + fruits);
    }
}
