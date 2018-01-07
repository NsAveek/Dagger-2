package uwanttolearn.dagger2.java.repositories.github.dagger;

import dagger.Module;
import dagger.Provides;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import uwanttolearn.dagger2.java.repositories.github.GitHubRepository;
import uwanttolearn.dagger2.java.repositories.github.GitHubServiceGenerator;

/**
 * Created by waleed on 07/01/2018.
 */
@Module
public class GitHubModule {

    @Provides
    static GitHubRepository gitHubRepository(){
        return GitHubRepository.getInstance(GitHubServiceGenerator.gitHubService("https://api.github.com"));
    }
}


