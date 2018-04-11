package com.example.android.mymiwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("wetetti", "red" , R.drawable.color_red , R.raw.color_red));
        words.add(new Word("chokokki", "green" , R.drawable.color_green , R.raw.color_green));
        words.add(new Word("takaakki", "brown" , R.drawable.color_brown , R.raw.color_brown));
        words.add(new Word("topoppi", "gray" , R.drawable.color_gray , R.raw.color_gray));

        words.add(new Word("kululi", "black" , R.drawable.color_black , R.raw.color_black));

        words.add(new Word("kelelli", "white" , R.drawable.color_white , R.raw.color_white));

        words.add(new Word("topiisa", "dusty yellow" , R.drawable.color_dusty_yellow , R.raw.color_dusty_yellow));

        words.add(new Word("chiwiita", "mustard yellow" , R.drawable.color_mustard_yellow ,  R.raw.color_mustard_yellow));

        ListView listView = findViewById(R.id.list);
        WordAdapter wordAdapter = new WordAdapter(this , words);
        listView.setAdapter(wordAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);
                mediaPlayer = MediaPlayer.create(Colors.this , word.getAudioResourceId());
                mediaPlayer.start();
            }
        });

    }
}
