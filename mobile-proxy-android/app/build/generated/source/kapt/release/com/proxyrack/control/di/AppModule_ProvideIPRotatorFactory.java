package com.proxyrack.control.di;

import com.proxyrack.control.data.repository.ConnectionRepo;
import com.proxyrack.control.domain.AirplaneMode;
import com.proxyrack.control.domain.ConnectionServiceLauncher;
import com.proxyrack.control.domain.IPRotator;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class AppModule_ProvideIPRotatorFactory implements Factory<IPRotator> {
  private final Provider<AirplaneMode> apProvider;

  private final Provider<ConnectionRepo> connRepoProvider;

  private final Provider<ConnectionServiceLauncher> connLauncherProvider;

  public AppModule_ProvideIPRotatorFactory(Provider<AirplaneMode> apProvider,
      Provider<ConnectionRepo> connRepoProvider,
      Provider<ConnectionServiceLauncher> connLauncherProvider) {
    this.apProvider = apProvider;
    this.connRepoProvider = connRepoProvider;
    this.connLauncherProvider = connLauncherProvider;
  }

  @Override
  public IPRotator get() {
    return provideIPRotator(apProvider.get(), connRepoProvider.get(), connLauncherProvider.get());
  }

  public static AppModule_ProvideIPRotatorFactory create(Provider<AirplaneMode> apProvider,
      Provider<ConnectionRepo> connRepoProvider,
      Provider<ConnectionServiceLauncher> connLauncherProvider) {
    return new AppModule_ProvideIPRotatorFactory(apProvider, connRepoProvider, connLauncherProvider);
  }

  public static IPRotator provideIPRotator(AirplaneMode ap, ConnectionRepo connRepo,
      ConnectionServiceLauncher connLauncher) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideIPRotator(ap, connRepo, connLauncher));
  }
}
