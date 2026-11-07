package com.proxyrack.control.domain.proxy_manager;

import com.proxyrack.proxylib.android.Manager;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\u0016\u0010\u0010\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0016J\u0016\u0010\u0013\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0016J\u001c\u0010\u0014\u001a\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/proxyrack/control/domain/proxy_manager/ProxyManagerAdapter;", "Lcom/proxyrack/control/domain/proxy_manager/ProxyManager;", "manager", "Lcom/proxyrack/proxylib/android/Manager;", "(Lcom/proxyrack/proxylib/android/Manager;)V", "connect", "", "host", "", "port", "", "deviceID", "username", "sharingBandwidth", "", "disconnect", "registerOnConnectCallback", "callback", "Lkotlin/Function0;", "registerOnDisconnectCallback", "registerOnLogEntryCallback", "Lkotlin/Function1;", "unregisterOnDisconnectCallback", "app_release"})
public final class ProxyManagerAdapter implements com.proxyrack.control.domain.proxy_manager.ProxyManager {
    @org.jetbrains.annotations.NotNull()
    private final com.proxyrack.proxylib.android.Manager manager = null;
    
    public ProxyManagerAdapter(@org.jetbrains.annotations.NotNull()
    com.proxyrack.proxylib.android.Manager manager) {
        super();
    }
    
    @java.lang.Override()
    public void connect(@org.jetbrains.annotations.NotNull()
    java.lang.String host, long port, @org.jetbrains.annotations.NotNull()
    java.lang.String deviceID, @org.jetbrains.annotations.NotNull()
    java.lang.String username, boolean sharingBandwidth) {
    }
    
    @java.lang.Override()
    public void disconnect() {
    }
    
    @java.lang.Override()
    public void registerOnLogEntryCallback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> callback) {
    }
    
    @java.lang.Override()
    public void registerOnConnectCallback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    @java.lang.Override()
    public void registerOnDisconnectCallback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    @java.lang.Override()
    public void unregisterOnDisconnectCallback() {
    }
}