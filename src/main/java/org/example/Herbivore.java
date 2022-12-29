package org.example;

public abstract class Herbivore extends Animal {


    public Herbivore(BaseSettings baseSettings){
        super(baseSettings);
    }

    @Override
    public int move() {
        return 0;
    }

    public void eat(Plants plants) {
    }

    @Override
    public int multiply() {
        return 0;
    }

}


