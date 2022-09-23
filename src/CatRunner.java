public class CatRunner {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Turtle", 10, 5);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Fish", 5, 1);
        cat2.introduce();
        cat2.printCatInfo();

    }
}
