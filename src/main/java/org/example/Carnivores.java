package org.example;

public abstract class Carnivores extends Animal {

    public Carnivores(BaseSettings baseSettings){
        super(baseSettings);
    }

    @Override
    public int move() {

        return 0;
    }

    @Override
    public void eat() {
    }

    @Override
    public int multiply() {
        return 0;
    }
}


