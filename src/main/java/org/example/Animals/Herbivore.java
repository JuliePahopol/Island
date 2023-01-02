package org.example;

public abstract class Herbivore extends Animal {


    public Herbivore(BaseSettings baseSettings) {
        super(baseSettings);
    }


    @Override
    public int move() {
        return 0;
    }

    public void eat() {
    }

    @Override
    public int multiply() {
        return 0;
    }


    public static void die() {
        Satiety satiety = new Satiety();
        if (satiety.isNull()) {
            Herbivore.die();


        }
    }
}


