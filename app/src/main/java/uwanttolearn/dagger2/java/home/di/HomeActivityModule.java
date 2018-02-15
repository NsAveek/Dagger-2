package uwanttolearn.dagger2.java.home.di;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;
import uwanttolearn.dagger2.java.home.HomeActivity;
import uwanttolearn.dagger2.java.home.adapter.HomeAdapter;

/**
 * Created by waleed on 15/02/2018.
 */
@Module
public class HomeActivityModule {

    @Provides
    HomeAdapter homeAdapter() {
        return new HomeAdapter(new ArrayList<>());
    }

    @Provides
    RecyclerView.LayoutManager layoutManager(HomeActivity homeActivity) {
        return new LinearLayoutManager(homeActivity);
    }

}
