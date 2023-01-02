package org.example;

import java.util.HashMap;

public class Caterpillar extends Herbivore{
    public Caterpillar(BaseSettings baseSettings){
        super(baseSettings);
    }


    @Override
    public void eat() {
        Plants plants=new Plants();
        System.out.println("eating plants"+plants);
    }
}
