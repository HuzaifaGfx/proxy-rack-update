package com.proxyrack.control;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.proxyrack.control.data.repository.AnalyticsStatusNotifier;
import com.proxyrack.control.data.repository.ConnectionRepo;
import com.proxyrack.control.data.repository.IpInfoRepository;
import com.proxyrack.control.di.AppModule_ProvideAirplaneModeFactory;
import com.proxyrack.control.di.AppModule_ProvideAnalyticsAccessorFactory;
import com.proxyrack.control.di.AppModule_ProvideAnalyticsStatusNotifierFactory;
import com.proxyrack.control.di.AppModule_ProvideBandwidthSharingAccessorFactory;
import com.proxyrack.control.di.AppModule_ProvideConnServiceLauncherFactory;
import com.proxyrack.control.di.AppModule_ProvideConnectionRepoFactory;
import com.proxyrack.control.di.AppModule_ProvideDeviceIDAccessorFactory;
import com.proxyrack.control.di.AppModule_ProvideIPInfoRepoFactory;
import com.proxyrack.control.di.AppModule_ProvideIPRotationIntervalAccessorFactory;
import com.proxyrack.control.di.AppModule_ProvideIPRotatorFactory;
import com.proxyrack.control.di.AppModule_ProvideInitializedAccessorFactory;
import com.proxyrack.control.di.AppModule_ProvidePreferencesDataStoreFactory;
import com.proxyrack.control.di.AppModule_ProvideProxyManagerProviderFactory;
import com.proxyrack.control.di.AppModule_ProvideSettingsRepoFactory;
import com.proxyrack.control.di.AppModule_ProvideUpdateManagerFactory;
import com.proxyrack.control.di.AppModule_ProvideUsernameAccessorFactory;
import com.proxyrack.control.domain.AirplaneMode;
import com.proxyrack.control.domain.ConnectionService;
import com.proxyrack.control.domain.ConnectionServiceLauncher;
import com.proxyrack.control.domain.ConnectionService_MembersInjector;
import com.proxyrack.control.domain.IPRotator;
import com.proxyrack.control.domain.proxy_manager.ProxyManagerProvider;
import com.proxyrack.control.domain.repository.DataAccessor;
import com.proxyrack.control.domain.repository.SettingsRepo;
import com.proxyrack.control.domain.updates.UpdateManager;
import com.proxyrack.control.ui.screens.HomeViewModel;
import com.proxyrack.control.ui.screens.HomeViewModel_HiltModules;
import com.proxyrack.control.ui.screens.SettingsViewModel;
import com.proxyrack.control.ui.screens.SettingsViewModel_HiltModules;
import com.proxyrack.control.ui.screens.UpdatesViewModel;
import com.proxyrack.control.ui.screens.UpdatesViewModel_HiltModules;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.IdentifierNameString;
import dagger.internal.KeepFieldType;
import dagger.internal.LazyClassKeyMap;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

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
public final class DaggerMyApp_HiltComponents_SingletonC {
  private DaggerMyApp_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public MyApp_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new SingletonCImpl(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements MyApp_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private SavedStateHandleHolder savedStateHandleHolder;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ActivityRetainedCBuilder savedStateHandleHolder(
        SavedStateHandleHolder savedStateHandleHolder) {
      this.savedStateHandleHolder = Preconditions.checkNotNull(savedStateHandleHolder);
      return this;
    }

    @Override
    public MyApp_HiltComponents.ActivityRetainedC build() {
      Preconditions.checkBuilderRequirement(savedStateHandleHolder, SavedStateHandleHolder.class);
      return new ActivityRetainedCImpl(singletonCImpl, savedStateHandleHolder);
    }
  }

  private static final class ActivityCBuilder implements MyApp_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public MyApp_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements MyApp_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public MyApp_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements MyApp_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public MyApp_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements MyApp_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public MyApp_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements MyApp_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public MyApp_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements MyApp_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MyApp_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends MyApp_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends MyApp_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends MyApp_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends MyApp_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectMainActivity(MainActivity arg0) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Map<Class<?>, Boolean> getViewModelKeys() {
      return LazyClassKeyMap.<Boolean>of(MapBuilder.<String, Boolean>newMapBuilder(3).put(LazyClassKeyProvider.com_proxyrack_control_ui_screens_HomeViewModel, HomeViewModel_HiltModules.KeyModule.provide()).put(LazyClassKeyProvider.com_proxyrack_control_ui_screens_SettingsViewModel, SettingsViewModel_HiltModules.KeyModule.provide()).put(LazyClassKeyProvider.com_proxyrack_control_ui_screens_UpdatesViewModel, UpdatesViewModel_HiltModules.KeyModule.provide()).build());
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @IdentifierNameString
    private static final class LazyClassKeyProvider {
      static String com_proxyrack_control_ui_screens_SettingsViewModel = "com.proxyrack.control.ui.screens.SettingsViewModel";

