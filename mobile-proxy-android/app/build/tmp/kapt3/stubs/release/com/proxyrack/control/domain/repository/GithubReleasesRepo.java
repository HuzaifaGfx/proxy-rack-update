package com.proxyrack.control.domain.repository;

import com.proxyrack.control.domain.model.ReleaseInfo;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/proxyrack/control/domain/repository/GithubReleasesRepo;", "", "getLatestRelease", "Lcom/proxyrack/control/domain/model/ReleaseInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public abstract interface GithubReleasesRepo {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLatestRelease(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.proxyrack.control.domain.model.ReleaseInfo> $completion);
}