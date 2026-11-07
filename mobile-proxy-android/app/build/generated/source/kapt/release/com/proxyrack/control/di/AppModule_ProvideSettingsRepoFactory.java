package com.proxyrack.control.di;

import com.proxyrack.control.domain.repository.DataAccessor;
import com.proxyrack.control.domain.repository.SettingsRepo;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("javax.inject.Named")
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
public final class AppModule_ProvideSettingsRepoFactory implements Factory<SettingsRepo> {
  private final Provider<DataAccessor> deviceIDAccessorProvider;

  private final Provider<DataAccessor> usernameAccessorProvider;

  private final Provider<DataAccessor> initializedAccessorProvider;

  private final Provider<DataAccessor> analyticsAccessorProvider;

  private final Provider<DataAccessor> ipRotationIntervalAccessorProvider;

  private final Provider<DataAccessor> bandwidthSharingAccessorProvider;

  public AppModule_ProvideSettingsRepoFactory(Provider<DataAccessor> deviceIDAccessorProvider,
      Provider<DataAccessor> usernameAccessorProvider,
      Provider<DataAccessor> initializedAccessorProvider,
      Provider<DataAccessor> analyticsAccessorProvider,
      Provider<DataAccessor> ipRotationIntervalAccessorProvider,
      Provider<DataAccessor> bandwidthSharingAccessorProvider) {
    this.deviceIDAccessorProvider = deviceIDAccessorProvider;
    this.usernameAccessorProvider = usernameAccessorProvider;
    this.initializedAccessorProvider = initializedAccessorProvider;
    this.analyticsAccessorProvider = analyticsAccessorProvider;
    this.ipRotationIntervalAccessorProvider = ipRotationIntervalAccessorProvider;
    this.bandwidthSharingAccessorProvider = bandwidthSharingAccessorProvider;
  }

  @Override
  public SettingsRepo get() {
    return provideSettingsRepo(deviceIDAccessorProvider.get(), usernameAccessorProvider.get(), initializedAccessorProvider.get(), analyticsAccessorProvider.get(), ipRotationIntervalAccessorProvider.get(), bandwidthSharingAccessorProvider.get());
  }

  public static AppModule_ProvideSettingsRepoFactory create(
      Provider<DataAccessor> deviceIDAccessorProvider,
      Provider<DataAccessor> usernameAccessorProvider,
      Provider<DataAccessor> initializedAccessorProvider,
      Provider<DataAccessor> analyticsAccessorProvider,
      Provider<DataAccessor> ipRotationIntervalAccessorProvider,
      Provider<DataAccessor> bandwidthSharingAccessorProvider) {
    return new AppModule_ProvideSettingsRepoFactory(deviceIDAccessorProvider, usernameAccessorProvider, initializedAccessorProvider, analyticsAccessorProvider, ipRotationIntervalAccessorProvider, bandwidthSharingAccessorProvider);
  }

  public static SettingsRepo provideSettingsRepo(DataAccessor deviceIDAccessor,
      DataAccessor usernameAccessor, DataAccessor initializedAccessor,
      DataAccessor analyticsAccessor, DataAccessor ipRotationIntervalAccessor,
      DataAccessor bandwidthSharingAccessor) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideSettingsRepo(deviceIDAccessor, usernameAccessor, initializedAccessor, analyticsAccessor, ipRotationIntervalAccessor, bandwidthSharingAccessor));
  }
}
