package org.example.Island;

import org.example.Animals.Animal;
import org.example.Animals.Carnivores;
import org.example.Animals.Herbivore;
import org.example.Plants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Island  {
   private final List<Carnivores> carnivoresList;
   private final List<Plants> plants;
   private final List<Herbivore> herbivores;
   private final Map<String, ArrayList<Animal>> animals = new HashMap<>();
   private final Island[][] locations;

   public Island(List<Carnivores> carnivoresList, List<Plants> plants, List<Herbivore> herbivores, Island[][] locations) {
      this.carnivoresList = carnivoresList;
      this.plants = plants;
      this.herbivores = herbivores;
      this.locations = locations;
   }

   public Coordinates getLocationByCoordinates(Coordinates coordinates) {
      return coordinates;
   }


   public void SettlePlantsAndAnimals() {
      getLocationByCoordinates(new Coordinates(4, 5));
      settleAnimals();
      settlePlants();
   }

   private void settleAnimals(){

      int randomIndex = RandomNumber.generateRandom(2, Animal.getMAX_AMOUNT_OF_ANIMALS());
   }
   private  void settlePlants(){
      int randomIndex = RandomNumber.generateRandom(2,Plants.getMAX_NUMBER_OF_PLANTS());

   }
   private void eat(){

   }

      }

