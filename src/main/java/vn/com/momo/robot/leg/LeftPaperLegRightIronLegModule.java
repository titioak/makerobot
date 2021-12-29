package vn.com.momo.robot.leg;

import dagger.Module;
import dagger.Provides;

@Module
public class LeftPaperLegRightIronLegModule {
    @Provides
    public Leg providePaperLeg(){
        return new PaperLeg();
    }
    @Provides
    public Leg provideIronLeg(){
        return new IronLeg();
    }
}
