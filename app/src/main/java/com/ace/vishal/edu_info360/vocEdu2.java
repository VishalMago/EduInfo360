package com.ace.vishal.edu_info360;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class vocEdu2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.voc_edu2);

        TextView link1= (TextView) findViewById(R.id.link1);
        link1.setClickable(true);
        link1.setMovementMethod(LinkMovementMethod.getInstance());
        String text1 = "<a href='http://www.aicte-india.org/downloads/L_1_Language.pdf'>Level 1 Language</a>";
        link1.setText(Html.fromHtml(text1));

        TextView link2= (TextView) findViewById(R.id.link2);
        link2.setClickable(true);
        link2.setMovementMethod(LinkMovementMethod.getInstance());
        String text2 = "<a href='http://www.aicte-india.org/downloads/L_2_Language.pdf'>Level 2 Language</a>";
        link2.setText(Html.fromHtml(text2));

        TextView link3= (TextView) findViewById(R.id.link3);
        link3.setClickable(true);
        link3.setMovementMethod(LinkMovementMethod.getInstance());
        String text3 = "<a href='http://www.aicte-india.org/downloads/L_3_Language.pdf'>Level 3 Language</a>";
        link3.setText(Html.fromHtml(text3));

        TextView link4= (TextView) findViewById(R.id.link4);
        link4.setClickable(true);
        link4.setMovementMethod(LinkMovementMethod.getInstance());
        String text4 = "<a href='http://www.aicte-india.org/downloads/L_4_Language.pdf'>Level 4 Language</a>";
        link4.setText(Html.fromHtml(text4));

        TextView link5= (TextView) findViewById(R.id.link5);
        link5.setClickable(true);
        link5.setMovementMethod(LinkMovementMethod.getInstance());
        String text5 = "<a href='http://www.aicte-india.org/downloads/L_1_General_Ed.pdf'>Level 1 General Education</a>";
        link5.setText(Html.fromHtml(text5));
    }
}

