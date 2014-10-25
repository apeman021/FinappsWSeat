package com.example.ignasi.myapplication;

import android.app.Activity;
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

public class MyActivity2 extends Activity {

    private TextView mTextView;
    ImageButton imgButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity2);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                mTextView = (TextView) stub.findViewById(R.id.text);
                addButtonListener();
                ImageButton img = (ImageButton) stub.findViewById(R.id.imageButton1);
                img.setImageResource(R.drawable.serhs);
                ImageButton img2 = (ImageButton) stub.findViewById(R.id.imageButton2);
                img2.setImageResource(R.drawable.semon);
                ImageButton img3 = (ImageButton) stub.findViewById(R.id.imageButton3);
                img3.setImageResource(R.drawable.rafulada);
                ImageButton img4 = (ImageButton) stub.findViewById(R.id.imageButton4);
                img4.setImageResource(R.drawable.andreu);
                ImageButton img5 = (ImageButton) stub.findViewById(R.id.imageButton5);
                img5.setImageResource(R.drawable.ribs);
                ImageButton img6 = (ImageButton) stub.findViewById(R.id.imageButton6);
                img6.setImageResource(R.drawable.dominos);
            }
        });
    }


    public void addButtonListener() {

        imgButton = (ImageButton) findViewById(R.id.imageButton1);
        imgButton.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyActivity2.this, MyActivity3.class);
                startActivity(intent);
                //      Toast.makeText(MyActivity.this, "ImageButton is working!", Toast.LENGTH_LONG).show();
            }
        });
    }
}