package package2;

public class Wall extends Obstacle {

    private int height;

    public void setHeight(int height) {
        this.height = height;
    }

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int overcome() {
        return height;
    }
}
