package domain;


 /**
 * The class Penguin extends predator
 */ 
public class Penguin extends Predator {

    private String specie;


/** 
 *
 * Penguin
 *
 * @param name  the name
 * @param weight  the weight
 * @param height  the height
 * @param specie  the specie
 * @return public
 */
    public Penguin(String name, int weight, int height, String specie) { 

        this.name=name;
        this.weight=weight;
        this.height=height;
        this.specie=specie;
    }


/** 
 *
 * Penguin
 *
 * @return public
 */
    public Penguin() { 

        this("GigaChad", 50, 130,"Emperor penguin");
    }


/** 
 *
 * Penguin
 *
 * @param name  the name
 * @return public
 */
    public Penguin(String name) { 

        this(name,50,130,"Emperor penguin");
    }
    
   


/** 
 *
 * Swim
 *
 */
    public void swim() { 

        System.out.println("Penguin really like swimming");
    }

    @Override

/** 
 *
 * Hunt
 *
 */
    public void hunt() { 

        System.out.println("Penguin really well hunting for fish");
    }

    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return super.toString()+"\nSpecie:\t"+this.specie+"\n\nThis is Penguin";
    }

    @Override

/** 
 *
 * Speak
 *
 */
    public void speak() { 

        System.out.println("Squack squack!");
    }

    @Override

/** 
 *
 * Eat
 *
 */
    public void eat() { 

        System.out.println("Penguin eats krill, squids and fishes");
    }
    
    
}
