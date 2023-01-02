package org.example;

public class BaseSettings {
    public static final BaseSettings WOLF_BASE_SETTING = new BaseSettings(50, 30, 3, 8);
    public static final BaseSettings DUCK_BASE_SETTING = new BaseSettings(1, 200, 0.15, 4);
    public static final BaseSettings CATERPILLAR_BASE_SETTING = new BaseSettings(0.01, 1000, 0, 0);


    private final double weight;
    private final int numberOfSpecies;
    private final double foodCount;
    private final int speed;

    public BaseSettings(double weight, int numberOfSpecies, double foodCount, int speed) {

        this.weight = weight;
        this.numberOfSpecies = numberOfSpecies;
        this.foodCount = foodCount;
        this.speed = speed;
    }
}

