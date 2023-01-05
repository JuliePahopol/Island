package org.example.Island;

import org.example.Factories.AllTheAnimals;
import org.example.Animals.Animal;

public interface AnimalFactory {
   Animal bornNewAnimal(AllTheAnimals allTheAnimals);

}
