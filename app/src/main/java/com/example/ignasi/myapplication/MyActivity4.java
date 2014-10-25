package com.example.ignasi.myapplication;

import android.app.Activity;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.content.Intent;
import java.util.Timer;
import java.util.TimerTask;

public class MyActivity4 extends Activity {

    private TextView mTextView;
    ImageButton imgButton;
    //private SharedPreferences prefs;
   // SharedPreferences.Editor toEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity4);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                mTextView = (TextView) stub.findViewById(R.id.text);

                ImageButton img = (ImageButton) stub.findViewById(R.id.imageButton1);
                img.setImageResource(R.drawable.sprite);
                ImageButton img2 = (ImageButton) stub.findViewById(R.id.imageButton2);
                img2.setImageResource(R.drawable.coke);
                ImageButton img3 = (ImageButton) stub.findViewById(R.id.imageButton3);
                img3.setImageResource(R.drawable.fanta);
                ImageButton img4 = (ImageButton) stub.findViewById(R.id.imageButton4);
                img4.setImageResource(R.drawable.cokezero);
                ImageButton img5 = (ImageButton) stub.findViewById(R.id.imageButton5);
                img5.setImageResource(R.drawable.cokelight);
                ImageButton img6 = (ImageButton) stub.findViewById(R.id.imageButton6);
                img6.setImageResource(R.drawable.drpepper);

                addButtonListener();
                addButtonListener2();
                addButtonListener3();

            }
        });
    }



    public void addButtonListener() {

        imgButton = (ImageButton) findViewById(R.id.imageButton2);
        imgButton.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MyActivity4.this, "Coca-Cola afegida", Toast.LENGTH_LONG).show();
            }
        });
    }
    public void addButtonListener2() {

        imgButton = (ImageButton) findViewById(R.id.imageButton1);
        imgButton.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MyActivity4.this, "Sprite afegit", Toast.LENGTH_LONG).show();
            }
        });
    }
    public void addButtonListener3() {

        imgButton = (ImageButton) findViewById(R.id.imageButton3);
        imgButton.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MyActivity4.this, "Fanta Taronja afegida", Toast.LENGTH_LONG).show();
            }
        });
    }

}
