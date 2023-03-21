package package2;

public class Cat extends Participant {


    public Cat(int runDistance, int jumpDistance) {
        super(runDistance, jumpDistance);
    }

    @Override
    public void jump() {
        System.out.println("Cat jumping");
    }

    @Override
    public void run() {
        System.out.println("Cat running");
    }
}
