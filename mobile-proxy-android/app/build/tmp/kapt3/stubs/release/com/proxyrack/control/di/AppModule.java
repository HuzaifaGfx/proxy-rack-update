package com.proxyrack.control.di;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import androidx.datastore.preferences.core.Preferences;
import com.proxyrack.control.BuildConfig;
import com.proxyrack.control.data.network.GithubReleasesRetrofit;
import com.proxyrack.control.data.network.GithubReleasesService;
import com.proxyrack.control.data.network.IpInfoApiService;
import com.proxyrack.control.data.repository.AnalyticsStatusNotifier;
import com.proxyrack.control.data.repository.ConnectionRepo;
import com.proxyrack.control.data.repository.DataAccessorImpl;
import com.proxyrack.control.data.repository.GithubReleasesRepoImpl;
import com.proxyrack.control.data.repository.IpInfoRepository;
import com.proxyrack.control.data.repository.SettingsRepoImpl;
import com.proxyrack.control.domain.AirplaneMode;
import com.proxyrack.control.domain.AirplaneModeImpl;
import com.proxyrack.control.domain.ConnectionServiceLauncher;
import com.proxyrack.control.domain.ConnectionServiceLauncherImpl;
import com.proxyrack.control.domain.IPRotator;
import com.proxyrack.control.domain.IPRotatorImpl;
import com.proxyrack.control.domain.proxy_manager.ProxyManagerProvider;
import com.proxyrack.control.domain.proxy_manager.ProxyManagerProviderImpl;
import com.proxyrack.control.domain.repository.DataAccessor;
import com.proxyrack.control.domain.repository.GithubReleasesRepo;
import com.proxyrack.control.domain.repository.SettingsRepo;
import com.proxyrack.control.domain.updates.APKInstallerImpl;
import com.proxyrack.control.domain.updates.UpdateManager;
import com.proxyrack.control.domain.updates.UpdateManagerImpl;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Named;
import javax.inject.Singleton;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0016\u0010\f\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\u0012\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u0016\u0010\u0013\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\u0016\u0010\u0016\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u000eH\u0007J\u0016\u0010\u001c\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u001e\u001a\u00020\u0010H\u0007J\b\u0010\u001f\u001a\u00020 H\u0007JD\u0010!\u001a\u00020\"2\b\b\u0001\u0010#\u001a\u00020\u00062\b\b\u0001\u0010$\u001a\u00020\u00062\b\b\u0001\u0010%\u001a\u00020\u00062\b\b\u0001\u0010&\u001a\u00020\u00062\b\b\u0001\u0010\'\u001a\u00020\u00062\b\b\u0001\u0010(\u001a\u00020\u0006H\u0007J\u0012\u0010)\u001a\u00020*2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007J\u0016\u0010+\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007\u00a8\u0006,"}, d2 = {"Lcom/proxyrack/control/di/AppModule;", "", "()V", "provideAirplaneMode", "Lcom/proxyrack/control/domain/AirplaneMode;", "provideAnalyticsAccessor", "Lcom/proxyrack/control/domain/repository/DataAccessor;", "datastore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "provideAnalyticsStatusNotifier", "Lcom/proxyrack/control/data/repository/AnalyticsStatusNotifier;", "provideBandwidthSharingAccessor", "provideConnServiceLauncher", "Lcom/proxyrack/control/domain/ConnectionServiceLauncher;", "context", "Landroid/content/Context;", "provideConnectionRepo", "Lcom/proxyrack/control/data/repository/ConnectionRepo;", "provideDeviceIDAccessor", "provideIPInfoRepo", "Lcom/proxyrack/control/data/repository/IpInfoRepository;", "provideIPRotationIntervalAccessor", "provideIPRotator", "Lcom/proxyrack/control/domain/IPRotator;", "ap", "connRepo", "connLauncher", "provideInitializedAccessor", "providePreferencesDataStore", "appContext", "provideProxyManagerProvider", "Lcom/proxyrack/control/domain/proxy_manager/ProxyManagerProvider;", "provideSettingsRepo", "Lcom/proxyrack/control/domain/repository/SettingsRepo;", "deviceIDAccessor", "usernameAccessor", "initializedAccessor", "analyticsAccessor", "ipRotationIntervalAccessor", "bandwidthSharingAccessor", "provideUpdateManager", "Lcom/proxyrack/control/domain/updates/UpdateManager;", "provideUsernameAccessor", "app_release"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.proxyrack.control.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.proxyrack.control.domain.proxy_manager.ProxyManagerProvider provideProxyManagerProvider() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.proxyrack.control.data.repository.IpInfoRepository provideIPInfoRepo() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.proxyrack.control.domain.repository.SettingsRepo provideSettingsRepo(@javax.inject.Named(value = "deviceID")
    @org.jetbrains.annotations.NotNull()
    com.proxyrack.control.domain.repository.DataAccessor deviceIDAccessor, @javax.inject.Named(value = "username")
    @org.jetbrains.annotations.NotNull()
    com.proxyrack.control.domain.repository.DataAccessor usernameAccessor, @javax.inject.Named(value = "initialized")
    @org.jetbrains.annotations.NotNull()
    com.proxyrack.control.domain.repository.DataAccessor initializedAccessor, @javax.inject.Named(value = "analytics")
    @org.jetbrains.annotations.NotNull()
    com.proxyrack.control.domain.repository.DataAccessor analyticsAccessor, @javax.inject.Named(value = "ipRotationInterval")
    @org.jetbrains.annotations.NotNull()
    com.proxyrack.control.domain.repository.DataAccessor ipRotationIntervalAccessor, @javax.inject.Named(value = "bandwidthSharingEnabled")
    @org.jetbrains.annotations.NotNull()
    com.proxyrack.control.domain.repository.DataAccessor bandwidthSharingAccessor) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.proxyrack.control.data.repository.AnalyticsStatusNotifier provideAnalyticsStatusNotifier() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> providePreferencesDataStore(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context appContext) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @javax.inject.Named(value = "deviceID")
    @org.jetbrains.annotations.NotNull()
    public final com.proxyrack.control.domain.repository.DataAccessor provideDeviceIDAccessor(@org.jetbrains.annotations.NotNull()
    androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> datastore) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @javax.inject.Named(value = "username")
    @org.jetbrains.annotations.NotNull()
    public final com.proxyrack.control.domain.repository.DataAccessor provideUsernameAccessor(@org.jetbrains.annotations.NotNull()
    androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> datastore) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @javax.inject.Named(value = "initialized")
    @org.jetbrains.annotations.NotNull()
    public final com.proxyrack.control.domain.repository.DataAccessor provideInitializedAccessor(@org.jetbrains.annotations.NotNull()
    androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> datastore) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @javax.inject.Named(value = "analytics")
    @org.jetbrains.annotations.NotNull()
    public final com.proxyrack.control.domain.repository.DataAccessor provideAnalyticsAccessor(@org.jetbrains.annotations.NotNull()
    androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> datastore) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @javax.inject.Named(value = "bandwidthSharingEnabled")
    @org.jetbrains.annotations.NotNull()
    public final com.proxyrack.control.domain.repository.DataAccessor provideBandwidthSharingAccessor(@org.jetbrains.annotations.NotNull()
    androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> datastore) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @javax.inject.Named(value = "ipRotationInterval")
    @org.jetbrains.annotations.NotNull()
    public final com.proxyrack.control.domain.repository.DataAccessor provideIPRotationIntervalAccessor(@org.jetbrains.annotations.NotNull()
    androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> datastore) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.proxyrack.control.data.repository.ConnectionRepo provideConnectionRepo() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.proxyrack.control.domain.AirplaneMode provideAirplaneMode() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.proxyrack.control.domain.ConnectionServiceLauncher provideConnServiceLauncher(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.proxyrack.control.domain.IPRotator provideIPRotator(@org.jetbrains.annotations.NotNull()
    com.proxyrack.control.domain.AirplaneMode ap, @org.jetbrains.annotations.NotNull()
    com.proxyrack.control.data.repository.ConnectionRepo connRepo, @org.jetbrains.annotations.NotNull()
    com.proxyrack.control.domain.ConnectionServiceLauncher connLauncher) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.proxyrack.control.domain.updates.UpdateManager provideUpdateManager(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}