package com.proxyrack.control.di;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class AppModule_ProvidePreferencesDataStoreFactory implements Factory<DataStore<Preferences>> {
  private final Provider<Context> appContextProvider;

  public AppModule_ProvidePreferencesDataStoreFactory(Provider<Context> appContextProvider) {
    this.appContextProvider = appContextProvider;
  }

  @Override
  public DataStore<Preferences> get() {
    return providePreferencesDataStore(appContextProvider.get());
  }

  public static AppModule_ProvidePreferencesDataStoreFactory create(
      Provider<Context> appContextProvider) {
    return new AppModule_ProvidePreferencesDataStoreFactory(appContextProvider);
  }

  public static DataStore<Preferences> providePreferencesDataStore(Context appContext) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providePreferencesDataStore(appContext));
  }
}
