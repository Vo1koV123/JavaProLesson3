package package2;


public class Racetrack extends Obstacle{

    private int length;

    public void setLength(int length) {
        this.length = length;
    }

    public Racetrack(int length) {
        this.length = length;
    }

    @Override
    public int overcome() {
        return length;
    }
}