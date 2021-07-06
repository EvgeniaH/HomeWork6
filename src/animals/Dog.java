package animals;

import animals.Animal;

public class Dog extends Animal {
    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIM_LENGTH = 10;

    public Dog(String name, int run, int swim) {
        super(name, run, swim);
    }

    @Override
    public void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("run: true");
        else System.out.println("run: false");
    }

    @Override
    public void swim(int length) {
        if ((length >= 0) && (length <= MAX_SWIM_LENGTH)) System.out.println("run: true");
        else System.out.println("run: false");
    }
}
