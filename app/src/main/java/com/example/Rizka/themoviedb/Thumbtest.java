package com.example.Rizka.themoviedb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Thumbtest extends AppCompatActivity {

    ImageView t;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thumbtest);
        Intent i = getIntent();
        String s = i.getStringExtra("thumb");
        t = (ImageView) findViewById(R.id.imageView);
        textView = (TextView) findViewById(R.id.textView);
        String s1 = "https://img.youtube.com/vi/"+s+"/0.jpg";
        textView.setText(s1);
        Glide.with(Thumbtest.this)
                .load(s1)
                .apply(RequestOptions.placeholderOf(R.drawable.load).centerCrop())
                .into(t);
    }
}
