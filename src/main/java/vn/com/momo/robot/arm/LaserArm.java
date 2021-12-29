package vn.com.momo.robot.arm;

import javax.inject.Inject;

public class LaserArm implements  Arm{
    @Inject
    LaserArm(){}

    @Override
    public void punch() {
        System.out.println("Injecting laser");
    }
}
