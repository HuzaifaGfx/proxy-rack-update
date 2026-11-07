package com.proxyrack.control.di;

import com.proxyrack.control.data.repository.AnalyticsStatusNotifier;
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
public final class AppModule_ProvideAnalyticsStatusNotifierFactory implements Factory<AnalyticsStatusNotifier> {
  @Override
  public AnalyticsStatusNotifier get() {
    return provideAnalyticsStatusNotifier();
  }

  public static AppModule_ProvideAnalyticsStatusNotifierFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AnalyticsStatusNotifier provideAnalyticsStatusNotifier() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideAnalyticsStatusNotifier());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideAnalyticsStatusNotifierFactory INSTANCE = new AppModule_ProvideAnalyticsStatusNotifierFactory();
  }
}
