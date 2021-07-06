package animals;

import animals.Animal;

public class Cat extends Animal {

    private final int MAX_RUN_LENGTH = 200;

    public Cat(String name, int run, int swim) {

        super(name, run, swim);
    }


    @Override
    public void run(int length) {
        if ((length <= 200) && (length >= run)) System.out.println("run: true");
        else System.out.println("run: false");
    }

    @Override
    public void swim(int length) {
        System.out.println("swim: false");
    }
}
