package vn.com.momo.robot;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import vn.com.momo.robot.arm.FireArm;
import vn.com.momo.robot.arm.LaserArm;
import vn.com.momo.robot.leg.IronLeg;
import vn.com.momo.robot.leg.PaperLeg;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FullRobot_Factory implements Factory<FullRobot> {
  private final Provider<FireArm> fireArmProvider;

  private final Provider<LaserArm> laserArmProvider;

  private final Provider<PaperLeg> paperLegProvider;

  private final Provider<IronLeg> ironLegProvider;

  public FullRobot_Factory(
      Provider<FireArm> fireArmProvider,
      Provider<LaserArm> laserArmProvider,
      Provider<PaperLeg> paperLegProvider,
      Provider<IronLeg> ironLegProvider) {
    this.fireArmProvider = fireArmProvider;
    this.laserArmProvider = laserArmProvider;
    this.paperLegProvider = paperLegProvider;
    this.ironLegProvider = ironLegProvider;
  }

  @Override
  public FullRobot get() {
    return provideInstance(fireArmProvider, laserArmProvider, paperLegProvider, ironLegProvider);
  }

  public static FullRobot provideInstance(
      Provider<FireArm> fireArmProvider,
      Provider<LaserArm> laserArmProvider,
      Provider<PaperLeg> paperLegProvider,
      Provider<IronLeg> ironLegProvider) {
    return new FullRobot(
        fireArmProvider.get(),
        laserArmProvider.get(),
        paperLegProvider.get(),
        ironLegProvider.get());
  }

  public static FullRobot_Factory create(
      Provider<FireArm> fireArmProvider,
      Provider<LaserArm> laserArmProvider,
      Provider<PaperLeg> paperLegProvider,
      Provider<IronLeg> ironLegProvider) {
    return new FullRobot_Factory(
        fireArmProvider, laserArmProvider, paperLegProvider, ironLegProvider);
  }

  public static FullRobot newFullRobot(
      FireArm fireArm, LaserArm laserArm, PaperLeg paperLeg, IronLeg ironLeg) {
    return new FullRobot(fireArm, laserArm, paperLeg, ironLeg);
  }
}
