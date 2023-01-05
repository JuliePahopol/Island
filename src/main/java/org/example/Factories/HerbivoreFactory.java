package org.example.Factories;

import org.example.Animals.Animal;
import org.example.Animals.Caterpillar;
import org.example.Animals.Duck;
import org.example.Animals.Herbivore;

import java.util.List;

public class HerbivoreFactory implements AnimalFactory {
    @Override
    public Animal createAnimals(AllTheAnimals allTheAnimals) {
        List<Class<? extends Herbivore>> herbivoreList;
        Herbivore herbivore;
        switch (allTheAnimals){
            case Duck -> herbivore=new Duck();
            case Caterpillar -> herbivore = new Caterpillar();
            default -> herbivore=null;
            }

        return herbivore;
    }


}
