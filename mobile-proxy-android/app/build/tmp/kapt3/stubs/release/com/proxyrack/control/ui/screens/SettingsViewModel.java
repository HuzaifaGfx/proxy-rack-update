package com.proxyrack.control.ui.screens;

import androidx.lifecycle.ViewModel;
import com.proxyrack.control.data.repository.AnalyticsStatusNotifier;
import com.proxyrack.control.data.repository.ConnectionRepo;
import com.proxyrack.control.domain.repository.SettingsRepo;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000bH\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000bJ\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/proxyrack/control/ui/screens/SettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "settingsRepo", "Lcom/proxyrack/control/domain/repository/SettingsRepo;", "analyticsStatus", "Lcom/proxyrack/control/data/repository/AnalyticsStatusNotifier;", "connectionRepo", "Lcom/proxyrack/control/data/repository/ConnectionRepo;", "(Lcom/proxyrack/control/domain/repository/SettingsRepo;Lcom/proxyrack/control/data/repository/AnalyticsStatusNotifier;Lcom/proxyrack/control/data/repository/ConnectionRepo;)V", "_analyticsEnabled", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_bandwidthSharingEnabled", "analyticsEnabled", "Lkotlinx/coroutines/flow/StateFlow;", "getAnalyticsEnabled", "()Lkotlinx/coroutines/flow/StateFlow;", "bandwidthSharingEnabled", "getBandwidthSharingEnabled", "boolToText", "", "v", "setAnalyticsEnabled", "", "enabled", "setSharingBandwidthEnabled", "app_release"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class SettingsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.proxyrack.control.domain.repository.SettingsRepo settingsRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.proxyrack.control.data.repository.AnalyticsStatusNotifier analyticsStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final com.proxyrack.control.data.repository.ConnectionRepo connectionRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _analyticsEnabled = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> analyticsEnabled = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _bandwidthSharingEnabled = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> bandwidthSharingEnabled = null;
    
    @javax.inject.Inject()
    public SettingsViewModel(@org.jetbrains.annotations.NotNull()
    com.proxyrack.control.domain.repository.SettingsRepo settingsRepo, @org.jetbrains.annotations.NotNull()
    com.proxyrack.control.data.repository.AnalyticsStatusNotifier analyticsStatus, @org.jetbrains.annotations.NotNull()
    com.proxyrack.control.data.repository.ConnectionRepo connectionRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getAnalyticsEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getBandwidthSharingEnabled() {
        return null;
    }
    
    public final void setAnalyticsEnabled(boolean enabled) {
    }
    
    public final void setSharingBandwidthEnabled(boolean enabled) {
    }
    
    private final java.lang.String boolToText(boolean v) {
        return null;
    }
}