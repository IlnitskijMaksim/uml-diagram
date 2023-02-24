package test;

import domain.Penguin;


 /**
 * The class Test animal
 */ 
public class TestAnimal {


/** 
 *
 * Main
 *
 * @param args  the args
 */
    public static void main(String[] args) { 

        Penguin penguin = new Penguin("Tuxedo");
        System.out.println(penguin);
        penguin.swim();
        penguin.hunt();
        penguin.eat();
        penguin.speak();
        
    }
}
