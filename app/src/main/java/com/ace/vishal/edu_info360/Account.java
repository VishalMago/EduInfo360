package com.ace.vishal.edu_info360;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;

public class Account extends Activity implements View.OnClickListener,AdapterView.OnItemSelectedListener{
    private Button bsubmit;
    String item;

    private ProgressBar progressBarFooter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_layout);

        progressBarFooter = (ProgressBar)findViewById(R.id.pbFooterLoading);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.user_category, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        bsubmit=(Button)findViewById(R.id.submit3);
        bsubmit.setOnClickListener(this);
        spinner.setOnItemSelectedListener(this);
    }

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        item = parent.getItemAtPosition(pos).toString();
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onClick(View v) {
        if(v==bsubmit){
            progressBarFooter.setVisibility(View.VISIBLE);
            submit();
            progressBarFooter.setVisibility(View.GONE);
        }
    }

    private void submit() {
        String student="Student";
        String teacher="Teacher";
        String institute="Institute";
        if(item.compareTo(student)==0) {
            //Toast.makeText(getApplicationContext(),"Selected Item Student",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,student_signup.class);
            startActivity(intent);
            finish();
        }
        else if (item.compareTo(teacher)==0){
            //Toast.makeText(getApplicationContext(),"Selected Item Teacher",Toast.LENGTH_SHORT).show();
            //Intent intent = new Intent(this,teacher_signup.class);
            //startActivity(intent);
        }
        else if(item.compareTo(institute)==0){
            //Toast.makeText(getApplicationContext(),"Selected Item Institute",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, inst_signup.class);
            startActivity(intent);
            finish();
        }
        else{
            Toast.makeText(getApplicationContext(),"Select a valid category",Toast.LENGTH_SHORT).show();
        }
    }
}
