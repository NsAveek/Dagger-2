package uwanttolearn.dagger2.java.detail.fragment

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import dagger.Module
import dagger.Subcomponent
import uwanttolearn.dagger2.java.app.App
import uwanttolearn.dagger2.java.detail.DetailActivity
import javax.inject.Inject

/**
 * Created by waleed on 30/12/2017.
 */
class DetailFragmentForSubComponentTesting : Fragment() {

    @Inject
    lateinit var glide: Glide

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (activity as DetailActivity).detailComponent.plus(DetailFragmentModule(this))
                .inject(this)
        Log.i("DetailFragment", glide.toString())
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return View(activity)
    }
}


@Subcomponent(modules = arrayOf(DetailFragmentModule::class))
interface DetailFragmentComponent {

    fun inject(detailFragmentForSubComponentTesting: DetailFragmentForSubComponentTesting)
}

@Module
class DetailFragmentModule(val f: DetailFragmentForSubComponentTesting) {

}