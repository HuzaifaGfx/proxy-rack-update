package com.proxyrack.control.di;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import com.proxyrack.control.domain.repository.DataAccessor;
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
public final class AppModule_ProvideDeviceIDAccessorFactory implements Factory<DataAccessor> {
  private final Provider<DataStore<Preferences>> datastoreProvider;

  public AppModule_ProvideDeviceIDAccessorFactory(
      Provider<DataStore<Preferences>> datastoreProvider) {
    this.datastoreProvider = datastoreProvider;
  }

  @Override
  public DataAccessor get() {
    return provideDeviceIDAccessor(datastoreProvider.get());
  }

  public static AppModule_ProvideDeviceIDAccessorFactory create(
      Provider<DataStore<Preferences>> datastoreProvider) {
    return new AppModule_ProvideDeviceIDAccessorFactory(datastoreProvider);
  }

  public static DataAccessor provideDeviceIDAccessor(DataStore<Preferences> datastore) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideDeviceIDAccessor(datastore));
  }
}
