package org.example.Animals;


public abstract class Carnivores extends Animal {

    public Carnivores(BaseSettings baseSettings) {
        super(baseSettings, carnivores, herbivores, plants);
    }
}


