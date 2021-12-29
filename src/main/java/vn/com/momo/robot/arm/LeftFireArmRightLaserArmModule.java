package vn.com.momo.robot.arm;

import dagger.Module;
import dagger.Provides;

@Module
public class LeftFireArmRightLaserArmModule {
    @Provides
    public Arm provideFireArm(){
        return new FireArm();
    }
    @Provides
    public Arm provideLaserArm(){
        return new LaserArm();
    }
}
