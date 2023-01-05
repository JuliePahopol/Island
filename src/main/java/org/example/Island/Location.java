package org.example.Island;

import org.example.Animals.Carnivores;
import org.example.Animals.Herbivore;
import org.example.Plants;

import java.util.List;
import java.util.concurrent.locks.Lock;


public class Location {
    private final Coordinates coordinates;
    private final List<Carnivores> carnivores;
    private final List<Herbivore> herbivores;
    private final List<Plants> plants;

    public Location(Coordinates coordinates, List<Carnivores> carnivores, List<Herbivore> herbivores, List<Plants> plants) {
        this.coordinates = coordinates;
        this.carnivores=carnivores;
        this.herbivores=herbivores;
        this.plants = plants;
    }
    public void eat() {
        for (int i = 0; i < carnivores.size(); i++) {
            carnivores.get(i).eat(herbivores, this);
        }
        for (int i = 0; i < carnivores.size(); i++) {
            carnivores.get(i).eat(carnivores, this);
        }
        for (int i = 0; i < herbivores.size(); i++) {
            herbivores.get(i).eat(plants, this);
        }
    }
    public void move(Location[][] location){
        carnivores.removeIf(carnivores1 -> carnivores1.move(this,location));
        herbivores.removeIf(herbivore -> herbivore.move(this,location));
    }
    public void reproduce(){
        for (int i =0; i<herbivores.size(); i++){
            herbivores.add(herbivores.get(i));

        }
        for (int i = 0; i< carnivores.size();i++){
            carnivores.add(carnivores.get(i));

        }
    }
    public void die(){

    }
}
