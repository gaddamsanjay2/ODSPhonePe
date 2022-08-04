package com.example.phonepay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper flipper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int images[]={R.color.purple_200,R.color.black,R.color.teal_200};
        flipper=findViewById(R.id.flipper);

        for (int i=0;i<images.length;i++)
            showimage(images[i]);

    }
    public  void showimage(int img)
    {
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(img);

        flipper.addView(imageView);
        flipper.setFlipInterval(3000);
        flipper.setAutoStart(true);
        flipper.setScrollIndicators(img);
        flipper.setInAnimation(this, android.R.anim.slide_out_right);
        flipper.setOutAnimation(this, android.R.anim.slide_in_left);

    }
}