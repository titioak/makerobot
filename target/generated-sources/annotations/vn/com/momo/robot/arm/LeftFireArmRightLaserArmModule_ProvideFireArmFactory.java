package vn.com.momo.robot.arm;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LeftFireArmRightLaserArmModule_ProvideFireArmFactory implements Factory<Arm> {
  private final LeftFireArmRightLaserArmModule module;

  public LeftFireArmRightLaserArmModule_ProvideFireArmFactory(
      LeftFireArmRightLaserArmModule module) {
    this.module = module;
  }

  @Override
  public Arm get() {
    return provideInstance(module);
  }

  public static Arm provideInstance(LeftFireArmRightLaserArmModule module) {
    return proxyProvideFireArm(module);
  }

  public static LeftFireArmRightLaserArmModule_ProvideFireArmFactory create(
      LeftFireArmRightLaserArmModule module) {
    return new LeftFireArmRightLaserArmModule_ProvideFireArmFactory(module);
  }

  public static Arm proxyProvideFireArm(LeftFireArmRightLaserArmModule instance) {
    return Preconditions.checkNotNull(
        instance.provideFireArm(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
