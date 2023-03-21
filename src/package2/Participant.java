package package2;

public abstract class Participant {
    private int runDistance;
    private int jumpDistance;

    public int getRunDistance() {
        return runDistance;
    }

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }

    public int getJumpDistance() {
        return jumpDistance;
    }

    public void setJumpDistance(int jumpDistance) {
        this.jumpDistance = jumpDistance;
    }

    public Participant(int runDistance, int jumpDistance) {
        this.runDistance = runDistance;
        this.jumpDistance = jumpDistance;
    }
    public abstract void run();

    public abstract void jump();
}
