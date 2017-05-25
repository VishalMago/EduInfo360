package com.ace.vishal.edu_info360;

import android.content.Intent;
import android.hardware.camera2.params.Face;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class FaceDev extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facedevv);

        TextView t1 = (TextView)findViewById(R.id.textView2);
        t1.isClickable();
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FaceDev.this, facdev.class);
                FaceDev.this.startActivity(i);
            }
        });

        TextView textViewd =(TextView)findViewById(R.id.textView4);
        textViewd.setClickable(true);
        textViewd.setMovementMethod(LinkMovementMethod.getInstance());
        String textd = "<a href='http://www.ugcfrp.ac.in/'>Faculty Reacharge Program</a>";
        textViewd.setText(Html.fromHtml(textd));


    }
}
