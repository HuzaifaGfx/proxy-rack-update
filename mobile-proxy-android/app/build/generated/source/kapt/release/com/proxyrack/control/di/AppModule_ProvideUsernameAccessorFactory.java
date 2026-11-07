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
public final class AppModule_ProvideUsernameAccessorFactory implements Factory<DataAccessor> {
  private final Provider<DataStore<Preferences>> datastoreProvider;

  public AppModule_ProvideUsernameAccessorFactory(
      Provider<DataStore<Preferences>> datastoreProvider) {
    this.datastoreProvider = datastoreProvider;
  }

  @Override
  public DataAccessor get() {
    return provideUsernameAccessor(datastoreProvider.get());
  }

  public static AppModule_ProvideUsernameAccessorFactory create(
      Provider<DataStore<Preferences>> datastoreProvider) {
    return new AppModule_ProvideUsernameAccessorFactory(datastoreProvider);
  }

  public static DataAccessor provideUsernameAccessor(DataStore<Preferences> datastore) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideUsernameAccessor(datastore));
  }
}
