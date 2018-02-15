package uwanttolearn.dagger2.java.app.di;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import uwanttolearn.dagger2.java.home.HomeActivity;
import uwanttolearn.dagger2.java.home.di.HomeActivityComponent;

/**
 * Created by waleed on 15/02/2018.
 */
@Module
public abstract class ActivityProviderModule {

    @Binds
    @IntoMap
    @ActivityKey(HomeActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindHomeActivity(HomeActivityComponent.Builder builder);


}
