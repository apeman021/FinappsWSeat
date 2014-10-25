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

public class MyActivity5 extends Activity {

    private TextView mTextView;
    ImageButton imgButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity5);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                ImageButton img4 = (ImageButton) stub.findViewById(R.id.imageButton3);
                img4.setImageResource(R.drawable.carrito);
                addButtonListener();
            }
        });
    }

    public void addButtonListener() {

        imgButton = (ImageButton) findViewById(R.id.imageButton3);
        imgButton.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MyActivity5.this, "Comanda Realitzada amb Exit", Toast.LENGTH_LONG).show();
            }
        });
    }
}
