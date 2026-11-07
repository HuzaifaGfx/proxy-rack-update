package com.proxyrack.control.ui.screens;

import com.proxyrack.control.data.repository.ConnectionRepo;
import com.proxyrack.control.domain.ConnectionServiceLauncher;
import com.proxyrack.control.domain.IPRotator;
import com.proxyrack.control.domain.repository.SettingsRepo;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<ConnectionServiceLauncher> connServiceLauncherProvider;

  private final Provider<SettingsRepo> settingsRepoProvider;

  private final Provider<ConnectionRepo> connectionRepoProvider;

  private final Provider<IPRotator> ipRotatorProvider;

  public HomeViewModel_Factory(Provider<ConnectionServiceLauncher> connServiceLauncherProvider,
      Provider<SettingsRepo> settingsRepoProvider, Provider<ConnectionRepo> connectionRepoProvider,
      Provider<IPRotator> ipRotatorProvider) {
    this.connServiceLauncherProvider = connServiceLauncherProvider;
    this.settingsRepoProvider = settingsRepoProvider;
    this.connectionRepoProvider = connectionRepoProvider;
    this.ipRotatorProvider = ipRotatorProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(connServiceLauncherProvider.get(), settingsRepoProvider.get(), connectionRepoProvider.get(), ipRotatorProvider.get());
  }

  public static HomeViewModel_Factory create(
      Provider<ConnectionServiceLauncher> connServiceLauncherProvider,
      Provider<SettingsRepo> settingsRepoProvider, Provider<ConnectionRepo> connectionRepoProvider,
      Provider<IPRotator> ipRotatorProvider) {
    return new HomeViewModel_Factory(connServiceLauncherProvider, settingsRepoProvider, connectionRepoProvider, ipRotatorProvider);
  }

  public static HomeViewModel newInstance(ConnectionServiceLauncher connServiceLauncher,
      SettingsRepo settingsRepo, ConnectionRepo connectionRepo, IPRotator ipRotator) {
    return new HomeViewModel(connServiceLauncher, settingsRepo, connectionRepo, ipRotator);
  }
}
