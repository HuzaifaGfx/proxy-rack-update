package com.proxyrack.control.domain;

import com.proxyrack.control.data.repository.ConnectionRepo;
import com.proxyrack.control.data.repository.IpInfoRepository;
import com.proxyrack.control.domain.proxy_manager.ProxyManagerProvider;
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
public final class ConnectionService_MembersInjector implements MembersInjector<ConnectionService> {
  private final Provider<ConnectionRepo> connectionRepoProvider;

  private final Provider<IpInfoRepository> ipInfoRepoProvider;

  private final Provider<ProxyManagerProvider> proxyManagerProvider;

  private final Provider<SettingsRepo> settingsRepoProvider;

  public ConnectionService_MembersInjector(Provider<ConnectionRepo> connectionRepoProvider,
      Provider<IpInfoRepository> ipInfoRepoProvider,
      Provider<ProxyManagerProvider> proxyManagerProvider,
      Provider<SettingsRepo> settingsRepoProvider) {
    this.connectionRepoProvider = connectionRepoProvider;
    this.ipInfoRepoProvider = ipInfoRepoProvider;
    this.proxyManagerProvider = proxyManagerProvider;
    this.settingsRepoProvider = settingsRepoProvider;
  }

  public static MembersInjector<ConnectionService> create(
      Provider<ConnectionRepo> connectionRepoProvider,
      Provider<IpInfoRepository> ipInfoRepoProvider,
      Provider<ProxyManagerProvider> proxyManagerProvider,
      Provider<SettingsRepo> settingsRepoProvider) {
    return new ConnectionService_MembersInjector(connectionRepoProvider, ipInfoRepoProvider, proxyManagerProvider, settingsRepoProvider);
  }

  @Override
  public void injectMembers(ConnectionService instance) {
    injectConnectionRepo(instance, connectionRepoProvider.get());
    injectIpInfoRepo(instance, ipInfoRepoProvider.get());
    injectProxyManagerProvider(instance, proxyManagerProvider.get());
    injectSettingsRepo(instance, settingsRepoProvider.get());
  }

  @InjectedFieldSignature("com.proxyrack.control.domain.ConnectionService.connectionRepo")
  public static void injectConnectionRepo(ConnectionService instance,
      ConnectionRepo connectionRepo) {
    instance.connectionRepo = connectionRepo;
  }

  @InjectedFieldSignature("com.proxyrack.control.domain.ConnectionService.ipInfoRepo")
  public static void injectIpInfoRepo(ConnectionService instance, IpInfoRepository ipInfoRepo) {
    instance.ipInfoRepo = ipInfoRepo;
  }

  @InjectedFieldSignature("com.proxyrack.control.domain.ConnectionService.proxyManagerProvider")
  public static void injectProxyManagerProvider(ConnectionService instance,
      ProxyManagerProvider proxyManagerProvider) {
    instance.proxyManagerProvider = proxyManagerProvider;
  }

  @InjectedFieldSignature("com.proxyrack.control.domain.ConnectionService.settingsRepo")
  public static void injectSettingsRepo(ConnectionService instance, SettingsRepo settingsRepo) {
    instance.settingsRepo = settingsRepo;
  }
}
