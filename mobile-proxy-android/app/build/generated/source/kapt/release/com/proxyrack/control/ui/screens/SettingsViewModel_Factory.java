package com.proxyrack.control.ui.screens;

import com.proxyrack.control.data.repository.AnalyticsStatusNotifier;
import com.proxyrack.control.data.repository.ConnectionRepo;
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
public final class SettingsViewModel_Factory implements Factory<SettingsViewModel> {
  private final Provider<SettingsRepo> settingsRepoProvider;

  private final Provider<AnalyticsStatusNotifier> analyticsStatusProvider;

  private final Provider<ConnectionRepo> connectionRepoProvider;

  public SettingsViewModel_Factory(Provider<SettingsRepo> settingsRepoProvider,
      Provider<AnalyticsStatusNotifier> analyticsStatusProvider,
      Provider<ConnectionRepo> connectionRepoProvider) {
    this.settingsRepoProvider = settingsRepoProvider;
    this.analyticsStatusProvider = analyticsStatusProvider;
    this.connectionRepoProvider = connectionRepoProvider;
  }

  @Override
  public SettingsViewModel get() {
    return newInstance(settingsRepoProvider.get(), analyticsStatusProvider.get(), connectionRepoProvider.get());
  }

  public static SettingsViewModel_Factory create(Provider<SettingsRepo> settingsRepoProvider,
      Provider<AnalyticsStatusNotifier> analyticsStatusProvider,
      Provider<ConnectionRepo> connectionRepoProvider) {
    return new SettingsViewModel_Factory(settingsRepoProvider, analyticsStatusProvider, connectionRepoProvider);
  }

  public static SettingsViewModel newInstance(SettingsRepo settingsRepo,
      AnalyticsStatusNotifier analyticsStatus, ConnectionRepo connectionRepo) {
    return new SettingsViewModel(settingsRepo, analyticsStatus, connectionRepo);
  }
}
