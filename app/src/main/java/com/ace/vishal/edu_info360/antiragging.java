package com.ace.vishal.edu_info360;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by hp on 4/2/2017.
 */
public class antiragging extends AppCompatActivity implements View.OnClickListener {

    Button b1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.antiragging_layout);
        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(this);
    }

    public void onClick(View v) {
        Button button = (Button) findViewById(R.id.b1);
        button.setClickable(true);
        button.setMovementMethod(LinkMovementMethod.getInstance());
        String button1 = "<a href='http://www.aicte-india.org/downloads/Undertaking.pdf#toolbar=0'>Anti Ragging Undertaking</a>";
        button.setText(Html.fromHtml(button1));
    }
}
