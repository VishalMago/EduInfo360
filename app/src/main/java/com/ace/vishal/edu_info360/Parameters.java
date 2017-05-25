package com.ace.vishal.edu_info360;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Parameters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parameters);

        TextView a =(TextView)findViewById(R.id.a);
        a.setClickable(true);
        a.setMovementMethod(LinkMovementMethod.getInstance());
        String ta = "<a href='http://www.ugc.ac.in/oldpdf/faculty_pdf/asc_allotment09.pdf'>Statement showing the orientation progarmmes,Principals Workshops and Referesher Courses recommended by the Expert Committee for Academic Staff Colleges for the Year 2009-2010.</a>";
        a.setText(Html.fromHtml(ta));

        TextView b =(TextView)findViewById(R.id.b);
        b.setClickable(true);
        b.setMovementMethod(LinkMovementMethod.getInstance());
        String tb = "<a href='http://www.ugc.ac.in/oldpdf/faculty_pdf/asc_allotment09.pdf'>Statement showing the orientation progarmmes,Principals Workshops and Referesher Courses recommended by the Expert Committee for Academic Staff Colleges for the Year 2009-2010.</a>";
        b.setText(Html.fromHtml(tb));

        TextView c =(TextView)findViewById(R.id.c);
        c.setClickable(true);
        c.setMovementMethod(LinkMovementMethod.getInstance());
        String tc = "<a href='http://www.ugc.ac.in/oldpdf/faculty_pdf/asc_allotment09.pdf'>Statement showing the orientation progarmmes,Principals Workshops and Referesher Courses recommended by the Expert Committee for Academic Staff Colleges for the Year 2009-2010.</a>";
        c.setText(Html.fromHtml(tc));

        TextView d =(TextView)findViewById(R.id.d);
        d.setClickable(true);
        d.setMovementMethod(LinkMovementMethod.getInstance());
        String td = "<a href='http://www.ugc.ac.in/oldpdf/faculty_pdf/asc_allotment09.pdf'>Statement showing the orientation progarmmes,Principals Workshops and Referesher Courses recommended by the Expert Committee for Academic Staff Colleges for the Year 2009-2010.</a>";
        d.setText(Html.fromHtml(td));


    }
}
