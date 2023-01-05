package org.example;

import org.example.Animals.Caterpillar;
import org.example.Animals.Duck;
import org.example.Animals.Wolf;

import java.util.HashMap;
import java.util.Map;

public final class Settings{

    public Settings(){
        throw new IllegalStateException();
    }

    public static final Map<Class<?>, Map<Class<?>,Integer>> probability=new HashMap<>();


    public static final Map<Class<?>,Integer> probability_WOLF=new HashMap<>();
    public static final Map<Class<?>,Integer> probability_CATERPILLAR=new HashMap<>();
    public static final Map<Class<?>,Integer> probability_DUCK=new HashMap<>();

    static {
        probability_DUCK.put(Caterpillar.class,90);
        probability_DUCK.put(Wolf.class,0);
        probability_DUCK.put(Plants.class,100);
        probability_WOLF.put(Duck.class,40);
        probability_WOLF.put(Caterpillar.class,0);
        probability_WOLF.put(Plants.class,0);
        probability_CATERPILLAR.put(Duck.class,0);
        probability_CATERPILLAR.put(Wolf.class,0);
        probability_CATERPILLAR.put(Plants.class,0);

        probability.put(Wolf.class,probability_WOLF);
        probability.put(Duck.class,probability_DUCK);
        probability.put(Caterpillar.class,probability_CATERPILLAR);

    }
}
