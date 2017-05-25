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
public class dbtscholar extends AppCompatActivity implements View.OnClickListener {

    TextView dbt1;
    TextView dbt2;
    TextView dbt4;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instdbt_scholarship);
        dbt1 = (TextView) findViewById(R.id.dbt1);
        dbt1.setOnClickListener(this);
        dbt2 = (TextView) findViewById(R.id.dbt2);
        dbt2.setOnClickListener(this);
        dbt4 = (TextView) findViewById(R.id.dbt4);
        dbt4.setOnClickListener(this);
    }

    public void onClick(View v) {
        TextView textView = (TextView) findViewById(R.id.dbt1);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        String text1 = "<a href='http://www.aicte-india.org/downloads/User_Manual_of_PG_Scholarship_for_Institutions_12_11_2013.pdf#toolbar=0'>•Instructions for Institutes</a>";
        textView.setText(Html.fromHtml(text1));

        TextView textView2 = (TextView) findViewById(R.id.dbt2);
        textView2.setClickable(true);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        String text2 = "<a href='http://www.aicte-india.org/downloads/Student%20User%20Manual.pdf'>•Help Manual for Student Import Facility</a>";
        textView2.setText(Html.fromHtml(text2));


        TextView textView4 = (TextView) findViewById(R.id.dbt4);
        textView4.setClickable(true);
        textView4.setMovementMethod(LinkMovementMethod.getInstance());
        String text4 = "<a href='http://www.aicte-india.org/downloads/gate_gpat.pdf'>• Notification regarding GATE/GPAT Scholarship.</a>";
        textView4.setText(Html.fromHtml(text4));
    }
}
