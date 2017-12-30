package uwanttolearn.dagger2.java.home.di

import dagger.Component
import dagger.Subcomponent
import uwanttolearn.dagger2.java.app.di.AppComponent
import uwanttolearn.dagger2.java.home.HomeActivity

/**
 * Created by waleed on 30/12/2017.
 */
@Subcomponent(modules = arrayOf(HomeModule::class))
interface HomeComponent {

    fun inject(activity: HomeActivity)

}