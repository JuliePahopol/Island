package org.example.Animals;

import org.example.Island.Location;
import org.example.Plants;
import org.example.Settings;

import java.util.Iterator;
import java.util.List;

public abstract class Animal {
    Location location;
    private final List<Carnivores> carnivores;
    private final List<Herbivore> herbivores;
    private final List<Plants> plants;
    public Settings settings;

    public boolean ChanceToEat = Settings.probability.containsKey(Integer.SIZE>=0);
//    в Settings в probability содержится числои оно должно быть больше нуля. Логика дальше будет такая:
//    если на локации есть минимум 2 животных и одно из них с вероятностью больше 0 может
//    съесть другое, то оно его есть и травоядное или умирает
    static int MAX_AMOUNT_OF_ANIMALS;

    public static int getMAX_AMOUNT_OF_ANIMALS() {
        return MAX_AMOUNT_OF_ANIMALS;
    }

    public Animal(BaseSettings baseSettings, List<Carnivores> carnivores, List<Herbivore> herbivores, List<Plants> plants) {
        this.carnivores = carnivores;
        this.herbivores = herbivores;
        this.plants = plants;
    }

    public void eat(List<?> objects, Location island) {
    }

    public void multiply(){

    }

    public boolean move(Location this_location, Location[][] locations) {
        return false;
    }

    public void die(){

    }

    public void beEaten() {

            }
    }

