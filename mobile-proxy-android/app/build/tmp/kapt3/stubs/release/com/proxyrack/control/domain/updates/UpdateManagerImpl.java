package com.proxyrack.control.domain.updates;

import android.util.Log;
import com.proxyrack.control.domain.model.ReleaseInfo;
import com.proxyrack.control.domain.repository.GithubReleasesRepo;
import io.github.z4kn4fein.semver.Version;
import kotlin.time.ExperimentalTime;
import kotlin.time.TimeMark;
import kotlin.time.TimeSource;
import java.io.File;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0010H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/proxyrack/control/domain/updates/UpdateManagerImpl;", "Lcom/proxyrack/control/domain/updates/UpdateManager;", "currentVersion", "Lio/github/z4kn4fein/semver/Version;", "releasesRepo", "Lcom/proxyrack/control/domain/repository/GithubReleasesRepo;", "apkInstaller", "Lcom/proxyrack/control/domain/updates/APKInstaller;", "storagePath", "Ljava/io/File;", "timeSource", "Lkotlin/time/TimeSource;", "(Lio/github/z4kn4fein/semver/Version;Lcom/proxyrack/control/domain/repository/GithubReleasesRepo;Lcom/proxyrack/control/domain/updates/APKInstaller;Ljava/io/File;Lkotlin/time/TimeSource;)V", "lastCheckedAt", "Lkotlin/time/TimeMark;", "previouslyIgnoredVersion", "", "checkForUpdate", "Lcom/proxyrack/control/domain/updates/UpdateDetails;", "ignoreCache", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ignoreUpdate", "", "version", "installUpdate", "url", "app_release"})
public final class UpdateManagerImpl implements com.proxyrack.control.domain.updates.UpdateManager {
    @org.jetbrains.annotations.NotNull()
    private final io.github.z4kn4fein.semver.Version currentVersion = null;
    @org.jetbrains.annotations.NotNull()
    private final com.proxyrack.control.domain.repository.GithubReleasesRepo releasesRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.proxyrack.control.domain.updates.APKInstaller apkInstaller = null;
    @org.jetbrains.annotations.NotNull()
    private final java.io.File storagePath = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.time.TimeSource timeSource = null;
    @org.jetbrains.annotations.Nullable()
    private kotlin.time.TimeMark lastCheckedAt;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String previouslyIgnoredVersion = "0";
    
    public UpdateManagerImpl(@org.jetbrains.annotations.NotNull()
    io.github.z4kn4fein.semver.Version currentVersion, @org.jetbrains.annotations.NotNull()
    com.proxyrack.control.domain.repository.GithubReleasesRepo releasesRepo, @org.jetbrains.annotations.NotNull()
    com.proxyrack.control.domain.updates.APKInstaller apkInstaller, @org.jetbrains.annotations.NotNull()
    java.io.File storagePath, @org.jetbrains.annotations.NotNull()
    kotlin.time.TimeSource timeSource) {
        super();
    }
    
    @java.lang.Override()
    @kotlin.OptIn(markerClass = {kotlin.time.ExperimentalTime.class})
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object checkForUpdate(boolean ignoreCache, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.proxyrack.control.domain.updates.UpdateDetails> $completion) {
        return null;
    }
    
    @java.lang.Override()
    public void installUpdate(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String version) {
    }
    
    @java.lang.Override()
    public void ignoreUpdate(@org.jetbrains.annotations.NotNull()
    java.lang.String version) {
    }
}