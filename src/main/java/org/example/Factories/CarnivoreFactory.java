package org.example.Factories;

import org.example.Animals.Animal;
import org.example.Animals.Carnivores;
import org.example.Animals.Wolf;

public class CarnivoreFactory implements AnimalFactory{
    @Override
    public Animal createAnimals(AllTheAnimals allTheAnimals) {
        Carnivores carnivores;
        switch (allTheAnimals) {
            case Wolf -> carnivores = new Wolf();
            default -> carnivores=null;
        }
        return carnivores;
    }
}
