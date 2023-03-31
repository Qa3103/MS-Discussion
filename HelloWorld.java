import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Celia");
        list.add("Le Yi");
        list.add("Grace");
        list.add("Jena");
        list.add("Lina");

        Random randomizer = new Random();
        String random = list.get(randomizer.nextInt(list.size()));

        String name = random;
        printSomething(name);
        // System.out.println("Hello, World!");

    }

    public static void printSomething(String name) {

        System.out.println(name);

    }
}