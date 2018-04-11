package com.example.android.mymiwok;

import android.icu.util.Measure;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.lang.invoke.MethodHandle;
import java.util.ArrayList;

public class Family extends AppCompatActivity{


    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("apa", "father"  , R.drawable.family_father , R.raw.family_father));
        words.add(new Word("eta", "mother" , R.drawable.family_mother , R.raw.family_mother));
        words.add(new Word("angsi", "son" , R.drawable.family_son ,R.raw.family_son));
        words.add(new Word("tune", "daughter" , R.drawable.family_daughter,R.raw.family_daughter ));

        words.add(new Word("taachi", "older brother" , R.drawable.family_older_brother , R.raw.family_older_brother));

        words.add(new Word("chaltitti", "younger brother" , R.drawable.family_younger_brother , R.raw.family_younger_brother));

        words.add(new Word("tete", "older sister" , R.drawable.family_older_sister , R.raw.family_older_sister));

        words.add(new Word("kolliti", "younger sister" , R.drawable.family_younger_sister , R.raw.family_younger_sister));

        words.add(new Word("ama", "grandmother" , R.drawable.family_grandmother , R.raw.family_grandmother));

        words.add(new Word("paapa", "grandfather" , R.drawable.family_grandfather , R.raw.family_grandfather));

        ListView listView = (ListView)findViewById(R.id.list);
        WordAdapter wordAdapter = new WordAdapter(this , words);
        listView.setAdapter(wordAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);
                mediaPlayer = MediaPlayer.create(Family.this , word.getAudioResourceId());
                mediaPlayer.start();
            }
        });

    }
}
