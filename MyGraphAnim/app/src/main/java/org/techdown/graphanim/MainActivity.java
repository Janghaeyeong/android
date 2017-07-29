package org.techdown.graphanim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;
    ProgressBar progressBar2;
    ProgressBar progressBar3;

    Animation grow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar2 = (ProgressBar) findViewById(R.id.progressBar2);
        progressBar3 = (ProgressBar) findViewById(R.id.progressBar3);

        grow = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.grow);
        progressBar.setAnimation(grow);
        progressBar2.setAnimation(grow);
        progressBar3.setAnimation(grow);

        /*
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grow.start();
            }
        });*/




    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {

        if (hasFocus) {
            grow.start();
        }else {
            grow.reset();
        }

    }
}
