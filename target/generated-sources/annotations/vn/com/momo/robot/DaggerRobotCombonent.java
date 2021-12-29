package vn.com.momo.robot;

import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import vn.com.momo.robot.arm.FireArm_Factory;
import vn.com.momo.robot.arm.LaserArm_Factory;
import vn.com.momo.robot.arm.LeftFireArmRightLaserArmModule;
import vn.com.momo.robot.leg.IronLeg_Factory;
import vn.com.momo.robot.leg.LeftPaperLegRightIronLegModule;
import vn.com.momo.robot.leg.PaperLeg_Factory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerRobotCombonent implements RobotCombonent {
  private DaggerRobotCombonent(Builder builder) {}

  public static Builder builder() {
    return new Builder();
  }

  public static RobotCombonent create() {
    return new Builder().build();
  }

  @Override
  public FullRobot buildRobot() {
    return new FullRobot(
        FireArm_Factory.newFireArm(),
        LaserArm_Factory.newLaserArm(),
        PaperLeg_Factory.newPaperLeg(),
        IronLeg_Factory.newIronLeg());
  }

  public static final class Builder {
    private Builder() {}

    public RobotCombonent build() {
      return new DaggerRobotCombonent(this);
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder leftFireArmRightLaserArmModule(
        LeftFireArmRightLaserArmModule leftFireArmRightLaserArmModule) {
      Preconditions.checkNotNull(leftFireArmRightLaserArmModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder leftPaperLegRightIronLegModule(
        LeftPaperLegRightIronLegModule leftPaperLegRightIronLegModule) {
      Preconditions.checkNotNull(leftPaperLegRightIronLegModule);
      return this;
    }
  }
}
