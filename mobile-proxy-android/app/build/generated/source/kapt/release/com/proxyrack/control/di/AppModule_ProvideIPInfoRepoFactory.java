package com.proxyrack.control.di;

import com.proxyrack.control.data.repository.IpInfoRepository;
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
public final class AppModule_ProvideIPInfoRepoFactory implements Factory<IpInfoRepository> {
  @Override
  public IpInfoRepository get() {
    return provideIPInfoRepo();
  }

  public static AppModule_ProvideIPInfoRepoFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static IpInfoRepository provideIPInfoRepo() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideIPInfoRepo());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideIPInfoRepoFactory INSTANCE = new AppModule_ProvideIPInfoRepoFactory();
  }
}
