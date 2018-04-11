package com.example.android.mymiwok;

import android.content.Intent;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView numbers = (TextView)findViewById(R.id.numbers_category);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Numbers.class);
                startActivity(intent);
            }
        });
        TextView family = (TextView)findViewById(R.id.family_category);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Family.class);
                startActivity(intent);

            }
        });
        TextView colors = (TextView)findViewById(R.id.colors_category);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Colors.class);
                startActivity(intent);

            }
        });
        TextView phrases = (TextView)findViewById(R.id.phrases_category);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Phrases.class);
                startActivity(intent);


            }
        });

    }
}
