package org.example.Animals;

public abstract class Carnivores extends Animal {

    public Carnivores(BaseSettings baseSettings){
        super(baseSettings);
    }

    @Override
    public int move() {

        return 0;
    }


    public void eat(Animal animal) {

    }

    @Override
    public int multiply() {
        return 0;
    }
}


