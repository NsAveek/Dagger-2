package uwanttolearn.dagger2.java.home.di

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.bumptech.glide.Glide
import dagger.Module
import dagger.Provides
import uwanttolearn.dagger2.java.home.HomeActivity

/**
 * Created by waleed on 30/12/2017.
 */
@Module
class HomeModule(val context: HomeActivity) {

    @Provides
    fun layoutManager(): RecyclerView.LayoutManager = LinearLayoutManager(context)

}