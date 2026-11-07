package com.proxyrack.control.data.repository;

import com.proxyrack.control.data.network.GithubReleasesService;
import com.proxyrack.control.domain.model.ReleaseInfo;
import com.proxyrack.control.domain.repository.GithubReleasesRepo;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/proxyrack/control/data/repository/GithubReleasesRepoImpl;", "Lcom/proxyrack/control/domain/repository/GithubReleasesRepo;", "apiService", "Lcom/proxyrack/control/data/network/GithubReleasesService;", "(Lcom/proxyrack/control/data/network/GithubReleasesService;)V", "getLatestRelease", "Lcom/proxyrack/control/domain/model/ReleaseInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class GithubReleasesRepoImpl implements com.proxyrack.control.domain.repository.GithubReleasesRepo {
    @org.jetbrains.annotations.NotNull()
    private final com.proxyrack.control.data.network.GithubReleasesService apiService = null;
    
    public GithubReleasesRepoImpl(@org.jetbrains.annotations.NotNull()
    com.proxyrack.control.data.network.GithubReleasesService apiService) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getLatestRelease(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.proxyrack.control.domain.model.ReleaseInfo> $completion) {
        return null;
    }
}