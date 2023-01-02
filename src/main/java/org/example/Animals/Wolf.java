package org.example.Animals;

import org.example.Animals.BaseSettings;
import org.example.Animals.Carnivores;
import org.example.Animals.Duck;

public class Wolf extends Carnivores {
    public Wolf(BaseSettings baseSettings){
        super(BaseSettings.WOLF_BASE_SETTING);
    }

    @Override
    public void eat() {
        System.out.println("eating a duck..."+ Duck.class);
    }
}


