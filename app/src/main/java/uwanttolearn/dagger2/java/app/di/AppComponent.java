package uwanttolearn.dagger2.java.app.di;

import android.app.Application;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import uwanttolearn.dagger2.java.app.App;

/**
 * Created by waleed on 15/02/2018.
 */
@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class, ActivityProviderModule.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder app(Application application);

        @BindsInstance
        Builder url(String url);


        AppComponent build();

    }

    void inject(App app);
}
