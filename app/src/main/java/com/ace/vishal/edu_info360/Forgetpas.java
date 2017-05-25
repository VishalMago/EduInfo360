package com.ace.vishal.edu_info360;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class Forgetpas extends Activity implements View.OnClickListener{
    public static final String REGISTER_URL = "http://sameepmago.16mb.com/forgotpass.php";
    public static final String EMAIL = "email";
    private EditText editTextEmail;
    private Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgetpas_layout);

        editTextEmail= (EditText) findViewById(R.id.email);
        buttonRegister = (Button) findViewById(R.id.submit);
        buttonRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==buttonRegister) {
            forgetpass();
        }
    }

    private void forgetpass() {
        final String email = editTextEmail.getText().toString().trim();
        if (email.isEmpty()) {
            Toast.makeText(Forgetpas.this, "Please fill the registered mail id", Toast.LENGTH_LONG).show();
        } else {
            final ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage("Changing Password...");
            progressDialog.show();
            StringRequest stringRequest = new StringRequest(Request.Method.POST, REGISTER_URL,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            progressDialog.dismiss();
                            Toast.makeText(Forgetpas.this, response, Toast.LENGTH_LONG).show();
                        }
                    },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(Forgetpas.this,"Network Error", Toast.LENGTH_LONG).show();
                        }
                    }) {
                @Override
                protected Map<String, String> getParams() {
                    Map<String, String> params = new HashMap<String, String>();
                    params.put(EMAIL, email);
                    return params;
                }

            };
            RequestQueue requestQueue = Volley.newRequestQueue(this);
            requestQueue.add(stringRequest);
        }
    }
}
