package com.proxyrack.control.ui.screens;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.proxyrack.control.domain.updates.UpdateDetails;
import com.proxyrack.control.domain.updates.UpdateManager;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import java.io.IOException;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u000fJ\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0007H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/proxyrack/control/ui/screens/UpdatesViewModel;", "Landroidx/lifecycle/ViewModel;", "updateManager", "Lcom/proxyrack/control/domain/updates/UpdateManager;", "(Lcom/proxyrack/control/domain/updates/UpdateManager;)V", "_updateDialogShowing", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "update", "Lcom/proxyrack/control/domain/updates/UpdateDetails;", "updateDialogShowing", "Lkotlinx/coroutines/flow/StateFlow;", "getUpdateDialogShowing", "()Lkotlinx/coroutines/flow/StateFlow;", "checkForUpdate", "", "ignoreUpdate", "installUpdate", "setDialogShowing", "showing", "app_release"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class UpdatesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.proxyrack.control.domain.updates.UpdateManager updateManager = null;
    @org.jetbrains.annotations.NotNull()
    private com.proxyrack.control.domain.updates.UpdateDetails update;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _updateDialogShowing = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> updateDialogShowing = null;
    
    @javax.inject.Inject()
    public UpdatesViewModel(@org.jetbrains.annotations.NotNull()
    com.proxyrack.control.domain.updates.UpdateManager updateManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getUpdateDialogShowing() {
        return null;
    }
    
    public final void checkForUpdate() {
    }
    
    public final void installUpdate() {
    }
    
    public final void ignoreUpdate() {
    }
    
    private final void setDialogShowing(boolean showing) {
    }
}