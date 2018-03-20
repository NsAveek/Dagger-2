package uwanttolearn.dagger2.kotlin.home

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import uwanttolearn.dagger2.R
import uwanttolearn.dagger2.java.home.DaggerHomeActivityComponent
import uwanttolearn.dagger2.java.home.HomeActivity
import uwanttolearn.dagger2.java.home.HomeActivityComponent


class KotlinHomeActivity : AppCompatActivity() {

    lateinit var kotlinHomeActivityComponent: KotlinHomeActivityComponent
    lateinit var kotlinHomeActivityModule: KotlinHomeActivityModule

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initModule()
        initComponent()
    }

    fun initModule(){
        kotlinHomeActivityModule = KotlinHomeActivityModule(this)
    }
    fun initComponent(){
        kotlinHomeActivityComponent = DaggerKotlinHomeActivityComponent.builder().
                kotlinHomeActivityModule(KotlinHomeActivityModule(this)).build()
    }


}
