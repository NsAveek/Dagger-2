package uwanttolearn.dagger2.java.home.di;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import uwanttolearn.dagger2.java.home.HomeActivity;

/**
 * Created by waleed on 15/02/2018.
 */
@Subcomponent(modules = HomeActivityModule.class)
public interface HomeActivityComponent extends AndroidInjector<HomeActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<HomeActivity> {

    }
}
