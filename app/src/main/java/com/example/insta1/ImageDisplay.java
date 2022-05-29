package com.example.insta1;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ImageDisplay extends AppCompatActivity {

        ImageView imageView;
        private  String path;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_image_display);
            imageView = findViewById(R.id.imageviewnew);
            //setupActionBar();

            // Get Image Path
            path = getIntent().getExtras().getString("path");

            // Get Image
            BitmapFactory.Options bmOptions = new BitmapFactory.Options();
            bmOptions. inJustDecodeBounds = false;
            bmOptions. inSampleSize = 4;
            bmOptions. inPurgeable = true ;
            Bitmap bitmap = BitmapFactory.decodeFile(path, bmOptions);

            // Display Image
            imageView.setImageBitmap(bitmap);
        }
    }

