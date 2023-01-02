package org.example.Animals;

import org.example.Plants;

public abstract class Animal {
    static int MAX_AMOUNT_OF_ANIMALS;

    public static int getMAX_AMOUNT_OF_ANIMALS() {
        return MAX_AMOUNT_OF_ANIMALS;
    }

    public Animal(BaseSettings baseSettings){
    }

    public abstract int move();
    public void eat(){
        Plants plants;
        Animal animal;
    };
    public abstract int multiply();

}
