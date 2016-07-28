package com.example.demo.learnanim;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text)
    protected ImageView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        changeText();
    }

    private void changeText() {
        Animator animator = AnimatorInflater.loadAnimator(this, R.anim.property_animator);
        animator.setTarget(mTextView);
        animator.start();
    }
}
