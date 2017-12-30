package uwanttolearn.dagger2.java.app.di

import android.content.Context
import com.bumptech.glide.Glide
import dagger.Module
import dagger.Provides
import uwanttolearn.dagger2.java.repositories.github.GitHubRepository
import uwanttolearn.dagger2.java.repositories.github.GitHubService
import uwanttolearn.dagger2.java.repositories.github.GitHubServiceGenerator

/**
 * Created by waleed on 30/12/2017.
 */
@Module
class AppModule(val context: Context) {

    @Provides
    fun provideContext() = context

    @Provides
    fun provideGithubRepository(gitHubService: GitHubService): GitHubRepository
            = GitHubRepository.getInstance(gitHubService)

    @Provides
    fun provideGitHubService(): GitHubService = GitHubServiceGenerator.gitHubService("https://api.github.com")

    @Provides
    fun provideGlide(): Glide = Glide.get(context)

}