package com.ace.vishal.edu_info360;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class Login extends Activity implements View.OnClickListener{
    public static final String REGISTER_URL = "http://sameepmago.16mb.com/login.php";
    private EditText editTextEmail;
    private EditText editpassword;
    private String category;
    private Button blogin;
    private TextView fPassword;
    private  TextView createacc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        if(isRegistered()){
            Intent i=new Intent(Login.this,HomeActivity.class);
            startActivity(i);
            finish();
        }
        blogin=(Button)findViewById(R.id.login);
        editTextEmail= (EditText) findViewById(R.id.email);
        editpassword=(EditText)findViewById(R.id.pass);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        List<String> list = new ArrayList<String>();
        list.add("Select Category");
        list.add("Student");
        list.add("Teacher");
        list.add("Institute");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>
                (this, R.layout.spinner_item, list);

        dataAdapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(dataAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (position){
                    case 0:
                        category="0";
                        break;
                    case 1:
                        category="Student";
                        break;
                    case 2:
                        category="Teacher";
                        break;
                    case 3:
                        category="Institute";
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });

        fPassword=(TextView)findViewById(R.id.fpassword);
        createacc=(TextView)findViewById(R.id.createacc);
        // Set click listeners
        blogin.setOnClickListener(this);
        fPassword.setOnClickListener(this);
        createacc.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login:
                Pattern pattern = Patterns.EMAIL_ADDRESS;
                if (!isRegistered()) {
                    if(editTextEmail.getText().toString().isEmpty()||editpassword.getText().toString().isEmpty()||category=="0") {
                        Toast.makeText(Login.this, "Fill all the fields", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        if(pattern.matcher(editTextEmail.getText().toString()).matches()){
                            signup();
                        }
                        else {
                            Toast.makeText(Login.this,"Invalid Email",Toast.LENGTH_SHORT).show();
                        }
                    }
                    //registering the device
                } else {
                    //if the device is already registered
                    //displaying a toast
                    Toast.makeText(Login.this, "Already registered...", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.fpassword:
                fpass();
                break;
            case R.id.createacc:
                createaccount();
            default:
                return;
        }
    }

    private void createaccount() {
        Intent intent = new Intent(this,Account.class);
        startActivity(intent);
    }
    private boolean isRegistered() {
        //Getting shared preferences
        SharedPreferences sharedPreferences = getSharedPreferences(Constants.SHARED_PREF, MODE_PRIVATE);

        //Getting the value from shared preferences
        //The second parameter is the default value
        //if there is no value in sharedpreference then it will return false
        //that means the device is not registered
        return sharedPreferences.getBoolean(Constants.REGISTERED, false);
    }


    private void signup() {
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Authenticating...");
        progressDialog.show();
        final String email = editTextEmail.getText().toString().trim();
        final String pass = editpassword.getText().toString().trim();
            StringRequest stringRequest = new StringRequest(Request.Method.POST, REGISTER_URL,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            progressDialog.dismiss();
                            Log.d("","RESPONSE::::"+response);
                            if(response.trim().equalsIgnoreCase("success")) {
                                Toast.makeText(Login.this,"Log in successful", Toast.LENGTH_LONG).show();
                                //Opening shared preference
                                SharedPreferences sharedPreferences = getSharedPreferences(Constants.SHARED_PREF, MODE_PRIVATE);

                                //Opening the shared preferences editor to save values
                                SharedPreferences.Editor editor = sharedPreferences.edit();

                                //Saving the boolean as true i.e. the device is registered
                                editor.putBoolean(Constants.REGISTERED, true);
                                editor.putString("Email", email);
                                editor.putString("Category",category);
                                editor.apply();
                                Intent i=new Intent(Login.this,HomeActivity.class);
                                i.putExtra("IS_FROM_LOGIN", true);
                                startActivity(i);
                                finish();
                            }
                            else{
                                Toast.makeText(Login.this,"Email and password do not match", Toast.LENGTH_LONG).show();
                            }
                        }
                    },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(Login.this,"Network Problem", Toast.LENGTH_LONG).show();
                        }
                    }) {
                    @Override
                     protected Map<String, String> getParams() throws AuthFailureError {
                         HashMap<String, String> params = new HashMap<>();
                        //adding parameters to post request as we need to send firebase id and email
                        params.put("email", email);
                        params.put("password",pass);
                        params.put("category",category);
                        return params;
                     }
            };
            RequestQueue requestQueue = Volley.newRequestQueue(this);
            requestQueue.add(stringRequest);
    }

    private void fpass() {
        Intent intent = new Intent(this, Forgetpas.class);
        startActivity(intent);
    }

}