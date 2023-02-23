package domain;

public class Animal {

    protected String name;

    protected int weight;

    protected int height;

    public Animal() {
        name="generic animal";
        weight=40;
    }

    public void eat() {
        System.out.println ("Animal eating...");
    }

    public void speak() {
        System.out.println("Animal speaking");
    }

    @Override
    public String toString() {
        return "Animal:" + "\nName:\t" + name + "\nWeight:\t" + weight + "kg" + "\nHeight:\t" + height + "cm";
    }

    
}
