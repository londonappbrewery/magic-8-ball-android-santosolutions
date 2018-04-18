package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askbutton;

        final ImageView im_8_ball;

        askbutton=(Button) findViewById(R.id.ask);
        im_8_ball=(ImageView)findViewById(R.id.im_8ball);

        final int [] img={R.mipmap.ball1,R.mipmap.ball2,R.mipmap.ball3,R.mipmap.ball4,R.mipmap.ball5};

        askbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random numgen=new Random();

                int number=numgen.nextInt(4);

                im_8_ball.setImageResource(img[number]);
            }
        });

    }
}
