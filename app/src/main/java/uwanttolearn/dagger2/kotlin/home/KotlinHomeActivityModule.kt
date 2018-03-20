package uwanttolearn.dagger2.kotlin.home

import android.content.Context
import dagger.Module
import dagger.Provides
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.bumptech.glide.Glide
import uwanttolearn.dagger2.java.app.App
import uwanttolearn.dagger2.java.home.adapter.HomeAdapter
import uwanttolearn.dagger2.java.repositories.github.GitHubRepository


/**
 * Created by Aveek on 20/03/2018.
 */

@Module
class KotlinHomeActivityModule(val context: Context, val glide : Glide) {

    @Provides
    fun layoutManager(): RecyclerView.LayoutManager = LinearLayoutManager(context)

    @Provides
    fun homeAdapter() : HomeAdapter = HomeAdapter(null,glide)

    @Provides
    fun gitHubRepository() : GitHubRepository = App.getApp().appComponent.gitHubRepository
}