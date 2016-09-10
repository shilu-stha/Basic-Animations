package com.shilu.training.basicanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

import java.util.Calendar;

public class ClockAnimActivity extends AppCompatActivity {

    ImageView ivHourHand;
    ImageView ivMinuteHand;
    ImageView ivSecondHand;
    private Calendar calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock_anim);

        ivHourHand = (ImageView) findViewById(R.id.iv_hour_hand);
        ivMinuteHand = (ImageView) findViewById(R.id.iv_minute_hand);
        ivSecondHand = (ImageView) findViewById(R.id.iv_second_hand);

        calendar = Calendar.getInstance();

//        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
//        ivSecondHand.startAnimation(animation);
        ivSecondHand.animate()
                .setDuration(1000)
                .rotation((360f / 60f) * calendar.get(Calendar.SECOND))
                .rotationY(10f)
                .setInterpolator(new LinearInterpolator());
//        ivMinuteHand.animate()
//                .setDuration(1000)
//                .rotation((360f / 60f) * calendar.get(Calendar.MINUTE))
//                .setInterpolator(new LinearInterpolator());
//        ivHourHand.animate()
//                .setDuration(1000)
//                .rotation((360f / 60f) * calendar.get(Calendar.HOUR))
//                .setInterpolator(new LinearInterpolator());
    }
}
