package org.example;

import org.example.Animals.Animal;
import org.example.Animals.Herbivore;

public class Satiety {

    public boolean isNull() {
        Plants plants= new Plants();
        while (plants.noFoodLeft()){
            Satiety satiety = new Satiety();
            if (plants.noFoodLeft()) {
               satiety.equals(Herbivore.die());

            }
            //? насколько логично ставить null в данном случае :(
        }
        return true;
    }
}