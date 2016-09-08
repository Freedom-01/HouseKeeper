package cn.feicui.com.myapplication;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView vi = (ImageView)findViewById(R.id.iv1);
        AnimatorSet anim = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.anim);
        anim.setTarget(vi);
        anim.start();
    }
}
