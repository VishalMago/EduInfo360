package com.ace.vishal.edu_info360;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class inst_signup extends Activity implements View.OnClickListener {

    public static final String REGISTER_URL = "http://sameepmago.16mb.com/InstituteSignUp.php";
    public static final String INSTNAME = "institutename";
    public static final String INSTID = "instituteid";
    public static final String INSTEMAIL = "email";
    public static final String INSTPASS = "password";

    private Button submit;
    private EditText editname;
    private EditText editid;
    private EditText editemail;
    private EditText editpass;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inst_signup_layout);

        editname=(EditText)findViewById(R.id.instname);
        editid=(EditText)findViewById(R.id.instid);
        editemail=(EditText)findViewById(R.id.instemail);
        editpass=(EditText)findViewById(R.id.instpass);

        submit=(Button)findViewById(R.id.instsubmit);
        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.instsubmit:
                inst_submit();
        }
    }

    private void inst_submit() {
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Creating Account...");
        progressDialog.show();

        //check for required fields
        if (editname.getText().toString().length() == 0)
            editname.setError("Enter Name");
        else if (editemail.getText().toString().length() == 0)
            editemail.setError("Enter Email");
        else if (editid.getText().toString().length() == 0)
            editid.setError("Enter ID");
        else if (editpass.getText().toString().length() == 0)
            editpass.setError("Enter Password");
        else {
            Pattern pattern = Patterns.EMAIL_ADDRESS;
            if (pattern.matcher(editemail.getText().toString()).matches()) {
                //Work begins
                final String instname = editname.getText().toString().trim();
                final String instid = editid.getText().toString().trim();
                final String instemail = editemail.getText().toString().trim();
                final String instpass = editpass.getText().toString().trim();

                StringRequest stringRequest = new StringRequest(Request.Method.POST, REGISTER_URL,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                progressDialog.dismiss();
                                Toast.makeText(inst_signup.this, response, Toast.LENGTH_LONG).show();
                                Intent i=new Intent(inst_signup.this,Login.class);
                                startActivity(i);
                                finish();
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(inst_signup.this,"Network Problem", Toast.LENGTH_LONG).show();
                            }
                        }) {
                    @Override
                    protected Map<String, String> getParams() {
                        Map<String, String> params = new HashMap<>();
                        params.put(INSTNAME, instname);
                        params.put(INSTID, instid);
                        params.put(INSTEMAIL, instemail);
                        params.put(INSTPASS, instpass);
                        return params;
                    }

                };
                RequestQueue requestQueue = Volley.newRequestQueue(this);
                requestQueue.add(stringRequest);
            } else {
                Toast.makeText(inst_signup.this, "Invalid Email", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
