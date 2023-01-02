package org.example;

public class Plants {
    int grass;
    int flowers;
    static int MAX_NUMBER_OF_PLANTS;

    public static int getMAX_NUMBER_OF_PLANTS() {
        return MAX_NUMBER_OF_PLANTS;
    }

    public boolean noFoodLeft() {

        if (this.flowers == 0 && this.grass == 0) {
            System.out.println("No plants on the territory");

        }
        return true;
    }
}
