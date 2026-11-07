package com.proxyrack.control.di;

import com.proxyrack.control.data.repository.ConnectionRepo;
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
public final class AppModule_ProvideConnectionRepoFactory implements Factory<ConnectionRepo> {
  @Override
  public ConnectionRepo get() {
    return provideConnectionRepo();
  }

  public static AppModule_ProvideConnectionRepoFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ConnectionRepo provideConnectionRepo() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideConnectionRepo());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideConnectionRepoFactory INSTANCE = new AppModule_ProvideConnectionRepoFactory();
  }
}
