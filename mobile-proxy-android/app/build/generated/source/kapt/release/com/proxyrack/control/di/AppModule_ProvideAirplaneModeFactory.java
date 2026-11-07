package com.proxyrack.control.di;

import com.proxyrack.control.domain.AirplaneMode;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation"
})
public final class AppModule_ProvideAirplaneModeFactory implements Factory<AirplaneMode> {
  @Override
  public AirplaneMode get() {
    return provideAirplaneMode();
  }

  public static AppModule_ProvideAirplaneModeFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AirplaneMode provideAirplaneMode() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideAirplaneMode());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideAirplaneModeFactory INSTANCE = new AppModule_ProvideAirplaneModeFactory();
  }
}
