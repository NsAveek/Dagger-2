package uwanttolearn.dagger2.java.detail.di

import dagger.Component
import dagger.Subcomponent
import uwanttolearn.dagger2.java.app.di.AppComponent
import uwanttolearn.dagger2.java.detail.DetailActivity
import uwanttolearn.dagger2.java.detail.fragment.DetailFragmentComponent
import uwanttolearn.dagger2.java.detail.fragment.DetailFragmentModule

/**
 * Created by waleed on 30/12/2017.
 */
@Subcomponent(modules = arrayOf(DetailModule::class))
interface DetailComponent {

    fun inject(activity: DetailActivity)

    fun plus(detailFragmentModule: DetailFragmentModule): DetailFragmentComponent
}