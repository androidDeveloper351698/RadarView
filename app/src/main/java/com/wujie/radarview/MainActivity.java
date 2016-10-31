package com.wujie.radarview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    RadarView mRadarView;
    private Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRadarView = (RadarView) findViewById(R.id.radar_view);
        mRadarView.start();
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                mRadarView.stop();
                mRadarView.setStart(0);
                mRadarView.setStopRoate(true);
                mRadarView.setCodeangel(160);
                mRadarView.start();
            }
        }, 4000);

//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                mRadarView.stop();
//            }
//        }, 3000);
    }
}