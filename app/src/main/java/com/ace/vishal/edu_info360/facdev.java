package com.ace.vishal.edu_info360;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class facdev extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facdev);

        TextView textViewa =(TextView)findViewById(R.id.textView10);
        textViewa.setClickable(true);
        textViewa.setMovementMethod(LinkMovementMethod.getInstance());
        String texta = "<a href='http://www.ugc.ac.in/oldpdf/faculty_pdf/schedule_dates2011_2012.pdf'>Schedule of Orientation Programmes and Refresher Courses for Teachers to be Conducted by UGC-Academic Staff Colleges (UGC-ASCs) during 2011-2012. </a>";
        textViewa.setText(Html.fromHtml(texta));

        TextView textViewb =(TextView)findViewById(R.id.textView11);
        textViewb.setClickable(true);
        textViewb.setMovementMethod(LinkMovementMethod.getInstance());
        String textb = "<a href='http://www.ugc.ac.in/oldpdf/faculty_pdf/refesher_course.pdf'>Refresher Course </a>";
        textViewb.setText(Html.fromHtml(textb));

        TextView textViewc =(TextView)findViewById(R.id.textView12);
        textViewc.setClickable(true);
        textViewc.setMovementMethod(LinkMovementMethod.getInstance());
        String textc = "<a href='http://www.ugc.ac.in/oldpdf/faculty_pdf/final_schdeule_0910.pdf'>UGC Supported Orientation Programmes and Refresher Courses for Teachers to be Conducted By UGC-Academic Staff Colleges (UGC-ASCs) & UGC-Refresher Course Centres (UGC-RCCs) During 2009-2010. </a>";
        textViewc.setText(Html.fromHtml(textc));

        TextView textViewd =(TextView)findViewById(R.id.textView13);
        textViewd.setClickable(true);
        textViewd.setMovementMethod(LinkMovementMethod.getInstance());
        String textd = "<a href='http://www.ugc.ac.in/oldpdf/faculty_pdf/asc_allotment09.pdf'>Statement showing the orientation progarmmes,Principals Workshops and Referesher Courses recommended by the Expert Committee for Academic Staff Colleges for the Year 2009-2010.</a>";
        textViewd.setText(Html.fromHtml(textd));


    }
}
