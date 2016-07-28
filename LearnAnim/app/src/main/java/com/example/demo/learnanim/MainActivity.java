package com.example.demo.learnanim;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text)
    protected ImageView mImageView;
    private Animator mAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
    }

    @Override
    protected void onResume() {
        super.onResume();
        changeImage();
    }

    private void init() {
        mAnimator = AnimatorInflater.loadAnimator(this, R.anim.property_animator);
        mAnimator.setTarget(mImageView);
    }

    private void changeImage() {
        mAnimator.start();
    }
}
