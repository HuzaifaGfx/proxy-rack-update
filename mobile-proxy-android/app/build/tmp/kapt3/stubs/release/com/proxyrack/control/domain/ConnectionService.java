package com.proxyrack.control.domain;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.proxyrack.control.BuildConfig;
import com.proxyrack.control.MainActivity;
import com.proxyrack.control.R;
import com.proxyrack.control.data.repository.ConnectionRepo;
import com.proxyrack.control.data.repository.IpInfoRepository;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;
import com.proxyrack.control.domain.proxy_manager.ProxyManager;
import com.proxyrack.control.domain.proxy_manager.ProxyManagerProvider;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020#H\u0002J\b\u0010%\u001a\u00020\u0004H\u0002J\u0014\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020#H\u0016J\b\u0010+\u001a\u00020#H\u0016J\"\u0010,\u001a\u00020-2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-H\u0016J\b\u00100\u001a\u00020#H\u0002J\b\u00101\u001a\u00020#H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u00062"}, d2 = {"Lcom/proxyrack/control/domain/ConnectionService;", "Landroid/app/Service;", "()V", "CHANNEL_ID", "", "TAG", "connectionRepo", "Lcom/proxyrack/control/data/repository/ConnectionRepo;", "getConnectionRepo", "()Lcom/proxyrack/control/data/repository/ConnectionRepo;", "setConnectionRepo", "(Lcom/proxyrack/control/data/repository/ConnectionRepo;)V", "ipInfoRepo", "Lcom/proxyrack/control/data/repository/IpInfoRepository;", "getIpInfoRepo", "()Lcom/proxyrack/control/data/repository/IpInfoRepository;", "setIpInfoRepo", "(Lcom/proxyrack/control/data/repository/IpInfoRepository;)V", "proxyManager", "Lcom/proxyrack/control/domain/proxy_manager/ProxyManager;", "proxyManagerProvider", "Lcom/proxyrack/control/domain/proxy_manager/ProxyManagerProvider;", "getProxyManagerProvider", "()Lcom/proxyrack/control/domain/proxy_manager/ProxyManagerProvider;", "setProxyManagerProvider", "(Lcom/proxyrack/control/domain/proxy_manager/ProxyManagerProvider;)V", "serviceScope", "Lkotlinx/coroutines/CoroutineScope;", "settingsRepo", "Lcom/proxyrack/control/domain/repository/SettingsRepo;", "getSettingsRepo", "()Lcom/proxyrack/control/domain/repository/SettingsRepo;", "setSettingsRepo", "(Lcom/proxyrack/control/domain/repository/SettingsRepo;)V", "connect", "", "createNotificationChannel", "getCPUArchitecture", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onStartCommand", "", "flags", "startId", "registerOnDisconnectCallback", "setupProxyManager", "app_release"})
public final class ConnectionService extends android.app.Service {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "ConnectionService";
    @javax.inject.Inject()
    public com.proxyrack.control.data.repository.ConnectionRepo connectionRepo;
    @javax.inject.Inject()
    public com.proxyrack.control.data.repository.IpInfoRepository ipInfoRepo;
    @javax.inject.Inject()
    public com.proxyrack.control.domain.proxy_manager.ProxyManagerProvider proxyManagerProvider;
    @javax.inject.Inject()
    public com.proxyrack.control.domain.repository.SettingsRepo settingsRepo;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String CHANNEL_ID = "ProxyControlForegroundServiceChannel";
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope serviceScope = null;
    @org.jetbrains.annotations.Nullable()
    private com.proxyrack.control.domain.proxy_manager.ProxyManager proxyManager;
    
    public ConnectionService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.proxyrack.control.data.repository.ConnectionRepo getConnectionRepo() {
        return null;
    }
    
    public final void setConnectionRepo(@org.jetbrains.annotations.NotNull()
    com.proxyrack.control.data.repository.ConnectionRepo p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.proxyrack.control.data.repository.IpInfoRepository getIpInfoRepo() {
        return null;
    }
    
    public final void setIpInfoRepo(@org.jetbrains.annotations.NotNull()
    com.proxyrack.control.data.repository.IpInfoRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.proxyrack.control.domain.proxy_manager.ProxyManagerProvider getProxyManagerProvider() {
        return null;
    }
    
    public final void setProxyManagerProvider(@org.jetbrains.annotations.NotNull()
    com.proxyrack.control.domain.proxy_manager.ProxyManagerProvider p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.proxyrack.control.domain.repository.SettingsRepo getSettingsRepo() {
        return null;
    }
    
    public final void setSettingsRepo(@org.jetbrains.annotations.NotNull()
    com.proxyrack.control.domain.repository.SettingsRepo p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    private final void setupProxyManager() {
    }
    
    private final void registerOnDisconnectCallback() {
    }
    
    private final void connect() {
    }
    
    private final java.lang.String getCPUArchitecture() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void createNotificationChannel() {
    }
}