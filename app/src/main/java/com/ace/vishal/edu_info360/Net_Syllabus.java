package com.ace.vishal.edu_info360;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Net_Syllabus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.net_syllabus);
        TextView textView =(TextView)findViewById(R.id.texta);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        String text1 = "<a href='http://www.ugc.ac.in/net/syllabuspdf/00.pdf'>Download</a>";
        textView.setText(Html.fromHtml(text1));

        TextView textView2 =(TextView)findViewById(R.id.textb);
        textView2.setClickable(true);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        String text2 = "<a href='http://www.ugc.ac.in/net/syllabuspdf/01.pdf'>Download</a>";
        textView2.setText(Html.fromHtml(text2));

        TextView textView3 =(TextView)findViewById(R.id.textab);
        textView3.setClickable(true);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        String text3 = "<a href='http://www.ugc.ac.in/net/syllabuspdf/02.pdf'>Download</a>";
        textView3.setText(Html.fromHtml(text3));

        TextView textView3a =(TextView)findViewById(R.id.textc);
        textView3a.setClickable(true);
        textView3a.setMovementMethod(LinkMovementMethod.getInstance());
        String text3a = "<a href='http://www.ugc.ac.in/net/syllabuspdf/04.pdf'>Download</a>";
        textView3a.setText(Html.fromHtml(text3a));

        TextView textView4 =(TextView)findViewById(R.id.textd);
        textView4.setClickable(true);
        textView4.setMovementMethod(LinkMovementMethod.getInstance());
        String text4 = "<a href='http://www.ugc.ac.in/net/syllabuspdf/05.pdf'>Download</a>";
        textView4.setText(Html.fromHtml(text4));

        TextView textView5 =(TextView)findViewById(R.id.texte);
        textView5.setClickable(true);
        textView5.setMovementMethod(LinkMovementMethod.getInstance());
        String text5 = "<a href='http://www.ugc.ac.in/net/syllabuspdf/06.pdf'>Download</a>";
        textView5.setText(Html.fromHtml(text5));

        TextView textView5a =(TextView)findViewById(R.id.textf);
        textView5a.setClickable(true);
        textView5a.setMovementMethod(LinkMovementMethod.getInstance());
        String text5a = "<a href='http://www.ugc.ac.in/net/syllabuspdf/07.pdf'>Download</a>";
        textView5a.setText(Html.fromHtml(text5a));

        TextView textView6 =(TextView)findViewById(R.id.textg);
        textView6.setClickable(true);
        textView6.setMovementMethod(LinkMovementMethod.getInstance());
        String text6 = "<a href='http://www.ugc.ac.in/net/syllabuspdf/08.pdf'>Download</a>";
        textView6.setText(Html.fromHtml(text6));

        TextView textView7 =(TextView)findViewById(R.id.texth);
        textView7.setClickable(true);
        textView7.setMovementMethod(LinkMovementMethod.getInstance());
        String text7 = "<a href='http://www.ugc.ac.in/net/syllabuspdf/09.pdf'>Download</a>";
        textView7.setText(Html.fromHtml(text7));

        TextView textView8 =(TextView)findViewById(R.id.texti);
        textView8.setClickable(true);
        textView8.setMovementMethod(LinkMovementMethod.getInstance());
        String text8 = "<a href='http://www.ugc.ac.in/net/syllabuspdf/10.pdf'>Download</a>";
        textView8.setText(Html.fromHtml(text8));
    }
}
