package com.proxyrack.control;

import com.proxyrack.control.data.repository.AnalyticsStatusNotifier;
import com.proxyrack.control.domain.repository.SettingsRepo;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class MyApp_MembersInjector implements MembersInjector<MyApp> {
  private final Provider<SettingsRepo> settingsRepoProvider;

  private final Provider<AnalyticsStatusNotifier> analyticsStatusNotifierProvider;

  public MyApp_MembersInjector(Provider<SettingsRepo> settingsRepoProvider,
      Provider<AnalyticsStatusNotifier> analyticsStatusNotifierProvider) {
    this.settingsRepoProvider = settingsRepoProvider;
    this.analyticsStatusNotifierProvider = analyticsStatusNotifierProvider;
  }

  public static MembersInjector<MyApp> create(Provider<SettingsRepo> settingsRepoProvider,
      Provider<AnalyticsStatusNotifier> analyticsStatusNotifierProvider) {
    return new MyApp_MembersInjector(settingsRepoProvider, analyticsStatusNotifierProvider);
  }

  @Override
  public void injectMembers(MyApp instance) {
    injectSettingsRepo(instance, settingsRepoProvider.get());
    injectAnalyticsStatusNotifier(instance, analyticsStatusNotifierProvider.get());
  }

  @InjectedFieldSignature("com.proxyrack.control.MyApp.settingsRepo")
  public static void injectSettingsRepo(MyApp instance, SettingsRepo settingsRepo) {
    instance.settingsRepo = settingsRepo;
  }

  @InjectedFieldSignature("com.proxyrack.control.MyApp.analyticsStatusNotifier")
  public static void injectAnalyticsStatusNotifier(MyApp instance,
      AnalyticsStatusNotifier analyticsStatusNotifier) {
    instance.analyticsStatusNotifier = analyticsStatusNotifier;
  }
}
