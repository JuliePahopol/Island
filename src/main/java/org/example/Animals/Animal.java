package org.example.Animals;

import org.example.Island.Location;
import org.example.Main;
import org.example.Plants;
import org.example.Settings;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal {
    private double currentSatiety;
    private double MaxSatiety = 100;
    private double satiety;

    private final List<Carnivores> carnivores;
    private final List<Herbivore> herbivores;
    private final List<Plants> plants;


    public boolean ChanceToEat = Settings.probability.containsKey(Integer.SIZE >= 0);
    //    в Settings в probability содержится числои оно должно быть больше нуля. Логика дальше будет такая:
//    если на локации есть минимум 2 животных и одно из них с вероятностью больше 0 может
//    съесть другое, то оно его есть и травоядное или умирает
    static int MAX_AMOUNT_OF_ANIMALS;

    public static int getMAX_AMOUNT_OF_ANIMALS() {
        return MAX_AMOUNT_OF_ANIMALS;
    }

    public Animal(BaseSettings baseSettings, double satiety, List<Carnivores> carnivores, List<Herbivore> herbivores, List<Plants> plants) {
        this.satiety = satiety;
        this.carnivores = carnivores;
        this.herbivores = herbivores;
        this.plants = plants;
    }

    public double setSatiety(double max) {
        return satiety;
    }

    public double getMaxSatiety() {
        return satiety;
    }

    public double getSatiety() {
        return satiety;
    }

    public void eat(List<?> objects, Location island) {
    }

    public void multiply() {


    }

    public boolean move(Location this_location, Location[][] locations) {
        return false;
    }

    public boolean die(Location location) {

//        location.getLock().lock();
//        try {
//            this.setSatiety(Math.max(0, this.getSatiety() - this.getMaxSatiety() / 10));
//            return this.getSatiety() == 0;
//        } finally {
//            location.getLock().unlock();
        return true;
    }


    private Gender getRandomGender() {
        int pickGender = new Random().nextInt(Gender.values().length);
        return Gender.values()[pickGender];
    }

    public boolean isHungry() {
        if (currentSatiety == satiety) {
            System.out.println("Animal is not hungry");
        } else if (currentSatiety != satiety) {
            System.out.println("Animal is starving");
        }
        return true;
    }

    public boolean eatPlants(Plants plants) {
        List<Class<? extends Plants>> pl;

        if (currentSatiety < MaxSatiety) {
           double i = MaxSatiety - currentSatiety;
           double eat = i + currentSatiety;
           System.out.println(eat);
        }
        return true;
    }

}

