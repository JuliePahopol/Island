import org.example.Duck;

public class Coordinates {
    private int x;
    private int y;



    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;

        getX();
        getY();


        if (this.x == 0 && this.y == 0) {
            System.out.println("The island is to small to exist: ");
            //не знаю если это имеет смысл


        }
    }
}


