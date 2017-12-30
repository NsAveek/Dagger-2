package uwanttolearn.dagger2.java.app.di

import com.bumptech.glide.Glide
import dagger.Component
import uwanttolearn.dagger2.java.detail.DetailActivity
import uwanttolearn.dagger2.java.detail.di.DetailComponent
import uwanttolearn.dagger2.java.detail.di.DetailModule
import uwanttolearn.dagger2.java.home.di.HomeComponent
import uwanttolearn.dagger2.java.home.di.HomeModule
import uwanttolearn.dagger2.java.repositories.github.GitHubRepository

/**
 * Created by waleed on 30/12/2017.
 */
@Component(modules = arrayOf(AppModule::class))
interface AppComponent{

    fun plus(homeModule: HomeModule): HomeComponent

    fun plus(detailModule: DetailModule): DetailComponent



}