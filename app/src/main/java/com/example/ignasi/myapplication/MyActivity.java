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

public class MyActivity extends Activity {

    private TextView mTextView;
    ImageButton imgButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
               // mTextView = (TextView) stub.findViewById(R.id.textView);
                ImageButton img = (ImageButton) stub.findViewById(R.id.imageButton2);
                img.setImageResource(R.drawable.barca);
                ImageButton img2 = (ImageButton) stub.findViewById(R.id.imageButton5);
                img2.setImageResource(R.drawable.espanyol);
                ImageButton img3 = (ImageButton) stub.findViewById(R.id.imageButton3);
                img3.setImageResource(R.drawable.cap);
                ImageButton img4 = (ImageButton) stub.findViewById(R.id.imageButton6);
                img4.setImageResource(R.drawable.formula);
                ImageButton img5 = (ImageButton) stub.findViewById(R.id.imageButton4);
                img5.setImageResource(R.drawable.joventut);
                ImageButton img6 = (ImageButton) stub.findViewById(R.id.imageButton7);
                img6.setImageResource(R.drawable.palau);
                ImageButton img7 = (ImageButton) stub.findViewById(R.id.imageButton8);
                img7.setImageResource(R.drawable.moto);

                addButtonListener();

                Timer t = new Timer();
                t.scheduleAtFixedRate(new TimerTask() {

                                          @Override
                                          public void run() {
                                              final WatchViewStub stub1 = (WatchViewStub) findViewById(R.id.watch_view_stub);
                                              HorizontalScrollView scrollview1 = (HorizontalScrollView) stub1.findViewById(R.id.scrollView2);
                                              mTextView = (TextView) stub1.findViewById(R.id.textView);
                                              if((scrollview1.getScrollX()>190)&&(scrollview1.getScrollX()<380)){
                                                  runOnUiThread(new Runnable() {
                                                      @Override
                                                      public void run() {
                                                          final WatchViewStub stub1 = (WatchViewStub) findViewById(R.id.watch_view_stub);
                                                          HorizontalScrollView scrollview1 = (HorizontalScrollView) stub1.findViewById(R.id.scrollView2);
                                                          mTextView = (TextView) stub1.findViewById(R.id.textView);
                                                          scrollview1.setBackgroundColor(0xFF194777);
                                                          mTextView.setText("COMPRATS");
                                                      }
                                                  });
                                              }
                                              if((scrollview1.getScrollX()>=380)){
                                                  runOnUiThread(new Runnable() {
                                                      @Override
                                                      public void run() {
                                                          final WatchViewStub stub1 = (WatchViewStub) findViewById(R.id.watch_view_stub);
                                                          HorizontalScrollView scrollview1 = (HorizontalScrollView) stub1.findViewById(R.id.scrollView2);
                                                          mTextView = (TextView) stub1.findViewById(R.id.textView);
                                                          scrollview1.setBackgroundColor(0xFF14385E);
                                                          mTextView.setText("DISCOVER");
                                                      }
                                                  });
                                              }
                                              if((scrollview1.getScrollX()<=190)){
                                                  runOnUiThread(new Runnable() {
                                                      @Override
                                                      public void run() {
                                                          final WatchViewStub stub1 = (WatchViewStub) findViewById(R.id.watch_view_stub);
                                                          HorizontalScrollView scrollview1 = (HorizontalScrollView) stub1.findViewById(R.id.scrollView2);
                                                          mTextView = (TextView) stub1.findViewById(R.id.textView);
                                                          scrollview1.setBackgroundColor(0xFF1E5997);
                                                          mTextView.setText("PREFERIDA");
                                                      }
                                                  });
                                              }

                                          }

                                      },
                        0,
                        100);

            }

            
        });
    }
    private void updateTextView() {
        final WatchViewStub stub1 = (WatchViewStub) findViewById(R.id.watch_view_stub);
        HorizontalScrollView scrollview1 = (HorizontalScrollView) stub1.findViewById(R.id.scrollView2);
        mTextView = (TextView) stub1.findViewById(R.id.textView);
        scrollview1.setBackgroundColor(0xFF00FF00);
        //  mTextView.setText("PREFERIDA");
        //  RelativeLayout layout = (RelativeLayout) findViewById(R.id.relative);
        setContentView(R.layout.activity_my);
    }
    public void addButtonListener() {

        imgButton = (ImageButton) findViewById(R.id.imageButton2);
        imgButton.setOnClickListener (new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyActivity.this, MyActivity2.class);
                startActivity(intent);
          //      Toast.makeText(MyActivity.this, "ImageButton is working!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
