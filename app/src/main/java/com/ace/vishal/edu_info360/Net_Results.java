package com.ace.vishal.edu_info360;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Net_Results extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.net_results);


        TextView textView =(TextView)findViewById(R.id.a);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        String text1 = "<a href='http://ugcnetonline.in/Result_december2012.pdf'>•Held on 30.12.2012</a>";
        textView.setText(Html.fromHtml(text1));

        TextView textView2 =(TextView)findViewById(R.id.b);
        textView2.setClickable(true);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        String text2 = "<a href='http://ugcnetonline.in/Result_june2012.pdf'>•Held on 24.06.2012</a>";
        textView2.setText(Html.fromHtml(text2));

        TextView textView3 =(TextView)findViewById(R.id.c);
        textView3.setClickable(true);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        String text3 = "<a href='http://www.ugcnetonline.in/Result_dec2011.pdf'>•Held on 24.12.2011</a>";
        textView3.setText(Html.fromHtml(text3));

        TextView textView3a =(TextView)findViewById(R.id.d);
        textView3a.setClickable(true);
        textView3a.setMovementMethod(LinkMovementMethod.getInstance());
        String text3a = "<a href='http://www.ugcnetonline.in/RESULT11J.pdf'>•Held on 26.06.2011</a>";
        textView3a.setText(Html.fromHtml(text3a));

        TextView textView4 =(TextView)findViewById(R.id.e);
        textView4.setClickable(true);
        textView4.setMovementMethod(LinkMovementMethod.getInstance());
        String text4 = "<a href='http://www.ugcnetonline.in/RESULT10D.pdf'>•Held on 26.12.2010</a>";
        textView4.setText(Html.fromHtml(text4));

        TextView textView5 =(TextView)findViewById(R.id.f);
        textView5.setClickable(true);
        textView5.setMovementMethod(LinkMovementMethod.getInstance());
        String text5 = "<a href='http://www.ugcnetonline.in/'>•Held on 27.06.2010</a>";
        textView5.setText(Html.fromHtml(text5));
    }
}


