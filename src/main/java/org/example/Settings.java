package org.example;

import java.util.HashMap;
import java.util.Map;

public final class Settings {

    Settings(){
        throw new IllegalStateException();
    }
    public static final Map<Class<?>, double[]> animalList = new HashMap<>();
    static {
//тут я не знаю как сделать так чтобы указывались параметры животных, но тк я уже указала их
        //в другом месте, стоит ли просто их в одну мапку поместить?
        animalList.put(Duck.class, new double[]{1, 200, 1, 4});
        animalList.put(Wolf.class, new double[]{50, 30, 8, 3});
        animalList.put(Caterpillar.class, new double[]{0.01, 1000, 0, 0});
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
