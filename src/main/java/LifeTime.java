import org.example.Island.Coordinates;
import org.example.Island.Island;
import org.example.Island.Location;

import java.util.concurrent.locks.ReentrantLock;

public class LifeTime implements Runnable{
    ReentrantLock lock = new ReentrantLock();

    Coordinates coordinates;
    Location location;
    Island island;

    public void LifeTime(Coordinates coordinates, Island island, Location location){
        this.coordinates=coordinates;
        this.island=island;
        this.location=location;
    }
    @Override
    public synchronized void run() {
        location.eat();
        location.die();
//        location.move(island.); не знаю что тут указать
        location.reproduce();

    }
}
