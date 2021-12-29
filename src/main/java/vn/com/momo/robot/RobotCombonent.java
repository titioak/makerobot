package vn.com.momo.robot;

import dagger.Component;
import vn.com.momo.robot.arm.LeftFireArmRightLaserArmModule;
import vn.com.momo.robot.leg.LeftPaperLegRightIronLegModule;

import javax.inject.Singleton;

@Singleton
@Component(modules = {LeftFireArmRightLaserArmModule.class, LeftPaperLegRightIronLegModule.class})
public interface RobotCombonent {
    FullRobot buildRobot();
}
