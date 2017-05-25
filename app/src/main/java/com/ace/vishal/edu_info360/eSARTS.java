package com.ace.vishal.edu_info360;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Admin on 02-Apr-17.
 */
public class eSARTS extends AppCompatActivity implements View.OnClickListener {
    private TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.e_sarts);
        txt1=(TextView)findViewById(R.id.tx1);
        txt2=(TextView)findViewById(R.id.tx2);
        txt3=(TextView)findViewById(R.id.tx3);
        txt4=(TextView)findViewById(R.id.tx4);
        txt5=(TextView)findViewById(R.id.tx5);
        txt6=(TextView)findViewById(R.id.tx6);
        txt7=(TextView)findViewById(R.id.tx7);
        txt8=(TextView)findViewById(R.id.tx8);
        txt9=(TextView)findViewById(R.id.tx9);
        txt10=(TextView)findViewById(R.id.tx10);
        txt1.setOnClickListener(this);
        txt2.setOnClickListener(this);
        txt3.setOnClickListener(this);
        txt4.setOnClickListener(this);
        txt5.setOnClickListener(this);
        txt6.setOnClickListener(this);
        txt7.setOnClickListener(this);
        txt8.setOnClickListener(this);
        txt9.setOnClickListener(this);
        txt10.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tx1:
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ugc.ac.in/ef/"));
                startActivity(browserIntent);
                break;
            case R.id.tx2:
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ugc.ac.in/dsrpdfhs/"));
                startActivity(browserIntent);
                break;
            case R.id.tx3:
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ugc.ac.in/pdfw/"));
                startActivity(browserIntent);
                break;
            case R.id.tx4:
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ugc.ac.in/pdfss/"));
                startActivity(browserIntent);
                break;
            case R.id.tx5:
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ugc.ac.in/svsgc/"));
                startActivity(browserIntent);
                break;
            case R.id.tx6:
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ugc.ac.in/rgnfsc/"));
                startActivity(browserIntent);
                break;
            case R.id.tx7:
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ugc.ac.in/rgnfst/"));
                startActivity(browserIntent);
                break;
            case R.id.tx8:
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ugc.ac.in/rgnfd/"));
                startActivity(browserIntent);
                break;
            case R.id.tx9:
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ugc.ac.in/manf/"));
                startActivity(browserIntent);
                break;
            case R.id.tx10:
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ugc.ac.in/nfobc/"));
                startActivity(browserIntent);
                break;
        }
    }
}
