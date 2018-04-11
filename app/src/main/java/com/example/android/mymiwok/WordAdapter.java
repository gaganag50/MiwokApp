package com.example.android.mymiwok;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word>{
      public WordAdapter(Activity context, ArrayList<Word> Words ) {
        super(context, 0, Words);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
           listItemView =  LayoutInflater.from(getContext()).inflate(R.layout.word_list , parent , false);
        }
        Word word = getItem(position);
        TextView miwokTextView = listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(word.getMiwokTranslation());

        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(word.getDefaultTranslation());


        ImageView itemImage = listItemView.findViewById(R.id.item_image);
        itemImage.setImageResource(word.getImageResourceId());

        View view = listItemView.findViewById(R.id.text_container);
        view.setBackgroundColor(Color.parseColor("#FFD700"));



        return listItemView;
    }
}


