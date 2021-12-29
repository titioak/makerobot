package vn.com.momo.robot.leg;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LeftPaperLegRightIronLegModule_ProvideIronLegFactory implements Factory<Leg> {
  private final LeftPaperLegRightIronLegModule module;

  public LeftPaperLegRightIronLegModule_ProvideIronLegFactory(
      LeftPaperLegRightIronLegModule module) {
    this.module = module;
  }

  @Override
  public Leg get() {
    return provideInstance(module);
  }

  public static Leg provideInstance(LeftPaperLegRightIronLegModule module) {
    return proxyProvideIronLeg(module);
  }

  public static LeftPaperLegRightIronLegModule_ProvideIronLegFactory create(
      LeftPaperLegRightIronLegModule module) {
    return new LeftPaperLegRightIronLegModule_ProvideIronLegFactory(module);
  }

  public static Leg proxyProvideIronLeg(LeftPaperLegRightIronLegModule instance) {
    return Preconditions.checkNotNull(
        instance.provideIronLeg(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
