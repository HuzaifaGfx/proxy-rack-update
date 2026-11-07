package com.proxyrack.control.domain.updates;

import java.io.File;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\r"}, d2 = {"Lcom/proxyrack/control/domain/updates/UpdateManager;", "", "checkForUpdate", "Lcom/proxyrack/control/domain/updates/UpdateDetails;", "ignoreCache", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ignoreUpdate", "", "version", "", "installUpdate", "url", "app_release"})
public abstract interface UpdateManager {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object checkForUpdate(boolean ignoreCache, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.proxyrack.control.domain.updates.UpdateDetails> $completion);
    
    public abstract void installUpdate(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String version);
    
    public abstract void ignoreUpdate(@org.jetbrains.annotations.NotNull()
    java.lang.String version);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}