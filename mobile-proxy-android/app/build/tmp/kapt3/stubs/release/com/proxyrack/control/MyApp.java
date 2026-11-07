package com.proxyrack.control;

import android.app.Application;
import android.util.Log;
import com.posthog.PostHog;
import dagger.hilt.android.HiltAndroidApp;
import com.posthog.android.PostHogAndroid;
import com.posthog.android.PostHogAndroidConfig;
import com.proxyrack.control.data.repository.AnalyticsStatusNotifier;
import com.proxyrack.control.domain.repository.SettingsRepo;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@dagger.hilt.android.HiltAndroidApp()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0016"}, d2 = {"Lcom/proxyrack/control/MyApp;", "Landroid/app/Application;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "analyticsStatusNotifier", "Lcom/proxyrack/control/data/repository/AnalyticsStatusNotifier;", "getAnalyticsStatusNotifier", "()Lcom/proxyrack/control/data/repository/AnalyticsStatusNotifier;", "setAnalyticsStatusNotifier", "(Lcom/proxyrack/control/data/repository/AnalyticsStatusNotifier;)V", "settingsRepo", "Lcom/proxyrack/control/domain/repository/SettingsRepo;", "getSettingsRepo", "()Lcom/proxyrack/control/domain/repository/SettingsRepo;", "setSettingsRepo", "(Lcom/proxyrack/control/domain/repository/SettingsRepo;)V", "onCreate", "", "setupAnalytics", "Companion", "app_release"})
public final class MyApp extends android.app.Application {
    private final java.lang.String TAG = null;
    @javax.inject.Inject()
    public com.proxyrack.control.domain.repository.SettingsRepo settingsRepo;
    @javax.inject.Inject()
    public com.proxyrack.control.data.repository.AnalyticsStatusNotifier analyticsStatusNotifier;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String POSTHOG_API_KEY = "phc_OMtM4aGLx55rXhhy3tnUB3ZjEaHrGK5CNvTPvbW0786";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String POSTHOG_HOST = "https://us.i.posthog.com";
    @org.jetbrains.annotations.NotNull()
    public static final com.proxyrack.control.MyApp.Companion Companion = null;
    
    public MyApp() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.proxyrack.control.domain.repository.SettingsRepo getSettingsRepo() {
        return null;
    }
    
    public final void setSettingsRepo(@org.jetbrains.annotations.NotNull()
    com.proxyrack.control.domain.repository.SettingsRepo p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.proxyrack.control.data.repository.AnalyticsStatusNotifier getAnalyticsStatusNotifier() {
        return null;
    }
    
    public final void setAnalyticsStatusNotifier(@org.jetbrains.annotations.NotNull()
    com.proxyrack.control.data.repository.AnalyticsStatusNotifier p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void setupAnalytics() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/proxyrack/control/MyApp$Companion;", "", "()V", "POSTHOG_API_KEY", "", "POSTHOG_HOST", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}