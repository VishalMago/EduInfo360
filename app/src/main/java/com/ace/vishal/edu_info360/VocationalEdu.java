package com.ace.vishal.edu_info360;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class VocationalEdu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vocational_edu);

        TextView notify = (TextView) findViewById(R.id.notify);
        notify.setClickable(true);
        notify.setMovementMethod(LinkMovementMethod.getInstance());
        String text1 = "<a href='http://www.aicte-india.org/downloads/NVEQF_Order.PDF'>NVEQF Notification MHRD GOI</a>";
        notify.setText(Html.fromHtml(text1));

        TextView approvalProcess = (TextView) findViewById(R.id.approvalProcess);
        approvalProcess.setClickable(true);
        approvalProcess.setMovementMethod(LinkMovementMethod.getInstance());
        String text2 = "<a href='http://www.aicte-india.org/downloads/APH_NVEQF_241212_final.pdf'>Approval Process Handbook 2013-2014 for Vocational Education and Community Colleges</a>";
        approvalProcess.setText(Html.fromHtml(text2));

        TextView list1 = (TextView) findViewById(R.id.list1);
        list1.setClickable(true);
        list1.setMovementMethod(LinkMovementMethod.getInstance());
        String text3 = "<a href='http://www.aicte-india.org/downloads/Recommended_NVEQF.pdf'>NVEQF list of AICTE approved Institutes</a>";
        list1.setText(Html.fromHtml(text3));

        TextView list2 = (TextView) findViewById(R.id.list2);
        list2.setClickable(true);
        list2.setMovementMethod(LinkMovementMethod.getInstance());
        String text4 = "<a href='http://www.aicte-india.org/downloads/Recommended_NTIs.pdf'>NVEQF list of Other approved Institutes</a>";
        list2.setText(Html.fromHtml(text4));

        TextView list3 = (TextView) findViewById(R.id.list3);
        list3.setClickable(true);
        list3.setMovementMethod(LinkMovementMethod.getInstance());
        String text5 = "<a href='http://www.aicte-india.org/downloads/List%20of%20Approved%20SKPs%20under%20NSQF.pdf'>NVEQF list of approved Skill Knowledge Providers (SKP)</a>";
        list3.setText(Html.fromHtml(text5));

        TextView NEEM1 = (TextView) findViewById(R.id.NEEM1);
        NEEM1.setClickable(true);
        NEEM1.setMovementMethod(LinkMovementMethod.getInstance());
        String text6 = "<a href='http://www.aicte-india.org/prmportal_enu_si/start.swe?SWECmd=GotoView&_sn=RKVxy4kL9S3UrajG7DmajLhG2isEIvNq-BggI5pjG-g92pmoaZmaJAHlD8rRjGlT&SWEView=AICTE3+NEEM+New+UserId+Request+View&SWEHo=www.aicte-india.org&SWETS=1491097934'>Registration for NEEM agents</a>";
        NEEM1.setText(Html.fromHtml(text6));

        TextView NEEM2 = (TextView) findViewById(R.id.NEEM2);
        NEEM2.setClickable(true);
        NEEM2.setMovementMethod(LinkMovementMethod.getInstance());
        String text7 = "<a href='http://www.aicte-india.org/downloads/Help%20Manual%20for%20NEEM%20Agent.pdf#toolbar = 0'>Help file for NEEM Registration</a>";
        NEEM2.setText(Html.fromHtml(text7));

        TextView NEEM3 = (TextView) findViewById(R.id.NEEM3);
        NEEM3.setClickable(true);
        NEEM3.setMovementMethod(LinkMovementMethod.getInstance());
        String text8 = "<a href='http://www.aicte-india.org/downloads/NEEM%20AGENTS%20APPROVED%20BY%20AICTE.pdf#toolbar = 0'>NEEM Agents Approved by AICTE</a>";
        NEEM3.setText(Html.fromHtml(text8));
        TextView voc = (TextView) findViewById(R.id.vocImpLink);
        voc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(VocationalEdu.this, vocEdu1.class);
                startActivity(intent);
            }
        });


        TextView voca = (TextView) findViewById(R.id.curriculum1);
        voca.setClickable(true);
        voca.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(VocationalEdu.this, vocEdu2.class);
                startActivity(i);
            }
        });
    }
}