package com.gokhan.facebook;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gokhan.facebook.databinding.FragmentAnasayfaBinding;

import java.util.ArrayList;


public class AnasayfaFragment extends Fragment {

    private FragmentAnasayfaBinding tasarim;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false);

        tasarim.rv.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));

        ArrayList<Hikaye> showStory = new ArrayList<>();
        Hikaye h1 = new Hikaye(1,"Gökhan Şahiner","ornek_profile","story_afis1");
        Hikaye h2 = new Hikaye(2,"Sinem Gündüz","profile_photo3","story_afis3");
        Hikaye h3 = new Hikaye(3,"Hakan Mert","profile_photo2","story_afis2");
        Hikaye h4 = new Hikaye(4,"Betül Fidan","profile_photo1","story_afis4");
        Hikaye h5 = new Hikaye(5,"Damla Kafkan","profile_photo6","ornek_story");
        Hikaye h6 = new Hikaye(6,"Nihat Kara","profile_photo7","ornek_story");
        Hikaye h7 = new Hikaye(7,"Can Polat","profile_photo5","ornek_story");

        showStory.add(h1);
        showStory.add(h2);
        showStory.add(h3);
        showStory.add(h4);
        showStory.add(h5);
        showStory.add(h6);
        showStory.add(h7);

        StoryAdapter adapter = new StoryAdapter(requireContext(),showStory);
        tasarim.rv.setAdapter(adapter);

        tasarim.rvPost.setLayoutManager(new LinearLayoutManager(requireContext()));
        ArrayList<Posts> showPosts = new ArrayList<>();
        Posts p1 = new Posts(1,"Gökhan Şahiner","profile_photo5","Old is Gold..!!","1h. Ankara,Eryaman","post_image1","1K likes");
        Posts p2 = new Posts(2,"Sinem Gündüz","profile_photo6","Çok güzel bir gün","3h. İzmir","post_image2","3K likes");
        Posts p3 = new Posts(3,"Nihat Kara","profile_photo7","Eğlenmeye devam","1h. Amasya,Suluova","post_image3","413 likes");
        Posts p4 = new Posts(4,"Bekir Cambaz","profile_photo4","Sanırım hasta oldum, ama beni merak etmeyin. Çabuk toparlarım...","1h. Çukurova Üniversitesi","post_image5","9 likes");
        showPosts.add(p1);
        showPosts.add(p2);
        showPosts.add(p3);
        showPosts.add(p4);

        PostAdapter pAdapter = new PostAdapter(requireContext(),showPosts);
        tasarim.rvPost.setAdapter(pAdapter);

        return tasarim.getRoot();
    }
}