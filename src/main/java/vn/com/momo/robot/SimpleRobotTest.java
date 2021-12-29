package vn.com.momo.robot;

public class SimpleRobotTest {

    public static void main(String[] args) {
        FullRobot robot = DaggerRobotCombonent.create().buildRobot();
        robot.doIt();
    }
}
