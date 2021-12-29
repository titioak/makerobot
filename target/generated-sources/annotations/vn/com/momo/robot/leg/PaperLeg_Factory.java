package vn.com.momo.robot.leg;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PaperLeg_Factory implements Factory<PaperLeg> {
  private static final PaperLeg_Factory INSTANCE = new PaperLeg_Factory();

  @Override
  public PaperLeg get() {
    return provideInstance();
  }

  public static PaperLeg provideInstance() {
    return new PaperLeg();
  }

  public static PaperLeg_Factory create() {
    return INSTANCE;
  }

  public static PaperLeg newPaperLeg() {
    return new PaperLeg();
  }
}
