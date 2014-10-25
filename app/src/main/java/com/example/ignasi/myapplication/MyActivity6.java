package com.example.ignasi.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.widget.ImageButton;
import android.widget.TextView;

public class MyActivity6 extends Activity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity6);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                mTextView = (TextView) stub.findViewById(R.id.text);
                ImageButton img = (ImageButton) stub.findViewById(R.id.imageButton1);
                img.setImageResource(R.drawable.botifarra);
                ImageButton img2 = (ImageButton) stub.findViewById(R.id.imageButton2);
                img2.setImageResource(R.drawable.burger);
                ImageButton img3 = (ImageButton) stub.findViewById(R.id.imageButton3);
                img3.setImageResource(R.drawable.hotdog);
                ImageButton img4 = (ImageButton) stub.findViewById(R.id.imageButton4);
                img4.setImageResource(R.drawable.pernil);
            }
        });
    }
}
