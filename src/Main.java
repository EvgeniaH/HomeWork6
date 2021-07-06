import animals.Cat;
import animals.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Nik", 200, 0);

        cat.info();
        cat.run(200);
        cat.swim(8);

        Dog dog = new Dog("Sharik", 150, 10);

        dog.info();
        dog.run(502);
        dog.swim(15);

    }
}

