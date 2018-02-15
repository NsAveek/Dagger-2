package uwanttolearn.dagger2.java.app;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import uwanttolearn.dagger2.java.app.di.DaggerAppComponent;
import uwanttolearn.dagger2.java.repositories.github.GitHubRepository;

/**
 * Created by waleed on 22/07/2017.
 */

public class App extends Application implements HasActivityInjector {

    private static App app;

    @Inject
    GitHubRepository gitHubRepository;

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent
                .builder()
                .app(this)
                .url("https://api.github.com")
                .build()
                .inject(this);
        app = this;
    }


    public static App getApp() {
        return app;
    }

    public GitHubRepository getGitHubRepository() {
        return gitHubRepository;
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
