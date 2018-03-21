package uwanttolearn.dagger2.kotlin.home

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import uwanttolearn.dagger2.R
import uwanttolearn.dagger2.java.app.App
import uwanttolearn.dagger2.java.home.adapter.HomeAdapter
import uwanttolearn.dagger2.java.repositories.github.GitHubRepository
import javax.inject.Inject


class KotlinHomeActivity : AppCompatActivity() {

    @Inject
    lateinit var gitHubRepository: GitHubRepository
    @Inject
    lateinit var homeAdapter: HomeAdapter
    @Inject
    lateinit var layoutManager: RecyclerView.LayoutManager

    //    lateinit var kotlinHomeActivityComponent: KotlinHomeActivityComponent
    lateinit var kotlinHomeActivityModule: KotlinHomeActivityModule

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
//        initModule()
        initComponent()
    }

    //    fun initModule(){
//        kotlinHomeActivityModule = KotlinHomeActivityModule(this, App.getApp().appComponent.glide)
//    }
    fun initComponent() {
//        kotlinHomeActivityComponent = DaggerKotlinHomeActivityComponent.builder().
//                kotlinHomeActivityModule(KotlinHomeActivityModule(this)).build()
        // TODO : Change the code to App Component Kotlin
        DaggerKotlinHomeActivityComponent.builder()
                .kotlinHomeActivityModule(KotlinHomeActivityModule(this, App.getApp().appComponent.glide))
                .build().inject(this)
    }


}
