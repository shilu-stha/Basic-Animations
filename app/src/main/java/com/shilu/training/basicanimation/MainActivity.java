package com.shilu.training.basicanimation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tweenAnimXml(View view) {
        startActivity(new Intent(MainActivity.this, SimpleAnimation.class));
    }

    public void tweenAnimJava(View view) {
        startActivity(new Intent(MainActivity.this, SimpleAnimFromJavaActivity.class));
    }

    public void frameAnim(View view) {
        startActivity(new Intent(MainActivity.this, FrameAnimActivity.class));
    }
}
