package com.ace.vishal.edu_info360;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class scholarshipStud  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scholarship);


        TextView disable = (TextView) findViewById(R.id.disable);
        disable.setClickable(true);
        disable.setMovementMethod(LinkMovementMethod.getInstance());
        String text1 = "<a href='http://www.aicte-india.org/downloads/NHFDC_Faridabad.pdf#toolbar=0'>Scholarships for Students with Special Abilities</a>";
        disable.setText(Html.fromHtml(text1));

        TextView sriLanka = (TextView) findViewById(R.id.sriLanka);
        sriLanka.setClickable(true);
        sriLanka.setMovementMethod(LinkMovementMethod.getInstance());
        String text2 = "<a href='http://www.aicte-india.org/downloads/Sri%20Lanka%20Pres.%20Scholarship.PDF#toolbar=0'>Sri Lanka Presidential Scholarships for PG Education</a>";
        sriLanka.setText(Html.fromHtml(text2));

        TextView DST = (TextView) findViewById(R.id.DST);
        DST.setClickable(true);
        DST.setMovementMethod(LinkMovementMethod.getInstance());
        String text3 = "<a href='http://bestreviewz.org/scholarshipindia/'>DST Scholarships and Awards</a>";
        DST.setText(Html.fromHtml(text3));

        TextView vidyaLaxmi = (TextView) findViewById(R.id.vidyaLaxmi);
        vidyaLaxmi.setClickable(true);
        vidyaLaxmi.setMovementMethod(LinkMovementMethod.getInstance());
        String lama = "<a href='https://www.vidyalakshmi.co.in/'>Vidya Lakshmi Portal</a>";
        vidyaLaxmi.setText(Html.fromHtml(lama));

        TextView general = (TextView) findViewById(R.id.general);
        general.setClickable(true);
        general.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(scholarshipStud.this, MainActivity.class);
                scholarshipStud.this.startActivity(intent);
            }
        });

        TextView eSARTS = (TextView) findViewById(R.id.eSARTS);
        eSARTS.setClickable(true);
        eSARTS.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(scholarshipStud.this, eSARTS.class);
                scholarshipStud.this.startActivity(intent);
            }
        });

        TextView dbt = (TextView) findViewById(R.id.dbt);
        dbt.setClickable(true);
        dbt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(scholarshipStud.this, dbtScholarship.class);
                scholarshipStud.this.startActivity(intent);
            }
        });
    }
}

