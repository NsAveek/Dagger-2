package uwanttolearn.dagger2.java.app.di;

import dagger.Module;
import dagger.Provides;
import uwanttolearn.dagger2.java.home.di.HomeActivityComponent;
import uwanttolearn.dagger2.java.repositories.github.GitHubRepository;
import uwanttolearn.dagger2.java.repositories.github.GitHubServiceGenerator;

/**
 * Created by waleed on 15/02/2018.
 */
@Module(subcomponents = HomeActivityComponent.class)
public class AppModule {


    @Provides
    GitHubRepository gitHubRepository(String url) {
        return GitHubRepository.getInstance(GitHubServiceGenerator.gitHubService(url));
    }

}
