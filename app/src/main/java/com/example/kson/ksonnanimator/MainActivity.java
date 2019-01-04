package com.example.kson.ksonnanimator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"点击了",Toast.LENGTH_SHORT).show();
            }
        });


    }

    /**
     * 移动
     * @param view
     */
    public void animate(View view) {

//        DisplayMetrics dm = getResources().getDisplayMetrics();
//        int width = dm.widthPixels;
//        int height3 = dm.heightPixels;
////        Animation animation = new TranslateAnimation(0,500,0,0);
////        animation.setDuration(2000);
////        animation.setFillAfter(true);
////        btn.startAnimation(animation);
//
//        //渐变，alpha
//        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(btn,"alpha",1,0);
////        objectAnimator1.setDuration(2000);
////        objectAnimator1.setRepeatCount(1);//-1 无限
////        objectAnimator1.start();
//        objectAnimator1.addListener(new AnimatorListenerAdapter() {
//            @Override
//            public void onAnimationCancel(Animator animation) {
//                super.onAnimationCancel(animation);
//            }
//
//            @Override
//            public void onAnimationEnd(Animator animation) {
//                super.onAnimationEnd(animation);
//            }
//
//            @Override
//            public void onAnimationRepeat(Animator animation) {
//                super.onAnimationRepeat(animation);
//            }
//
//            @Override
//            public void onAnimationStart(Animator animation) {
//                super.onAnimationStart(animation);
//            }
//
//            @Override
//            public void onAnimationPause(Animator animation) {
//                super.onAnimationPause(animation);
//            }
//
//            @Override
//            public void onAnimationResume(Animator animation) {
//                super.onAnimationResume(animation);
//            }
//        });
//
//        objectAnimator1.addListener(new Animator.AnimatorListener() {
//            @Override
//            public void onAnimationStart(Animator animation) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animator animation) {
//
//            }
//
//            @Override
//            public void onAnimationCancel(Animator animation) {
//
//            }
//
//            @Override
//            public void onAnimationRepeat(Animator animation) {
//
//            }
//        });
//
//        //移动
//        ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(btn,"translationX",0,200);
//
////        objectAnimator2.setDuration(2000);
////        objectAnimator2.start();
//
//        //动画集合
//        AnimatorSet set = new AnimatorSet();
//        set.play(objectAnimator1).with(objectAnimator2);
//        set.setDuration(5000);
//        set.start();
//
//
//        set.addListener(new Animator.AnimatorListener() {
//            @Override
//            public void onAnimationStart(Animator animation) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animator animation) {
//
//            }
//
//            @Override
//            public void onAnimationCancel(Animator animation) {
//
//            }
//
//            @Override
//            public void onAnimationRepeat(Animator animation) {
//
//            }
//        });


        ValueAnimator valueAnimator = ValueAnimator.ofInt(0,1000);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int animatedValue = (int) animation.getAnimatedValue();
                System.out.println("iiiiiiii"+animatedValue);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) btn.getLayoutParams();
                marginLayoutParams.leftMargin = animatedValue;
                btn.setLayoutParams(marginLayoutParams);
            }
        });

        valueAnimator.setDuration(2000);
        valueAnimator.start();





    }
}
