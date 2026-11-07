package com.proxyrack.control.di;

import com.proxyrack.control.domain.proxy_manager.ProxyManagerProvider;
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
public final class AppModule_ProvideProxyManagerProviderFactory implements Factory<ProxyManagerProvider> {
  @Override
  public ProxyManagerProvider get() {
    return provideProxyManagerProvider();
  }

  public static AppModule_ProvideProxyManagerProviderFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ProxyManagerProvider provideProxyManagerProvider() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideProxyManagerProvider());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideProxyManagerProviderFactory INSTANCE = new AppModule_ProvideProxyManagerProviderFactory();
  }
}
