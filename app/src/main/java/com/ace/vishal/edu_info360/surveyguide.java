package com.ace.vishal.edu_info360;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

/**
 * Created by hp on 4/1/2017.
 */
public class surveyguide extends AppCompatActivity implements View.OnClickListener {
    TextView sg1;
    TextView sg2;
    TextView sg3;
    TextView sg4;
    TextView sg5;
    TextView sg6;
    TextView sg7;
    TextView sg8;
    TextView sg9;
    TextView sg10;
    TextView sg11;
    TextView sg12;
    TextView sg13;
    TextView sg14;
    TextView sg15;
    TextView sg16;
    TextView sg17;
    TextView sg18;
    TextView sg19;
    TextView sg20;
    TextView sg21;
    TextView sg22;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instsurvey_guide);
        sg1 = (TextView) findViewById(R.id.sg1);
        sg1.setOnClickListener(this);
        sg2 = (TextView) findViewById(R.id.sg2);
        sg2.setOnClickListener(this);
        sg3 = (TextView) findViewById(R.id.sg3);
        sg3.setOnClickListener(this);
        sg4 = (TextView) findViewById(R.id.sg4);
        sg4.setOnClickListener(this);
        sg5 = (TextView) findViewById(R.id.sg5);
        sg5.setOnClickListener(this);
        sg6 = (TextView) findViewById(R.id.sg6);
        sg6.setOnClickListener(this);
        sg7 = (TextView) findViewById(R.id.sg7);
        sg7.setOnClickListener(this);
        sg8 = (TextView) findViewById(R.id.sg8);
        sg8.setOnClickListener(this);
        sg9 = (TextView) findViewById(R.id.sg9);
        sg9.setOnClickListener(this);
        sg10 = (TextView) findViewById(R.id.sg10);
        sg10.setOnClickListener(this);
        sg11 = (TextView) findViewById(R.id.sg11);
        sg11.setOnClickListener(this);
        sg12 = (TextView) findViewById(R.id.sg12);
        sg12.setOnClickListener(this);
        sg13 = (TextView) findViewById(R.id.sg13);
        sg13.setOnClickListener(this);
        sg14 = (TextView) findViewById(R.id.sg14);
        sg14.setOnClickListener(this);
        sg15 = (TextView) findViewById(R.id.sg15);
        sg15.setOnClickListener(this);
        sg16 = (TextView) findViewById(R.id.sg16);
        sg16.setOnClickListener(this);
        sg17 = (TextView) findViewById(R.id.sg17);
        sg17.setOnClickListener(this);
        sg18 = (TextView) findViewById(R.id.sg18);
        sg18.setOnClickListener(this);
        sg19 = (TextView) findViewById(R.id.sg19);
        sg19.setOnClickListener(this);
        sg20 = (TextView) findViewById(R.id.sg20);
        sg20.setOnClickListener(this);
        sg21 = (TextView) findViewById(R.id.sg21);
        sg21.setOnClickListener(this);
        sg22 = (TextView) findViewById(R.id.sg22);
        sg22.setOnClickListener(this);

    }

    public void onClick(View v) {
            TextView textView = (TextView) findViewById(R.id.sg1);
            textView.setClickable(true);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            String text1 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=221'>•Guidelines to fill Teacher Information Format(TIF)</a>";
            textView.setText(Html.fromHtml(text1));

             TextView textView2 = (TextView) findViewById(R.id.sg2);
            textView2.setClickable(true);
             textView2.setMovementMethod(LinkMovementMethod.getInstance());
            String text2 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=217'>•Steps to upload data on AISHE portal from 2016-17 onwards</a>";
            textView2.setText(Html.fromHtml(text2));

        TextView textView3 = (TextView) findViewById(R.id.sg3);
        textView3.setClickable(true);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        String text3 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=220'>•Quick Reference Guide</a>";
        textView3.setText(Html.fromHtml(text3));

        TextView textView4 = (TextView) findViewById(R.id.sg4);
        textView4.setClickable(true);
        textView4.setMovementMethod(LinkMovementMethod.getInstance());
        String text4 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=175'>•Instruction Manual 2014-15</a>";
        textView4.setText(Html.fromHtml(text4));

        TextView textView5 = (TextView) findViewById(R.id.sg5);
        textView5.setClickable(true);
        textView5.setMovementMethod(LinkMovementMethod.getInstance());
        String text5 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=13'>•User Manual</a>";
        textView5.setText(Html.fromHtml(text5));

        TextView textView6 = (TextView) findViewById(R.id.sg6);
        textView6.setClickable(true);
        textView6.setMovementMethod(LinkMovementMethod.getInstance());
        String text6 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=184'>•Guidelines for Addition of Colleges/Stand Alone Institutions on AISHE portal</a>";
        textView6.setText(Html.fromHtml(text6));

        TextView textView7 = (TextView) findViewById(R.id.sg7);
        textView7.setClickable(true);
        textView7.setMovementMethod(LinkMovementMethod.getInstance());
        String text7 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=31'>•Guidelines for University</a>";
        textView7.setText(Html.fromHtml(text7));

        TextView textView8 = (TextView) findViewById(R.id.sg8);
        textView8.setClickable(true);
        textView8.setMovementMethod(LinkMovementMethod.getInstance());
        String text8 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=30'>•Guidelines for State Coordinating Agency</a>";
        textView8.setText(Html.fromHtml(text8));

        TextView textView9 = (TextView) findViewById(R.id.sg9);
        textView9.setClickable(true);
        textView9.setMovementMethod(LinkMovementMethod.getInstance());
        String text9 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=14'>•Guidelines for Colleges and Institutions</a>";
        textView9.setText(Html.fromHtml(text9));

        TextView textView10 = (TextView) findViewById(R.id.sg10);
        textView10.setClickable(true);
        textView10.setMovementMethod(LinkMovementMethod.getInstance());
        String text10 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=29'>•Guidelines for Stand Alone Institutions</a>";
        textView10.setText(Html.fromHtml(text10));

        TextView textView11 = (TextView) findViewById(R.id.sg11);
        textView11.setClickable(true);
        textView11.setMovementMethod(LinkMovementMethod.getInstance());
        String text11 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=21'>•Guidelines for Other State Coordinating Agency</a>";
        textView11.setText(Html.fromHtml(text11));

        TextView textView12 = (TextView) findViewById(R.id.sg12);
        textView12.setClickable(true);
        textView12.setMovementMethod(LinkMovementMethod.getInstance());
        String text12 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=43'>•Guidelines to fill large DCF-I</a>";
        textView12.setText(Html.fromHtml(text12));

        TextView textView13 = (TextView) findViewById(R.id.sg13);
        textView13.setClickable(true);
        textView13.setMovementMethod(LinkMovementMethod.getInstance());
        String text13 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=171'>•Guidelines for correcting Inconsistency</a>";
        textView13.setText(Html.fromHtml(text13));

        TextView textView14 = (TextView) findViewById(R.id.sg14);
        textView14.setClickable(true);
        textView14.setMovementMethod(LinkMovementMethod.getInstance());
        String text14 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=40'>•New Scheme HESPIS</a>";
        textView14.setText(Html.fromHtml(text14));

        TextView textView15 = (TextView) findViewById(R.id.sg15);
        textView15.setClickable(true);
        textView15.setMovementMethod(LinkMovementMethod.getInstance());
        String text15 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=41'>•Remuneration Norm AISHE</a>";
        textView15.setText(Html.fromHtml(text15));

        TextView textView16 = (TextView) findViewById(R.id.sg16);
        textView16.setClickable(true);
        textView16.setMovementMethod(LinkMovementMethod.getInstance());
        String text16 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=142'>•Scrutiny Programme AISHE</a>";
        textView16.setText(Html.fromHtml(text16));

        TextView textView17 = (TextView) findViewById(R.id.sg17);
        textView17.setClickable(true);
        textView17.setMovementMethod(LinkMovementMethod.getInstance());
        String text17 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=45'>•Remuneration Troubleshooting Manual</a>";
        textView17.setText(Html.fromHtml(text17));

        TextView textView18 = (TextView) findViewById(R.id.sg18);
        textView18.setClickable(true);
        textView18.setMovementMethod(LinkMovementMethod.getInstance());
        String text18 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=181'>•Guidelines for Data User Registration</a>";
        textView18.setText(Html.fromHtml(text18));

        TextView textView19 = (TextView) findViewById(R.id.sg19);
        textView19.setClickable(true);
        textView19.setMovementMethod(LinkMovementMethod.getInstance());
        String text19 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=182'>•Details of Reports available for Data User</a>";
        textView19.setText(Html.fromHtml(text19));

        TextView textView20 = (TextView) findViewById(R.id.sg20);
        textView20.setClickable(true);
        textView20.setMovementMethod(LinkMovementMethod.getInstance());
        String text20 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=178'>•Instruction Manual 2010-11</a>";
        textView20.setText(Html.fromHtml(text20));

        TextView textView21 = (TextView) findViewById(R.id.sg21);
        textView21.setClickable(true);
        textView21.setMovementMethod(LinkMovementMethod.getInstance());
        String text21 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=177'>•Instruction Manual 2011-12 and 2012-13</a>";
        textView21.setText(Html.fromHtml(text21));

        TextView textView22 = (TextView) findViewById(R.id.sg22);
        textView22.setClickable(true);
        textView22.setMovementMethod(LinkMovementMethod.getInstance());
        String text22 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=176'>•Instruction Manual-Other minority(DCF-IV)</a>";
        textView22.setText(Html.fromHtml(text22));
    }
}

