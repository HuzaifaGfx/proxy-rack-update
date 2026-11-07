package com.proxyrack.control.di;

import android.content.Context;
import com.proxyrack.control.domain.ConnectionServiceLauncher;
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
public final class AppModule_ProvideConnServiceLauncherFactory implements Factory<ConnectionServiceLauncher> {
  private final Provider<Context> contextProvider;

  public AppModule_ProvideConnServiceLauncherFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public ConnectionServiceLauncher get() {
    return provideConnServiceLauncher(contextProvider.get());
  }

  public static AppModule_ProvideConnServiceLauncherFactory create(
      Provider<Context> contextProvider) {
    return new AppModule_ProvideConnServiceLauncherFactory(contextProvider);
  }

  public static ConnectionServiceLauncher provideConnServiceLauncher(Context context) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideConnServiceLauncher(context));
  }
}
