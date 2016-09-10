package com.shilu.training.basicanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class AnimImageViewActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim_image_view);

        imageView = (ImageView) findViewById(R.id.iv_anim);

        imageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                zoom();
                return false;
            }
        });
    }

    private void zoom() {
//        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
//        imageView.startAnimation(animation);
    }
}
