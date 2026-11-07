package com.proxyrack.control.domain;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\tH&J\b\u0010\u000e\u001a\u00020\tH&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/proxyrack/control/domain/IPRotator;", "", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "setJob", "(Lkotlinx/coroutines/Job;)V", "rotateOffSchedule", "", "setRotationInterval", "minutes", "", "startRotationJob", "stopRotationJob", "app_release"})
public abstract interface IPRotator {
    
    @org.jetbrains.annotations.Nullable()
    public abstract kotlinx.coroutines.Job getJob();
    
    public abstract void setJob(@org.jetbrains.annotations.Nullable()
    kotlinx.coroutines.Job p0);
    
    public abstract void setRotationInterval(int minutes);
    
    public abstract void startRotationJob();
    
    public abstract void rotateOffSchedule();
    
    public abstract void stopRotationJob();
}