package com.proxyrack.control.ui.screens;

import com.proxyrack.control.domain.updates.UpdateManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation"
})
public final class UpdatesViewModel_Factory implements Factory<UpdatesViewModel> {
  private final Provider<UpdateManager> updateManagerProvider;

  public UpdatesViewModel_Factory(Provider<UpdateManager> updateManagerProvider) {
    this.updateManagerProvider = updateManagerProvider;
  }

  @Override
  public UpdatesViewModel get() {
    return newInstance(updateManagerProvider.get());
  }

  public static UpdatesViewModel_Factory create(Provider<UpdateManager> updateManagerProvider) {
    return new UpdatesViewModel_Factory(updateManagerProvider);
  }

  public static UpdatesViewModel newInstance(UpdateManager updateManager) {
    return new UpdatesViewModel(updateManager);
  }
}
