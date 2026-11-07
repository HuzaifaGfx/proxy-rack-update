package com.proxyrack.control.data.repository;

import com.proxyrack.control.data.network.IPInfoRetrofitInstance;
import com.proxyrack.control.data.network.IpInfoApiService;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0005\u001a\u00020\u00062\u001c\u0010\u0007\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00060\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/proxyrack/control/data/repository/IpInfoRepository;", "", "()V", "apiService", "Lcom/proxyrack/control/data/network/IpInfoApiService;", "getIpInfo", "", "callback", "Lkotlin/Function2;", "", "", "app_release"})
public final class IpInfoRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.proxyrack.control.data.network.IpInfoApiService apiService = null;
    
    public IpInfoRepository() {
        super();
    }
    
    public final void getIpInfo(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Throwable, kotlin.Unit> callback) {
    }
}