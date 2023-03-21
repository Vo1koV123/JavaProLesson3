import package2.Cat;
import package2.Human;
import package2.Participant;
import package2.Robot;
import package2.Obstacle;
import package2.Racetrack;
import package2.Wall;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {


        Participant human = new Human(100, 1);
        Participant robot = new Robot(200, 2);
        Participant cat = new Cat(500, 4);


        Obstacle wall = new Wall(3);
        Obstacle racetrack = new Racetrack(150);


        Participant[] participants = {human, robot, cat};
        Obstacle[] obstacles = {racetrack, wall};


        test(participants, obstacles);


    }

    public static void test(Participant[] participants, Obstacle[] obstacles) {
        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle.toString().contains("Racetrack")) {
                    if (participant.getRunDistance() >= obstacle.overcome()) {
                        participant.run();
                        System.out.println("passed the racetrack");
                    } else {
                        participant.run();
                        System.out.println("did not pass the racetrack");
                        System.out.println("The passed distance: " + participant.getRunDistance() + " out of " + obstacle.overcome());
                        break;
                    }
                } else {
                    if (participant.getJumpDistance() >= obstacle.overcome()) {
                        participant.jump();
                        System.out.println("passed the wall");
                    } else {
                        participant.jump();
                        System.out.println("did not pass the wall");
                        System.out.println("The passed height: " + participant.getJumpDistance() + " out of " + obstacle.overcome());
                        break;
                    }
                    System.out.println();
                }
            }
        }
    }
}