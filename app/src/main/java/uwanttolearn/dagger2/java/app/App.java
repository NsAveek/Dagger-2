package uwanttolearn.dagger2.java.app;

import android.app.Application;
import android.content.Context;

import uwanttolearn.dagger2.java.app.di.AppComponent;
import uwanttolearn.dagger2.java.app.di.AppModule;
import uwanttolearn.dagger2.java.app.di.DaggerAppComponent;
import uwanttolearn.dagger2.java.home.di.HomeModule;
import uwanttolearn.dagger2.java.repositories.github.GitHubRepository;
import uwanttolearn.dagger2.java.repositories.github.GitHubServiceGenerator;

/**
 * Created by waleed on 22/07/2017.
 */

public class App extends Application {

    private static App app;

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();


    }



    public static App getApp() {
        return app;
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

}
