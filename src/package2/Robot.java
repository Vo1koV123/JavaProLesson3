package package2;

public class Robot extends Participant {
    public Robot(int runDistance, int jumpDistance) {
        super(runDistance, jumpDistance);
    }

    @Override
    public void jump() {
        System.out.println("Robot jumping");
    }

    @Override
    public void run() {
        System.out.println("Robot running");
    }
}
