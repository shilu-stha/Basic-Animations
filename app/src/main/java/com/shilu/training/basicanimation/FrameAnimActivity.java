package com.shilu.training.basicanimation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class FrameAnimActivity extends AppCompatActivity {

    ImageView ivFrameAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_anim);

        ivFrameAnim = (ImageView) findViewById(R.id.iv_frame_anim);
        ivFrameAnim.setBackgroundResource(R.drawable.frame_anim);

        AnimationDrawable frameAnimation = (AnimationDrawable) ivFrameAnim.getBackground();
        frameAnimation.start();
    }

   /* public void startAnimation(View view) {
        ivFrameAnim.setBackgroundResource(R.drawable.frame_anim);

        AnimationDrawable frameAnimation = (AnimationDrawable) ivFrameAnim.getBackground();

        frameAnimation.start();
    }*/
}
