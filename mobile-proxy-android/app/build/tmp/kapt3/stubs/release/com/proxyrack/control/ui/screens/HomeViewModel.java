package com.proxyrack.control.ui.screens;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.proxyrack.control.data.repository.ConnectionRepo;
import com.proxyrack.control.domain.ConnectionServiceLauncher;
import com.proxyrack.control.domain.ConnectionStatus;
import com.proxyrack.control.domain.IPRotator;
import com.proxyrack.control.domain.repository.SettingsRepo;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0006\u0010\u001c\u001a\u00020\u001bJ\b\u0010\u001d\u001a\u00020\u001bH\u0002J\u000e\u0010\u001e\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0002\u0010\u001fJ\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020!H\u0086@\u00a2\u0006\u0002\u0010\u001fJ\u0006\u0010#\u001a\u00020\u001bJ\u0016\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0002\u0010&J\u0016\u0010\'\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0002\u0010&J\u000e\u0010(\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0002\u0010\u001fJ\u0016\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0002\u0010&J\u000e\u0010+\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0002\u0010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00160\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u000f\u00a8\u0006,"}, d2 = {"Lcom/proxyrack/control/ui/screens/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "connServiceLauncher", "Lcom/proxyrack/control/domain/ConnectionServiceLauncher;", "settingsRepo", "Lcom/proxyrack/control/domain/repository/SettingsRepo;", "connectionRepo", "Lcom/proxyrack/control/data/repository/ConnectionRepo;", "ipRotator", "Lcom/proxyrack/control/domain/IPRotator;", "(Lcom/proxyrack/control/domain/ConnectionServiceLauncher;Lcom/proxyrack/control/domain/repository/SettingsRepo;Lcom/proxyrack/control/data/repository/ConnectionRepo;Lcom/proxyrack/control/domain/IPRotator;)V", "connectionStatus", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/proxyrack/control/domain/ConnectionStatus;", "getConnectionStatus", "()Lkotlinx/coroutines/flow/StateFlow;", "deviceID", "", "getDeviceID", "deviceIP", "getDeviceIP", "logMessages", "", "getLogMessages", "username", "getUsername", "connect", "", "connectionButtonClicked", "disconnect", "initializationTasksFinished", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isRooted", "", "previouslyInitialized", "rotateIP", "saveDeviceID", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveUsername", "savedIPRotationIntervalText", "setIPRotationInterval", "text", "setPreviouslyInitialized", "app_release"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.proxyrack.control.domain.ConnectionServiceLauncher connServiceLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final com.proxyrack.control.domain.repository.SettingsRepo settingsRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.proxyrack.control.data.repository.ConnectionRepo connectionRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.proxyrack.control.domain.IPRotator ipRotator = null;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.proxyrack.control.domain.ConnectionServiceLauncher connServiceLauncher, @org.jetbrains.annotations.NotNull()
    com.proxyrack.control.domain.repository.SettingsRepo settingsRepo, @org.jetbrains.annotations.NotNull()
    com.proxyrack.control.data.repository.ConnectionRepo connectionRepo, @org.jetbrains.annotations.NotNull()
    com.proxyrack.control.domain.IPRotator ipRotator) {
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
    public final kotlinx.coroutines.flow.StateFlow<com.proxyrack.control.domain.ConnectionStatus> getConnectionStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<java.lang.String>> getLogMessages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object previouslyInitialized(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setPreviouslyInitialized(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object initializationTasksFinished(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveDeviceID(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setIPRotationInterval(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object savedIPRotationIntervalText(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    public final void rotateIP() {
    }
    
    public final void connectionButtonClicked() {
    }
    
    private final void connect() {
    }
    
    private final void disconnect() {
    }
    
    public final boolean isRooted() {
        return false;
    }
}