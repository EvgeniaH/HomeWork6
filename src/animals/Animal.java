package animals;

public class Animal {
    String name;
    protected int run;
    protected int swim;


    public Animal(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }


    public void info() {
        System.out.printf(name + " run " + run + "m" + " swim " + swim + "m ");
    }

    public void run(int meter) {
        System.out.println(name + " run " + run + "m");
    }

    public void swim(int meter) {
        System.out.println(name + " swim " + swim + "m");
    }

}
