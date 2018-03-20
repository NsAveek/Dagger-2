package uwanttolearn.dagger2.kotlin.home

import android.content.Context
import dagger.Module
import dagger.Provides
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView



/**
 * Created by Aveek on 20/03/2018.
 */

@Module
class KotlinHomeActivityModule(val context: Context) {

    @Provides
    fun layoutManager(): RecyclerView.LayoutManager = LinearLayoutManager(context)

}