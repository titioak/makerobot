package vn.com.momo.robot.leg;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LeftPaperLegRightIronLegModule_ProvidePaperLegFactory implements Factory<Leg> {
  private final LeftPaperLegRightIronLegModule module;

  public LeftPaperLegRightIronLegModule_ProvidePaperLegFactory(
      LeftPaperLegRightIronLegModule module) {
    this.module = module;
  }

  @Override
  public Leg get() {
    return provideInstance(module);
  }

  public static Leg provideInstance(LeftPaperLegRightIronLegModule module) {
    return proxyProvidePaperLeg(module);
  }

  public static LeftPaperLegRightIronLegModule_ProvidePaperLegFactory create(
      LeftPaperLegRightIronLegModule module) {
    return new LeftPaperLegRightIronLegModule_ProvidePaperLegFactory(module);
  }

  public static Leg proxyProvidePaperLeg(LeftPaperLegRightIronLegModule instance) {
    return Preconditions.checkNotNull(
        instance.providePaperLeg(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
