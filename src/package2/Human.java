package package2;

public class Human extends Participant {

    public Human(int runDistance, int jumpDistance) {
        super(runDistance, jumpDistance);
    }

    @Override
    public void jump() {
        System.out.println("Human jumping");
    }

    @Override
    public void run() {
        System.out.println("Human running");
    }
}