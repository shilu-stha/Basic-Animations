package com.shilu.training.basicanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

public class SimpleAnimFromJavaActivity extends AppCompatActivity implements Animation.AnimationListener {

    ImageView ivAnimation;
    Animation rotateAnimation;
    Animation scaleAnimation;
    Animation translateAnimation;
    Animation alphaAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_anim_from_java);
        ivAnimation = (ImageView) findViewById(R.id.iv_anim);
    }

    public void rotate(View view) {
        rotateAnimation = new RotateAnimation(0.0f, 180f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setDuration(1000);
        rotateAnimation.setAnimationListener(this);
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setRepeatMode(Animation.REVERSE);
        ivAnimation.startAnimation(rotateAnimation);
    }

    public void scale(View view) {
        scaleAnimation = new ScaleAnimation(1.0f, 1.5f,
                1.0f, 1.5f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        scaleAnimation.setDuration(1000);
        scaleAnimation.setRepeatCount(1);
        scaleAnimation.setRepeatMode(Animation.REVERSE);
        scaleAnimation.setAnimationListener(this);
        ivAnimation.startAnimation(scaleAnimation);
    }

    public void translate(View view) {
        translateAnimation = new TranslateAnimation(
                Animation.ABSOLUTE, 0.0f,
                Animation.ABSOLUTE, 120.0f,
                Animation.ABSOLUTE, 0.0f,
                Animation.ABSOLUTE, 0.0f);
        translateAnimation.setDuration(1000);
        translateAnimation.setAnimationListener(this);
        translateAnimation.setRepeatMode(Animation.REVERSE);
        translateAnimation.setRepeatCount(1);
        ivAnimation.startAnimation(translateAnimation);
    }

    public void alpha(View view) {
        alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1000);
        alphaAnimation.setRepeatCount(1);
        alphaAnimation.setRepeatMode(Animation.REVERSE);
        alphaAnimation.setAnimationListener(this);
        ivAnimation.startAnimation(alphaAnimation);
    }

    public void custom(View view) {
        AnimationSet animationSet = new AnimationSet(true);

        animationSet.setFillAfter(true);
        scaleAnimation = new ScaleAnimation(1.0f, 2.0f,
                1.0f, 2.0f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        scaleAnimation.setDuration(600);

        rotateAnimation = new RotateAnimation(0.0f, 360f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setStartOffset(600);
        rotateAnimation.setDuration(600);

        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(rotateAnimation);
        ivAnimation.startAnimation(animationSet);
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
