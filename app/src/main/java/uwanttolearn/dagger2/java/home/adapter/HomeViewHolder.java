package uwanttolearn.dagger2.java.home.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import io.reactivex.Observer;
import uwanttolearn.dagger2.R;
import uwanttolearn.dagger2.java.pojos.GitHubUser;

/**
 * Created by waleed on 22/07/2017.
 */

final class HomeViewHolder extends RecyclerView.ViewHolder {

    private final View parentView;
    private final Observer<GitHubUser> clickObserrver;
    private final TextView nameTextView;
    private final ImageView picImageView;

    public HomeViewHolder(View itemView, Observer<GitHubUser> clickObserver) {
        super(itemView);
        nameTextView = (TextView) itemView.findViewById(R.id.RowHome_name_text_view);
        picImageView = (ImageView) itemView.findViewById(R.id.RowHome_user_image_view);
        parentView = itemView;
        this.clickObserrver = clickObserver;
    }

    public void bind(GitHubUser gitHubUser) {

        Glide.with(picImageView.getContext())
                .load(gitHubUser.getAvatarUrl())
                .into(picImageView);
        nameTextView.setText(gitHubUser.getLogin());
        parentView.setOnClickListener(v -> clickObserrver.onNext(gitHubUser));


    }
}