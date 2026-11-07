package com.proxyrack.control.data.repository;

import com.proxyrack.control.domain.ConnectionStatus;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0007J\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0005J\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u0007J\u000e\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u0007J\u000e\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\fJ\u000e\u0010\'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011\u00a8\u0006)"}, d2 = {"Lcom/proxyrack/control/data/repository/ConnectionRepo;", "", "()V", "_connectionStatus", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/proxyrack/control/domain/ConnectionStatus;", "_deviceID", "", "_deviceIP", "_logMessages", "", "_sharingBandwidth", "", "_username", "connectionStatus", "Lkotlinx/coroutines/flow/StateFlow;", "getConnectionStatus", "()Lkotlinx/coroutines/flow/StateFlow;", "deviceID", "getDeviceID", "deviceIP", "getDeviceIP", "logMessages", "getLogMessages", "sharingBandwidth", "getSharingBandwidth", "username", "getUsername", "addLogMessage", "", "msg", "updateConnectionStatus", "status", "updateDeviceID", "id", "updateDeviceIP", "ip", "updateSharingBandwidth", "enabled", "updateUsername", "name", "app_release"})
public final class ConnectionRepo {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _username = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> username = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _deviceID = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> deviceID = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _deviceIP = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> deviceIP = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _sharingBandwidth = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> sharingBandwidth = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.proxyrack.control.domain.ConnectionStatus> _connectionStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.proxyrack.control.domain.ConnectionStatus> connectionStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.String>> _logMessages = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<java.lang.String>> logMessages = null;
    
    public ConnectionRepo() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getDeviceID() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getDeviceIP() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getSharingBandwidth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.proxyrack.control.domain.ConnectionStatus> getConnectionStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<java.lang.String>> getLogMessages() {
        return null;
    }
    
    public final void updateSharingBandwidth(boolean enabled) {
    }
    
    public final void updateConnectionStatus(@org.jetbrains.annotations.NotNull()
    com.proxyrack.control.domain.ConnectionStatus status) {
    }
    
    public final void updateDeviceIP(@org.jetbrains.annotations.NotNull()
    java.lang.String ip) {
    }
    
    public final void updateUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public final void updateDeviceID(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public final void addLogMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
}