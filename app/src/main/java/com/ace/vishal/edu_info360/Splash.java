package com.ace.vishal.edu_info360;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by Hp on 10/17/2016.
 */
public class Splash extends Activity {
    ImageView logo;

    protected void onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_splash);
        logo=(ImageView)findViewById(R.id.logo);
        Animation an1=AnimationUtils.loadAnimation(this,R.anim.slide_up);
        logo.startAnimation(an1);
        Thread timer=new Thread(){
            public void run(){
                try{
                    sleep(3000);

                }catch ( InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent i=new Intent(Splash.this,Login.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();
    }
}
