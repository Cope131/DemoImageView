package com.myapplicationdev.android.demoimageview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivDay2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivDay2 = findViewById(R.id.image_view_2);
        ivDay2.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.day2));

    }
}