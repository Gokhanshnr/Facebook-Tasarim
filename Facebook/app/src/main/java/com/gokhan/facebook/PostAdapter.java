package com.gokhan.facebook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gokhan.facebook.databinding.PostTasarimBinding;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostTasarimTutucu>{
    private Context mContext;
    private List<Posts> postsList;

    public PostAdapter(Context mContext, List<Posts> postsList) {
        this.mContext = mContext;
        this.postsList = postsList;
    }

    public class PostTasarimTutucu extends RecyclerView.ViewHolder {
        private PostTasarimBinding tasarim;
        public PostTasarimTutucu(PostTasarimBinding tasarim) {
            super(tasarim.getRoot());
            this.tasarim = tasarim;
        }
    }

    @NonNull
    @Override
    public PostTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        PostTasarimBinding tasarim = PostTasarimBinding.inflate(layoutInflater,parent,false);
        return new PostTasarimTutucu(tasarim);
    }

    @Override
    public void onBindViewHolder(@NonNull PostTasarimTutucu holder, int position) {
        Posts posts = postsList.get(position);
        PostTasarimBinding t = holder.tasarim;
        t.imageViewPostProfile.setImageResource(mContext.getResources().getIdentifier(posts.getPost_profile_image(), "drawable",mContext.getPackageName()));
        t.imageViewPostImage.setImageResource(mContext.getResources().getIdentifier(posts.getPost_image(), "drawable",mContext.getPackageName()));
        t.textViewPostName.setText(posts.getPost_name());
        t.textViewPostDetail.setText(posts.getPost_detail());
        t.textViewPostText.setText(posts.getPost_text());
        t.textViewLike.setText(posts.getPost_like());

    }

    @Override
    public int getItemCount() {
        return postsList.size();
    }


}
