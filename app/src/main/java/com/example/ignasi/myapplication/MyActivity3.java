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
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class MyActivity3 extends Activity{

    private TextView mTextView;
    ImageButton imgButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity3);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                mTextView = (TextView) stub.findViewById(R.id.text);
                ImageButton img = (ImageButton) stub.findViewById(R.id.imageButton1);
                img.setImageResource(R.drawable.cestacompra);
                ImageButton img2 = (ImageButton) stub.findViewById(R.id.imageButton2);
                img2.setImageResource(R.drawable.entrepans);
                ImageButton img3 = (ImageButton) stub.findViewById(R.id.imageButton3);
                img3.setImageResource(R.drawable.begudes);
                ImageButton img4 = (ImageButton) stub.findViewById(R.id.imageButton4);
                img4.setImageResource(R.drawable.snacks);


                addButtonListener();
                addButtonListener2();
                addButtonListener3();
                addButtonListener4();

            }
        });
    }

    public void addButtonListener4() {

        imgButton = (ImageButton) findViewById(R.id.imageButton1);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent2;
                        intent2 = new Intent(MyActivity3.this, MyActivity5.class);
                        startActivity(intent2);
                    }
                });

            }
        });
    }

    public void addButtonListener() {

        imgButton = (ImageButton) findViewById(R.id.imageButton3);
        imgButton.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent2 = new Intent(MyActivity3.this, MyActivity4.class);
                        MyActivity3.this.startActivity(intent2);
                    }
                });

            }
        });
    }

    public void addButtonListener2() {

        imgButton = (ImageButton) findViewById(R.id.imageButton2);
        imgButton.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MyActivity3.this, MyActivity6.class);
                startActivity(intent);
                //      Toast.makeText(MyActivity.this, "ImageButton is working!", Toast.LENGTH_LONG).show();
            }
        });
    }
    public void addButtonListener3() {

        imgButton = (ImageButton) findViewById(R.id.imageButton4);
        imgButton.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MyActivity3.this, MyActivity7.class);
                startActivity(intent);
                //      Toast.makeText(MyActivity.this, "ImageButton is working!", Toast.LENGTH_LONG).show();
            }
        });
    }

}
