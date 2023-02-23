package domain;

public class Penguin extends Predator {

    private String specie;

    public Penguin(String name, int weight, int height, String specie) {
        this.name=name;
        this.weight=weight;
        this.height=height;
        this.specie=specie;
    }

    public Penguin() {
        this("GigaChad", 50, 130,"Emperor penguin");
    }

    public Penguin(String name) {
        this(name,50,130,"Emperor penguin");
    }
    
   

    public void swim() {
        System.out.println("Penguin really like swimming");
    }

    @Override
    public void hunt() {
        System.out.println("Penguin really well hunting for fish");
    }

    @Override
    public String toString() {
        return super.toString()+"\nSpecie:\t"+this.specie+"\n\nThis is Penguin";
    }

    @Override
    public void speak() {
        System.out.println("Squack squack!");
    }

    @Override
    public void eat() {
        System.out.println("Penguin eats krill, squids and fishes");
    }
    
    
}
