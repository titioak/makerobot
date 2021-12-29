package vn.com.momo.robot.arm;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FireArm_Factory implements Factory<FireArm> {
  private static final FireArm_Factory INSTANCE = new FireArm_Factory();

  @Override
  public FireArm get() {
    return provideInstance();
  }

  public static FireArm provideInstance() {
    return new FireArm();
  }

  public static FireArm_Factory create() {
    return INSTANCE;
  }

  public static FireArm newFireArm() {
    return new FireArm();
  }
}
