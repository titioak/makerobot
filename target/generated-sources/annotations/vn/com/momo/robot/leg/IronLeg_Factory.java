package vn.com.momo.robot.leg;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class IronLeg_Factory implements Factory<IronLeg> {
  private static final IronLeg_Factory INSTANCE = new IronLeg_Factory();

  @Override
  public IronLeg get() {
    return provideInstance();
  }

  public static IronLeg provideInstance() {
    return new IronLeg();
  }

  public static IronLeg_Factory create() {
    return INSTANCE;
  }

  public static IronLeg newIronLeg() {
    return new IronLeg();
  }
}
