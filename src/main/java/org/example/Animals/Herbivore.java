package org.example.Animals;

import org.example.Plants;
import org.example.Satiety;

public abstract class Herbivore extends Animal {


    public Herbivore(BaseSettings baseSettings) {
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


    public static Object die() {
        Satiety satiety = new Satiety();
        if (satiety.isNull()) {
            Herbivore.die();


        }
        return Herbivore.die();
    }
}


