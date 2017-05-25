package com.ace.vishal.edu_info360;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class RTI extends AppCompatActivity implements View.OnClickListener {

    TextView rti1;
    TextView rti2;
    TextView rti3;
    TextView rti4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rti_layout);
        rti1 = (TextView) findViewById(R.id.rti1);
        rti1.setOnClickListener(this);
        rti2 = (TextView) findViewById(R.id.rti2);
        rti2.setOnClickListener(this);
        rti3 = (TextView) findViewById(R.id.rti3);
        rti3.setOnClickListener(this);
        rti4 = (TextView) findViewById(R.id.rti4);
        rti4.setOnClickListener(this);
    }

    public void onClick(View v) {
        TextView textView2 = (TextView) findViewById(R.id.rti2);
        textView2.setClickable(true);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        String text2 = "<a href='http://www.aicte-india.org/downloads/rti.pdf#toolbar=0&zoom=85'>•Information under Section - 4 of RTI Act, 2005</a>";
        textView2.setText(Html.fromHtml(text2));
        SharedPreferences sharedPreferences = getSharedPreferences(Constants.SHARED_PREF, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Intent i;
        if(v==rti1) {
            editor.putString("URLRTI","https://rtionline.gov.in/RTIMIS/login/index.php");
            editor.apply();
            i=new Intent(RTI.this,RTIWebView.class);
            startActivity(i);
        }else if(v==rti3) {
            editor.putString("URLRTI","http://rti.gov.in/");
            editor.apply();
            i=new Intent(RTI.this,RTIWebView.class);
            startActivity(i);
        }else if(v==rti4) {
            editor.putString("URLRTI","https://rtionline.gov.in/webservice/DateSelectWebservice.php");
            editor.apply();
            i=new Intent(RTI.this,RTIWebView.class);
            startActivity(i);
        }
    }
}
