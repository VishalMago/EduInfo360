package com.ace.vishal.edu_info360;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by Admin on 02-Apr-17.
 */
public class vocEdu1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.voc_edu1);

        TextView link1= (TextView) findViewById(R.id.link1);
        link1.setClickable(true);
        link1.setMovementMethod(LinkMovementMethod.getInstance());
        String text1 = "<a href='http://www.dget.nic.in/'>www.dget.nic.in</a>";
        link1.setText(Html.fromHtml(text1));

        TextView link2= (TextView) findViewById(R.id.link2);
        link2.setClickable(true);
        link2.setMovementMethod(LinkMovementMethod.getInstance());
        String text2 = "<a href='http://www.aicte-india.org/prmportal_enu/start.swe?SWECmd=Logoff&SWETS=1491100329481'>Registration for conduct of Vocational Educational Programs by AICTE Approved Institutions</a>";
        link2.setText(Html.fromHtml(text2));

        TextView link3= (TextView) findViewById(R.id.link3);
        link3.setClickable(true);
        link3.setMovementMethod(LinkMovementMethod.getInstance());
        String text3 = "<a href='http://www.aicte-india.org/prmportal_enu_si/start.swe?SWECmd=Login&SWECM=S&SWEHo=www.aicte-india.org'>Registration for conduct of Vocational Educational Programs by New Institutions</a>";
        link3.setText(Html.fromHtml(text1));

    }
}