      static String com_proxyrack_control_ui_screens_UpdatesViewModel = "com.proxyrack.control.ui.screens.UpdatesViewModel";

      static String com_proxyrack_control_ui_screens_HomeViewModel = "com.proxyrack.control.ui.screens.HomeViewModel";

      @KeepFieldType
      SettingsViewModel com_proxyrack_control_ui_screens_SettingsViewModel2;

      @KeepFieldType
      UpdatesViewModel com_proxyrack_control_ui_screens_UpdatesViewModel2;

      @KeepFieldType
      HomeViewModel com_proxyrack_control_ui_screens_HomeViewModel2;
    }
  }

  private static final class ViewModelCImpl extends MyApp_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<HomeViewModel> homeViewModelProvider;

    private Provider<SettingsViewModel> settingsViewModelProvider;

    private Provider<UpdatesViewModel> updatesViewModelProvider;

    private ViewModelCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam,
        ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.homeViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.settingsViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.updatesViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
    }

    @Override
    public Map<Class<?>, javax.inject.Provider<ViewModel>> getHiltViewModelMap() {
      return LazyClassKeyMap.<javax.inject.Provider<ViewModel>>of(MapBuilder.<String, javax.inject.Provider<ViewModel>>newMapBuilder(3).put(LazyClassKeyProvider.com_proxyrack_control_ui_screens_HomeViewModel, ((Provider) homeViewModelProvider)).put(LazyClassKeyProvider.com_proxyrack_control_ui_screens_SettingsViewModel, ((Provider) settingsViewModelProvider)).put(LazyClassKeyProvider.com_proxyrack_control_ui_screens_UpdatesViewModel, ((Provider) updatesViewModelProvider)).build());
    }

    @Override
    public Map<Class<?>, Object> getHiltViewModelAssistedMap() {
      return Collections.<Class<?>, Object>emptyMap();
    }

    @IdentifierNameString
    private static final class LazyClassKeyProvider {
      static String com_proxyrack_control_ui_screens_SettingsViewModel = "com.proxyrack.control.ui.screens.SettingsViewModel";

      static String com_proxyrack_control_ui_screens_HomeViewModel = "com.proxyrack.control.ui.screens.HomeViewModel";

      static String com_proxyrack_control_ui_screens_UpdatesViewModel = "com.proxyrack.control.ui.screens.UpdatesViewModel";

      @KeepFieldType
      SettingsViewModel com_proxyrack_control_ui_screens_SettingsViewModel2;

      @KeepFieldType
      HomeViewModel com_proxyrack_control_ui_screens_HomeViewModel2;

      @KeepFieldType
      UpdatesViewModel com_proxyrack_control_ui_screens_UpdatesViewModel2;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.proxyrack.control.ui.screens.HomeViewModel 
          return (T) new HomeViewModel(singletonCImpl.provideConnServiceLauncherProvider.get(), singletonCImpl.provideSettingsRepoProvider.get(), singletonCImpl.provideConnectionRepoProvider.get(), singletonCImpl.provideIPRotatorProvider.get());

          case 1: // com.proxyrack.control.ui.screens.SettingsViewModel 
          return (T) new SettingsViewModel(singletonCImpl.provideSettingsRepoProvider.get(), singletonCImpl.provideAnalyticsStatusNotifierProvider.get(), singletonCImpl.provideConnectionRepoProvider.get());

          case 2: // com.proxyrack.control.ui.screens.UpdatesViewModel 
          return (T) new UpdatesViewModel(singletonCImpl.provideUpdateManagerProvider.get());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends MyApp_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    private Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    private ActivityRetainedCImpl(SingletonCImpl singletonCImpl,
        SavedStateHandleHolder savedStateHandleHolderParam) {
      this.singletonCImpl = singletonCImpl;

      initialize(savedStateHandleHolderParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandleHolder savedStateHandleHolderParam) {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle 
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends MyApp_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }

    @Override
    public void injectConnectionService(ConnectionService arg0) {
      injectConnectionService2(arg0);
    }

    private ConnectionService injectConnectionService2(ConnectionService instance) {
      ConnectionService_MembersInjector.injectConnectionRepo(instance, singletonCImpl.provideConnectionRepoProvider.get());
      ConnectionService_MembersInjector.injectIpInfoRepo(instance, singletonCImpl.provideIPInfoRepoProvider.get());
      ConnectionService_MembersInjector.injectProxyManagerProvider(instance, singletonCImpl.provideProxyManagerProvider.get());
      ConnectionService_MembersInjector.injectSettingsRepo(instance, singletonCImpl.provideSettingsRepoProvider.get());
      return instance;
    }
  }

  private static final class SingletonCImpl extends MyApp_HiltComponents.SingletonC {
    private final ApplicationContextModule applicationContextModule;

    private final SingletonCImpl singletonCImpl = this;

    private Provider<DataStore<Preferences>> providePreferencesDataStoreProvider;

    private Provider<DataAccessor> provideDeviceIDAccessorProvider;

    private Provider<DataAccessor> provideUsernameAccessorProvider;

    private Provider<DataAccessor> provideInitializedAccessorProvider;

    private Provider<DataAccessor> provideAnalyticsAccessorProvider;

    private Provider<DataAccessor> provideIPRotationIntervalAccessorProvider;

    private Provider<DataAccessor> provideBandwidthSharingAccessorProvider;

    private Provider<SettingsRepo> provideSettingsRepoProvider;

    private Provider<AnalyticsStatusNotifier> provideAnalyticsStatusNotifierProvider;

    private Provider<ConnectionServiceLauncher> provideConnServiceLauncherProvider;

    private Provider<ConnectionRepo> provideConnectionRepoProvider;

    private Provider<AirplaneMode> provideAirplaneModeProvider;

    private Provider<IPRotator> provideIPRotatorProvider;

    private Provider<UpdateManager> provideUpdateManagerProvider;

    private Provider<IpInfoRepository> provideIPInfoRepoProvider;

    private Provider<ProxyManagerProvider> provideProxyManagerProvider;

    private SingletonCImpl(ApplicationContextModule applicationContextModuleParam) {
      this.applicationContextModule = applicationContextModuleParam;
      initialize(applicationContextModuleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam) {
      this.providePreferencesDataStoreProvider = DoubleCheck.provider(new SwitchingProvider<DataStore<Preferences>>(singletonCImpl, 2));
      this.provideDeviceIDAccessorProvider = DoubleCheck.provider(new SwitchingProvider<DataAccessor>(singletonCImpl, 1));
      this.provideUsernameAccessorProvider = DoubleCheck.provider(new SwitchingProvider<DataAccessor>(singletonCImpl, 3));
      this.provideInitializedAccessorProvider = DoubleCheck.provider(new SwitchingProvider<DataAccessor>(singletonCImpl, 4));
      this.provideAnalyticsAccessorProvider = DoubleCheck.provider(new SwitchingProvider<DataAccessor>(singletonCImpl, 5));
      this.provideIPRotationIntervalAccessorProvider = DoubleCheck.provider(new SwitchingProvider<DataAccessor>(singletonCImpl, 6));
      this.provideBandwidthSharingAccessorProvider = DoubleCheck.provider(new SwitchingProvider<DataAccessor>(singletonCImpl, 7));
      this.provideSettingsRepoProvider = DoubleCheck.provider(new SwitchingProvider<SettingsRepo>(singletonCImpl, 0));
      this.provideAnalyticsStatusNotifierProvider = DoubleCheck.provider(new SwitchingProvider<AnalyticsStatusNotifier>(singletonCImpl, 8));
      this.provideConnServiceLauncherProvider = DoubleCheck.provider(new SwitchingProvider<ConnectionServiceLauncher>(singletonCImpl, 9));
      this.provideConnectionRepoProvider = DoubleCheck.provider(new SwitchingProvider<ConnectionRepo>(singletonCImpl, 10));
      this.provideAirplaneModeProvider = DoubleCheck.provider(new SwitchingProvider<AirplaneMode>(singletonCImpl, 12));
      this.provideIPRotatorProvider = DoubleCheck.provider(new SwitchingProvider<IPRotator>(singletonCImpl, 11));
      this.provideUpdateManagerProvider = DoubleCheck.provider(new SwitchingProvider<UpdateManager>(singletonCImpl, 13));
      this.provideIPInfoRepoProvider = DoubleCheck.provider(new SwitchingProvider<IpInfoRepository>(singletonCImpl, 14));
      this.provideProxyManagerProvider = DoubleCheck.provider(new SwitchingProvider<ProxyManagerProvider>(singletonCImpl, 15));
    }

    @Override
    public void injectMyApp(MyApp arg0) {
      injectMyApp2(arg0);
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return Collections.<Boolean>emptySet();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    private MyApp injectMyApp2(MyApp instance) {
      MyApp_MembersInjector.injectSettingsRepo(instance, provideSettingsRepoProvider.get());
      MyApp_MembersInjector.injectAnalyticsStatusNotifier(instance, provideAnalyticsStatusNotifierProvider.get());
      return instance;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.proxyrack.control.domain.repository.SettingsRepo 
          return (T) AppModule_ProvideSettingsRepoFactory.provideSettingsRepo(singletonCImpl.provideDeviceIDAccessorProvider.get(), singletonCImpl.provideUsernameAccessorProvider.get(), singletonCImpl.provideInitializedAccessorProvider.get(), singletonCImpl.provideAnalyticsAccessorProvider.get(), singletonCImpl.provideIPRotationIntervalAccessorProvider.get(), singletonCImpl.provideBandwidthSharingAccessorProvider.get());

          case 1: // @javax.inject.Named("deviceID") com.proxyrack.control.domain.repository.DataAccessor 
          return (T) AppModule_ProvideDeviceIDAccessorFactory.provideDeviceIDAccessor(singletonCImpl.providePreferencesDataStoreProvider.get());

          case 2: // androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> 
          return (T) AppModule_ProvidePreferencesDataStoreFactory.providePreferencesDataStore(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 3: // @javax.inject.Named("username") com.proxyrack.control.domain.repository.DataAccessor 
          return (T) AppModule_ProvideUsernameAccessorFactory.provideUsernameAccessor(singletonCImpl.providePreferencesDataStoreProvider.get());

          case 4: // @javax.inject.Named("initialized") com.proxyrack.control.domain.repository.DataAccessor 
          return (T) AppModule_ProvideInitializedAccessorFactory.provideInitializedAccessor(singletonCImpl.providePreferencesDataStoreProvider.get());

          case 5: // @javax.inject.Named("analytics") com.proxyrack.control.domain.repository.DataAccessor 
          return (T) AppModule_ProvideAnalyticsAccessorFactory.provideAnalyticsAccessor(singletonCImpl.providePreferencesDataStoreProvider.get());

          case 6: // @javax.inject.Named("ipRotationInterval") com.proxyrack.control.domain.repository.DataAccessor 
          return (T) AppModule_ProvideIPRotationIntervalAccessorFactory.provideIPRotationIntervalAccessor(singletonCImpl.providePreferencesDataStoreProvider.get());

          case 7: // @javax.inject.Named("bandwidthSharingEnabled") com.proxyrack.control.domain.repository.DataAccessor 
          return (T) AppModule_ProvideBandwidthSharingAccessorFactory.provideBandwidthSharingAccessor(singletonCImpl.providePreferencesDataStoreProvider.get());

          case 8: // com.proxyrack.control.data.repository.AnalyticsStatusNotifier 
          return (T) AppModule_ProvideAnalyticsStatusNotifierFactory.provideAnalyticsStatusNotifier();

          case 9: // com.proxyrack.control.domain.ConnectionServiceLauncher 
          return (T) AppModule_ProvideConnServiceLauncherFactory.provideConnServiceLauncher(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 10: // com.proxyrack.control.data.repository.ConnectionRepo 
          return (T) AppModule_ProvideConnectionRepoFactory.provideConnectionRepo();

          case 11: // com.proxyrack.control.domain.IPRotator 
          return (T) AppModule_ProvideIPRotatorFactory.provideIPRotator(singletonCImpl.provideAirplaneModeProvider.get(), singletonCImpl.provideConnectionRepoProvider.get(), singletonCImpl.provideConnServiceLauncherProvider.get());

          case 12: // com.proxyrack.control.domain.AirplaneMode 
          return (T) AppModule_ProvideAirplaneModeFactory.provideAirplaneMode();

          case 13: // com.proxyrack.control.domain.updates.UpdateManager 
          return (T) AppModule_ProvideUpdateManagerFactory.provideUpdateManager(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 14: // com.proxyrack.control.data.repository.IpInfoRepository 
          return (T) AppModule_ProvideIPInfoRepoFactory.provideIPInfoRepo();

          case 15: // com.proxyrack.control.domain.proxy_manager.ProxyManagerProvider 
          return (T) AppModule_ProvideProxyManagerProviderFactory.provideProxyManagerProvider();

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
