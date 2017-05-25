package com.ace.vishal.edu_info360;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class student_signup extends Activity implements View.OnClickListener{
    public static final String REGISTER_URL = "http://sameepmago.16mb.com/signup.php";
    public static final String SFNAME = "fname";
    public static final String SLNAME = "lname";
    public static final String SEMAIL = "email";
    public static final String SPASS = "password";
    public static final String SDOB = "dob";
    public static final String Sgender = "gender";


    private EditText editfname;
    private EditText editlname;
    private EditText editemail;
    private EditText editpass;
    private String gender;
    private Button submit;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_signup_layout);

        editfname= (EditText) findViewById(R.id.sfname);
        editlname= (EditText) findViewById(R.id.slname);
        editemail= (EditText) findViewById(R.id.semail);
        editpass=(EditText)findViewById(R.id.spass);

        submit = (Button) findViewById(R.id.ssubmit);

        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ssubmit:
                tsubmit();
        }
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radioMale:
                if (checked)
                    gender="M";
                break;
            case R.id.radioFemale:
                if (checked)
                    gender="F";
                break;
        }
    }

    private void tsubmit() {
        if( editfname.getText().toString().length() == 0 )
            editfname.setError( "Enter First Name" );
        else if( editlname.getText().toString().length() == 0 )
            editlname.setError( "Enter Last Name" );
        else if( editemail.getText().toString().length() == 0 )
            editemail.setError( "Enter Email" );
        else if( editpass.getText().toString().length() == 0 )
            editpass.setError( "Enter Password" );
        else {
            //Work begins
            final String sfname = editfname.getText().toString().trim();
            final String slname=editlname.getText().toString().trim();
            final String semail = editemail.getText().toString().trim();
            final String spass = editpass.getText().toString().trim();

            StringRequest stringRequest = new StringRequest(Request.Method.POST, REGISTER_URL,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            Toast.makeText(student_signup.this, response, Toast.LENGTH_LONG).show();
                        }
                    },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(student_signup.this, error.toString(), Toast.LENGTH_LONG).show();
                        }
                    }) {
                @Override
                protected Map<String, String> getParams() {
                    Map<String, String> params = new HashMap<>();
                    params.put(SFNAME, sfname);
                    params.put(SLNAME,slname);
                    params.put(SEMAIL, semail);
                    params.put(SPASS, spass);
                    return params;
                }

            };
            RequestQueue requestQueue = Volley.newRequestQueue(this);
            requestQueue.add(stringRequest);
        }
    }
}
