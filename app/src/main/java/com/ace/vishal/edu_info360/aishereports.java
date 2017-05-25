package com.ace.vishal.edu_info360;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

/**
 * Created by hp on 4/1/2017.
 */
public class aishereports extends AppCompatActivity implements View.OnClickListener {

    TextView rep1;
    TextView rep2;
    TextView rep3;
    TextView rep4;
    TextView rep5;
    TextView rep6;
    TextView rep7;
    TextView rep8;
    TextView rep9;
    TextView rep10;
    TextView rep11;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inst_aisherep);
        rep1 = (TextView) findViewById(R.id.rep1);
        rep1.setOnClickListener(this);
        rep2 = (TextView) findViewById(R.id.rep2);
        rep2.setOnClickListener(this);
        rep3 = (TextView) findViewById(R.id.rep3);
        rep3.setOnClickListener(this);
        rep4 = (TextView) findViewById(R.id.rep4);
        rep4.setOnClickListener(this);
        rep5 = (TextView) findViewById(R.id.rep5);
        rep5.setOnClickListener(this);
        rep6 = (TextView) findViewById(R.id.rep6);
        rep6.setOnClickListener(this);
        rep7 = (TextView) findViewById(R.id.rep7);
        rep7.setOnClickListener(this);
        rep8 = (TextView) findViewById(R.id.rep8);
        rep8.setOnClickListener(this);
        rep9 = (TextView) findViewById(R.id.rep9);
        rep9.setOnClickListener(this);
        rep10 = (TextView) findViewById(R.id.rep10);
        rep10.setOnClickListener(this);
        rep11 = (TextView) findViewById(R.id.rep11);
        rep11.setOnClickListener(this);
    }

    public void onClick(View v) {
        TextView textView = (TextView) findViewById(R.id.rep1);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        String text1 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=227'>•AISHE Final Report 2015-16</a>";
        textView.setText(Html.fromHtml(text1));

        TextView textView2 = (TextView) findViewById(R.id.rep2);
        textView2.setClickable(true);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        String text2 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=206'>•AISHE Final Report 2014-15</a>";
        textView2.setText(Html.fromHtml(text2));

        TextView textView3 = (TextView) findViewById(R.id.rep3);
        textView3.setClickable(true);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        String text3 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=196'>•AISHE Final Report 2013-14</a>";
        textView3.setText(Html.fromHtml(text3));

        TextView textView4 = (TextView) findViewById(R.id.rep4);
        textView4.setClickable(true);
        textView4.setMovementMethod(LinkMovementMethod.getInstance());
        String text4 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=204'>•HIGHER EDUCATION STATISTICS AT A GLANCE</a>";
        textView4.setText(Html.fromHtml(text4));

        TextView textView5 = (TextView) findViewById(R.id.rep5);
        textView5.setClickable(true);
        textView5.setMovementMethod(LinkMovementMethod.getInstance());
        String text5 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=194'>•AISHE Final Report 2012-13</a>";
        textView5.setText(Html.fromHtml(text5));

        TextView textView6 = (TextView) findViewById(R.id.rep6);
        textView6.setClickable(true);
        textView6.setMovementMethod(LinkMovementMethod.getInstance());
        String text6 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=162'>•AISHE Final Report 2011-12</a>";
        textView6.setText(Html.fromHtml(text6));

        TextView textView7 = (TextView) findViewById(R.id.rep7);
        textView7.setClickable(true);
        textView7.setMovementMethod(LinkMovementMethod.getInstance());
        String text7 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=173'>•Status of International Students in India for Higher Education</a>";
        textView7.setText(Html.fromHtml(text7));

        TextView textView8 = (TextView) findViewById(R.id.rep8);
        textView8.setClickable(true);
        textView8.setMovementMethod(LinkMovementMethod.getInstance());
        String text8 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=122'>•Pilot Report</a>";
        textView8.setText(Html.fromHtml(text8));

        TextView textView9 = (TextView) findViewById(R.id.rep9);
        textView9.setClickable(true);
        textView9.setMovementMethod(LinkMovementMethod.getInstance());
        String text9 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=125'>•Main Report-2010-11</a>";
        textView9.setText(Html.fromHtml(text9));

        TextView textView10 = (TextView) findViewById(R.id.rep10);
        textView10.setClickable(true);
        textView10.setMovementMethod(LinkMovementMethod.getInstance());
        String text10 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=228'>•Response in AISHE 2016-17</a>";
        textView10.setText(Html.fromHtml(text10));

        TextView textView11 = (TextView) findViewById(R.id.rep11);
        textView11.setClickable(true);
        textView11.setMovementMethod(LinkMovementMethod.getInstance());
        String text11 = "<a href='http://aishe.nic.in/aishe/viewDocument.action?documentId=174'>•Indian Standard Classification of Education 2014</a>";
        textView11.setText(Html.fromHtml(text11));

    }
}
