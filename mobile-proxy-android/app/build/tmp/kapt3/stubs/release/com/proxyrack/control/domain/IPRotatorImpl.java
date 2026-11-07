package com.proxyrack.control.domain;

import com.proxyrack.control.data.repository.ConnectionRepo;
import java.util.concurrent.atomic.AtomicLong;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\rJ\b\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\u000e\u0010\u001e\u001a\u00020\u0019H\u0082@\u00a2\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u0019H\u0016J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#H\u0016J\u000e\u0010$\u001a\u00020\u0019H\u0082@\u00a2\u0006\u0002\u0010\u001fJ\b\u0010%\u001a\u00020\u0019H\u0016J\b\u0010&\u001a\u00020\u0019H\u0016R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000f8VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/proxyrack/control/domain/IPRotatorImpl;", "Lcom/proxyrack/control/domain/IPRotator;", "connectionRepo", "Lcom/proxyrack/control/data/repository/ConnectionRepo;", "ap", "Lcom/proxyrack/control/domain/AirplaneMode;", "connLauncher", "Lcom/proxyrack/control/domain/ConnectionServiceLauncher;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "apToggleDelay", "", "internetConnectivityDelay", "(Lcom/proxyrack/control/data/repository/ConnectionRepo;Lcom/proxyrack/control/domain/AirplaneMode;Lcom/proxyrack/control/domain/ConnectionServiceLauncher;Lkotlinx/coroutines/CoroutineScope;JJ)V", "_job", "Lkotlinx/coroutines/Job;", "job", "getJob", "()Lkotlinx/coroutines/Job;", "setJob", "(Lkotlinx/coroutines/Job;)V", "jobMutex", "Lkotlinx/coroutines/sync/Mutex;", "rotateCh", "Lkotlinx/coroutines/channels/Channel;", "", "rotationIntervalMillis", "Ljava/util/concurrent/atomic/AtomicLong;", "connect", "disconnect", "doRotation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rotateOffSchedule", "setRotationInterval", "minutes", "", "startJob", "startRotationJob", "stopRotationJob", "app_release"})
public final class IPRotatorImpl implements com.proxyrack.control.domain.IPRotator {
    @org.jetbrains.annotations.NotNull()
    private final com.proxyrack.control.data.repository.ConnectionRepo connectionRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.proxyrack.control.domain.AirplaneMode ap = null;
    @org.jetbrains.annotations.NotNull()
    private final com.proxyrack.control.domain.ConnectionServiceLauncher connLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope scope = null;
    private final long apToggleDelay = 0L;
    private final long internetConnectivityDelay = 0L;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.channels.Channel<kotlin.Unit> rotateCh = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job _job;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.sync.Mutex jobMutex = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job job;
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.atomic.AtomicLong rotationIntervalMillis;
    
    public IPRotatorImpl(@org.jetbrains.annotations.NotNull()
    com.proxyrack.control.data.repository.ConnectionRepo connectionRepo, @org.jetbrains.annotations.NotNull()
    com.proxyrack.control.domain.AirplaneMode ap, @org.jetbrains.annotations.NotNull()
    com.proxyrack.control.domain.ConnectionServiceLauncher connLauncher, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope, long apToggleDelay, long internetConnectivityDelay) {
        super();
    }
    
    @java.lang.Override()
    public void setJob(@org.jetbrains.annotations.Nullable()
    kotlinx.coroutines.Job p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public kotlinx.coroutines.Job getJob() {
        return null;
    }
    
    @java.lang.Override()
    public void setRotationInterval(int minutes) {
    }
    
    @java.lang.Override()
    public void startRotationJob() {
    }
    
    @java.lang.Override()
    public void rotateOffSchedule() {
    }
    
    @java.lang.Override()
    public void stopRotationJob() {
    }
    
    private final java.lang.Object startJob(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object doRotation(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final void connect() {
    }
    
    private final void disconnect() {
    }
}