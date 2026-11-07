package com.proxyrack.control.di;

import android.content.Context;
import com.proxyrack.control.domain.updates.UpdateManager;
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
public final class AppModule_ProvideUpdateManagerFactory implements Factory<UpdateManager> {
  private final Provider<Context> contextProvider;

  public AppModule_ProvideUpdateManagerFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public UpdateManager get() {
    return provideUpdateManager(contextProvider.get());
  }

  public static AppModule_ProvideUpdateManagerFactory create(Provider<Context> contextProvider) {
    return new AppModule_ProvideUpdateManagerFactory(contextProvider);
  }

  public static UpdateManager provideUpdateManager(Context context) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideUpdateManager(context));
  }
}
