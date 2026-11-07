package com.proxyrack.control.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005\u00a8\u0006\u0010"}, d2 = {"Lcom/proxyrack/control/domain/repository/SettingsRepo;", "", "analyticsEnabled", "Lcom/proxyrack/control/domain/repository/DataAccessor;", "getAnalyticsEnabled", "()Lcom/proxyrack/control/domain/repository/DataAccessor;", "bandwidthSharingEnabled", "getBandwidthSharingEnabled", "deviceID", "getDeviceID", "initialized", "getInitialized", "ipRotationInterval", "getIpRotationInterval", "username", "getUsername", "app_release"})
public abstract interface SettingsRepo {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.proxyrack.control.domain.repository.DataAccessor getDeviceID();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.proxyrack.control.domain.repository.DataAccessor getUsername();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.proxyrack.control.domain.repository.DataAccessor getInitialized();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.proxyrack.control.domain.repository.DataAccessor getAnalyticsEnabled();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.proxyrack.control.domain.repository.DataAccessor getIpRotationInterval();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.proxyrack.control.domain.repository.DataAccessor getBandwidthSharingEnabled();
}