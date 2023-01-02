package org.example.Island;

import org.example.Animals.Animal;
import org.example.Plants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Island  {
   private final Map<String, ArrayList<Animal>> animals = new HashMap<>();
   private final Island[][] locations;

   public Island(Island[][] locations) {
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
//     ArrayList<Animal> quantityOfAnimals= new ArrayList<>();

      int randomIndex = RandomNumber.generateRandom(2, Animal.getMAX_AMOUNT_OF_ANIMALS());
   }
   private  void settlePlants(){
      int randomIndex = RandomNumber.generateRandom(2,Plants.getMAX_NUMBER_OF_PLANTS());

   }
}

