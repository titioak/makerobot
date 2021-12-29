package vn.com.momo.robot.arm;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LaserArm_Factory implements Factory<LaserArm> {
  private static final LaserArm_Factory INSTANCE = new LaserArm_Factory();

  @Override
  public LaserArm get() {
    return provideInstance();
  }

  public static LaserArm provideInstance() {
    return new LaserArm();
  }

  public static LaserArm_Factory create() {
    return INSTANCE;
  }

  public static LaserArm newLaserArm() {
    return new LaserArm();
  }
}
