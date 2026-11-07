package com.proxyrack.control.domain.proxy_manager;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH&J\u0016\u0010\u0010\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH&J\u001c\u0010\u0011\u001a\u00020\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u0012H&J\b\u0010\u0013\u001a\u00020\u0003H&\u00a8\u0006\u0014"}, d2 = {"Lcom/proxyrack/control/domain/proxy_manager/ProxyManager;", "", "connect", "", "host", "", "port", "", "deviceID", "username", "sharingBandwidth", "", "disconnect", "registerOnConnectCallback", "callback", "Lkotlin/Function0;", "registerOnDisconnectCallback", "registerOnLogEntryCallback", "Lkotlin/Function1;", "unregisterOnDisconnectCallback", "app_release"})
public abstract interface ProxyManager {
    
    public abstract void connect(@org.jetbrains.annotations.NotNull()
    java.lang.String host, long port, @org.jetbrains.annotations.NotNull()
    java.lang.String deviceID, @org.jetbrains.annotations.NotNull()
    java.lang.String username, boolean sharingBandwidth);
    
    public abstract void disconnect();
    
    public abstract void registerOnLogEntryCallback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> callback);
    
    public abstract void registerOnConnectCallback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback);
    
    public abstract void registerOnDisconnectCallback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback);
    
    public abstract void unregisterOnDisconnectCallback();
}