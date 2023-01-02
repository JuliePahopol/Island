package org.example.Animals;

import org.example.Plants;

public class Caterpillar extends Herbivore {
    public Caterpillar(BaseSettings baseSettings){
        super(BaseSettings.CATERPILLAR_BASE_SETTING);
    }


    @Override
    public void eat() {
        Plants plants=new Plants();
        System.out.println("eating plants"+plants);
    }
}
