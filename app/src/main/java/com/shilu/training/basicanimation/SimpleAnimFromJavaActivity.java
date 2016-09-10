package com.shilu.training.basicanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

public class SimpleAnimFromJavaActivity extends AppCompatActivity implements Animation.AnimationListener {

    ImageView ivAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_anim_from_java);
        ivAnimation = (ImageView) findViewById(R.id.iv_anim);
    }

    public void rotate(View view) {
        Animation animation = new RotateAnimation(0.0f, 180f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setDuration(1000);
        animation.setAnimationListener(this);
        ivAnimation.startAnimation(animation);
    }

    public void scale(View view) {
        Animation animation = new ScaleAnimation(1.0f, 1.5f,
                1.0f, 1.5f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setDuration(1000);
        animation.setAnimationListener(this);
        ivAnimation.startAnimation(animation);
    }

    public void translate(View view) {
        Animation animation = new TranslateAnimation(
                Animation.ABSOLUTE, 0.0f,
                Animation.ABSOLUTE, 120.0f,
                Animation.ABSOLUTE, 0.0f,
                Animation.ABSOLUTE, 0.0f);
        animation.setDuration(1000);
        animation.setAnimationListener(this);
        ivAnimation.startAnimation(animation);
    }

    public void alpha(View view) {
        Animation animation = new AlphaAnimation(1.0f, 0.0f);
        animation.setDuration(1000);
        animation.setAnimationListener(this);
        ivAnimation.startAnimation(animation);
    }

    public void custom(View view) {
        /*Animation animation = new ScaleAnimation(1.0f, 1.5f,
                1.0f, 1.5f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setDuration(1000);
        animation.setAnimationListener(this);
        ivAnimation.startAnimation(animation);
        animation = new RotateAnimation(0.0f, 360f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setDuration(1000);
        animation.setAnimationListener(this);
        ivAnimation.startAnimation(animation);*/
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
