package uwanttolearn.dagger2.kotlin.home

import android.support.v7.widget.RecyclerView
import android.widget.ProgressBar
import com.bumptech.glide.Glide
import dagger.Component
import io.reactivex.disposables.Disposable
import uwanttolearn.dagger2.java.home.adapter.HomeAdapter
import uwanttolearn.dagger2.java.repositories.github.GitHubRepository

/**
 * Created by Aveek on 20/03/2018.
 */

@Component(modules = arrayOf(KotlinHomeActivityModule::class))
interface KotlinHomeActivityComponent {

//    fun getRecyclerView(): RecyclerView
//    fun getProgressBar(): ProgressBar
//    fun getGithubRepository(): GitHubRepository
//    fun getHomeAdapter(): HomeAdapter
//    fun getLayoutManager(): RecyclerView.LayoutManager
//    fun getDisposable(): Disposable
//    fun getGlide(): Glide

    fun inject(kotlinHomeActivity : KotlinHomeActivity)
}