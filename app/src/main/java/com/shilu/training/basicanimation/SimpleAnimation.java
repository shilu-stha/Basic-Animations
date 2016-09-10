package com.shilu.training.basicanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class SimpleAnimation extends AppCompatActivity implements Animation.AnimationListener {

    ImageView ivAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_animation);
        ivAnimation = (ImageView) findViewById(R.id.iv_anim);

    }

    public void rotate(View view) {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
        animation.setAnimationListener(this);
        ivAnimation.startAnimation(animation);
    }

    public void scale(View view) {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
        animation.setAnimationListener(this);
        ivAnimation.startAnimation(animation);
    }

    public void translate(View view) {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate);
        animation.setAnimationListener(this);
        ivAnimation.startAnimation(animation);
    }

    public void alpha(View view) {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
        animation.setAnimationListener(this);
        ivAnimation.startAnimation(animation);
    }

    public void custom(View view) {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.custom);
        animation.setAnimationListener(this);
        ivAnimation.startAnimation(animation);
    }


    @Override
    public void onAnimationStart(Animation animation) {
        Toast.makeText(this, "Animation Started", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Toast.makeText(this, "Animation Ended", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {
        Toast.makeText(this, "Animation Repeated", Toast.LENGTH_SHORT).show();
    }
}
