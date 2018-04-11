package com.example.android.mymiwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.listview);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("lutti", "Where are you going?", R.raw.phrase_where_are_you_going));
        words.add(new Word("Otiiko", "What is your name?", R.raw.phrase_what_is_your_name));
        words.add(new Word("tolookos", "My name is..", R.raw.phrase_my_name_is));
        words.add(new Word("oyyisa", "How are you feeling ?", R.raw.phrase_how_are_you_feeling));
        words.add(new Word("massokka", "I'm feeling good", R.raw.phrase_im_feeling_good));

        words.add(new Word("temmokka", "Are you coming?", R.raw.phrase_are_you_coming));

        words.add(new Word("kenekaku", "Yes.I'm coming.", R.raw.phrase_yes_im_coming));

        words.add(new Word("kawinta", "I'm coming.", R.raw.phrase_im_coming));

        words.add(new Word("wo'e", "Let's go", R.raw.phrase_lets_go));

        words.add(new Word("na,aacha", "Come here.", R.raw.phrase_come_here));

        ListView listView = (ListView) findViewById(R.id.list);
        WordAdapter wordAdapter = new WordAdapter(this, words);
        listView.setAdapter(wordAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);
                mediaPlayer = MediaPlayer.create(Phrases.this, word.getAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}
