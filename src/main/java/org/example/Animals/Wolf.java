package org.example;

public class Wolf extends Carnivores {
    public Wolf(BaseSettings baseSettings){
        super(baseSettings);
    }

    @Override
    public void eat() {
        System.out.println("eating a duck..."+ Duck.class);
    }
}


