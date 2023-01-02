package org.example;

import javax.xml.stream.Location;

public abstract class Animal {
    public Animal(BaseSettings baseSettings){
    }

    public abstract int move();
    public abstract void eat();
    public abstract int multiply();

}
