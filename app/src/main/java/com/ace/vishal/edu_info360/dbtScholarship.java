package com.ace.vishal.edu_info360;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class dbtScholarship extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dbt_scholarship);
        //first link pdf
        TextView actionStud =(TextView)findViewById(R.id.actionStud);
        actionStud.setClickable(true);
        actionStud.setMovementMethod(LinkMovementMethod.getInstance());
        String text1 = "<a href='http://www.aicte-india.org/downloads/Student_Institute_Action.pdf#toolbar=0'>Download</a>";
        actionStud.setText(Html.fromHtml(text1));
        //second link pdf
        TextView reqStud=(TextView)findViewById(R.id.actionStud);
        reqStud.setClickable(true);
        reqStud.setMovementMethod(LinkMovementMethod.getInstance());
        String text2 = "<a href='http://www.aicte-india.org/downloads/Browser_Settings_for_the_Students.pdf#toolbar=0'>Download</a>";
        reqStud.setText(Html.fromHtml(text2));
        //third link pdf
        TextView instructStud=(TextView)findViewById(R.id.instructStud);
        instructStud.setClickable(true);
        instructStud.setMovementMethod(LinkMovementMethod.getInstance());
        String text3 = "<a href='http://www.aicte-india.org/downloads/Instructions%20for%20Student_7_11.pdf#toolbar=0'>Download</a>";
        instructStud.setText(Html.fromHtml(text3));
        //fourth link
        TextView step1=(TextView)findViewById(R.id.instructStud);
        step1.setClickable(true);
        step1.setMovementMethod(LinkMovementMethod.getInstance());
        String text4 = "<a href='http://www.aicte-india.org/downloads/Get_Institute_Id.pdf#toolbar=0'>Download</a>";
        step1.setText(Html.fromHtml(text4));
        //fifth link
        TextView step2=(TextView)findViewById(R.id.instructStud);
        step2.setClickable(true);
        step2.setMovementMethod(LinkMovementMethod.getInstance());
        String text5 = "<a href='http://www.aicte-india.org/prmportal_enu_si/start.swe?SWECmd=GotoView&SWEView=AICTE3+Student+Search+View'>Download</a>";
        step2.setText(Html.fromHtml(text5));
        //sixth link
        TextView notifyDBT2=(TextView)findViewById(R.id.instructStud);
        notifyDBT2.setClickable(true);
        notifyDBT2.setMovementMethod(LinkMovementMethod.getInstance());
        String text6 = "<a href='http://www.aicte-india.org/prmportal_enu_si/start.swe?SWECmd=GotoView&SWEView=AICTE3+Student+Search+View'>Download</a>";
        notifyDBT2.setText(Html.fromHtml(text6));


}


}

