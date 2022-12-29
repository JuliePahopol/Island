import org.example.Duck;

public class Coordinates {
    private int x;
    private int y;



    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;


        if (this.x == 0 && this.y == 0) {
            System.out.println("The island is to small to exist: ");
        }
    }
}


