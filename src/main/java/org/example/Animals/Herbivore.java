package org.example.Animals;


public abstract class Herbivore extends Animal {


    public Herbivore(BaseSettings baseSettings) {
        super(baseSettings, carnivores, herbivores, plants);
    }
}
