import java.util.ArrayList;

public class CatRunner {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        Cat mona = new Cat("Mona");
        Cat chloe = new Cat("Chloe");
        Cat bob = new Cat("Bob");

        System.out.println(cats);

        Cat cat4 = new Cat("Bunger");
        Cat kickedOutCat = cats.get(2);
        cats.set(2, cat4);
        cat4.setName(cat4.getName() + " Meow");

        System.out.println(cat4);
        System.out.println(cats);

        for (int i = 0; i < cats.size(); i++) {
            cats.get(i).setName(cats.get(i).getName().toUpperCase());
        }

        System.out.println(cats);

        cats.add(new Cat("SAM"));
        System.out.println(cats);
    }

}
