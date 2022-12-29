package org.example;

public class Duck extends Herbivore{

    public Duck(BaseSettings baseSettings) {
        super(baseSettings);
    }



    @Override
    public int move() {
        return 0;
    }

    @Override
    public void eat() {
        Plants plants= new Plants();
        System.out.println("eating plants...."+plants);
        System.out.println("eating caterpillar"+ Caterpillar.class);
    }

    @Override
    public int multiply() {
        return 0;
    }
}

