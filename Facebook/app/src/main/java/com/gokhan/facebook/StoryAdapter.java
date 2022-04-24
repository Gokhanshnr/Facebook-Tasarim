package com.gokhan.facebook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gokhan.facebook.databinding.StoryTasarimBinding;

import java.util.List;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.StoryTasarimTutucu>{
    private Context mContext;
    private List<Hikaye> hikayeList;

    public StoryAdapter(Context mContext, List<Hikaye> hikayeList) {
        this.mContext = mContext;
        this.hikayeList = hikayeList;
    }

    public class StoryTasarimTutucu extends RecyclerView.ViewHolder{
        private StoryTasarimBinding tasarim;

        public StoryTasarimTutucu( StoryTasarimBinding tasarim) {
            super(tasarim.getRoot());
            this.tasarim = tasarim;
        }
    }


    @NonNull
    @Override
    public StoryTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        StoryTasarimBinding tasarim = StoryTasarimBinding.inflate(layoutInflater,parent,false);
        return new StoryTasarimTutucu(tasarim);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryTasarimTutucu holder, int position) {
        Hikaye story = hikayeList.get(position);
        StoryTasarimBinding t = holder.tasarim;
        t.imageViewStoryAfis.setImageResource(mContext.getResources().getIdentifier(story.getStoryPhoto(),"drawable",mContext.getPackageName()));
        t.imageViewProfile.setImageResource(mContext.getResources().getIdentifier(story.getProfilePhoto(),"drawable",mContext.getPackageName()));
        t.textViewName.setText(story.getIsim());
        if(story.getId() == 1){
            t.imageViewProfile.setImageResource(mContext.getResources().getIdentifier("ic_story_add_icon","drawable",mContext.getPackageName()));
            t.imageViewProfile.setStrokeWidth(0);
            t.textViewName.setVisibility(View.GONE);
        }

    }

    @Override
    public int getItemCount() {
        return hikayeList.size();
    }


}
