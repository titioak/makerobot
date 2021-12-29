package vn.com.momo.robot;


import org.junit.jupiter.api.Test;

public class SimpleRobotTest {
    @Test
    public static void main(String[] args) {
        FullRobot robot = DaggerRobotCombonent.create().buildRobot();
        robot.doIt();
    }
}
