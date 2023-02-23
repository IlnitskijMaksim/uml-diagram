package test;

import domain.Penguin;

public class TestAnimal {

    public static void main(String[] args) {
        Penguin penguin = new Penguin("Tuxedo");
        System.out.println(penguin);
        penguin.swim();
        penguin.hunt();
        penguin.eat();
        penguin.speak();
        
    }
}
