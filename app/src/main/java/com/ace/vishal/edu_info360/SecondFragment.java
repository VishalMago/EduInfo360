package com.ace.vishal.edu_info360;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SwitchCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hp on 3/11/2017.
 */
public class SecondFragment extends android.support.v4.app.Fragment{
    List<Update> GetDataAdapter1;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager recyclerViewlayoutManager;
    String URL[];
    RecyclerView.Adapter recyclerViewadapter;
    // URL to get contacts JSON
    String GET_JSON_DATA_HTTP_URL = "https://aggrawal.pythonanywhere.com/institute_updates";
    String JSON_UPDATE_TITLE_NAME = "update";
    JsonArrayRequest jsonArrayRequest ;
    TextView notification;

    RequestQueue requestQueue ;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.updates, null);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        GetDataAdapter1 = new ArrayList<>();
        notification=(TextView)getView().findViewById(R.id.notification);
        recyclerView = (RecyclerView) getView().findViewById(R.id.recyclerview2);

        recyclerView.setHasFixedSize(true);

        recyclerViewlayoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(recyclerViewlayoutManager);
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getActivity(), recyclerView, new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                //Opening shared preference
                SharedPreferences sharedPreferences = getActivity().getSharedPreferences(Constants.SHARED_PREF, Context.MODE_PRIVATE);

                //Opening the shared preferences editor to save values
                SharedPreferences.Editor editor = sharedPreferences.edit();
                Intent i;
                i=new Intent(getActivity(),UpdateDetail.class);
                startActivity(i);
                int length=URL.length;
                switch (position){
                    case 0:
                        if (length>0) {
                            editor.putString("UpdateUrl", URL[length - 1]);
                        }
                        break;
                    case 1:
                        if(length>=0) {
                            editor.putString("UpdateUrl", URL[length - 2]);
                        }
                        break;
                    case 2:
                        if (length>0) {
                            editor.putString("UpdateUrl", URL[length - 3]);
                        }
                        break;
                    case 3:
                        if (length>0) {
                            editor.putString("UpdateUrl", URL[length -4]);
                        }
                        break;
                    case 4:
                        if (length>0) {
                            editor.putString("UpdateUrl", URL[length - 5]);
                        }
                        break;
                    case 5:
                        if (length>0) {
                            editor.putString("UpdateUrl", URL[length - 6]);
                        }
                        break;
                    case 6:
                        if (length>0) {
                            editor.putString("UpdateUrl", URL[length - 7]);
                        }
                        break;
                    case 7:
                        if (length>0) {
                            editor.putString("UpdateUrl", URL[length - 8]);
                        }
                        break;



                }
                editor.apply();

            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(Constants.SHARED_PREF, Context.MODE_PRIVATE);
        String category=sharedPreferences.getString("Category","");
        if(category.trim().equalsIgnoreCase("Student")){
            GET_JSON_DATA_HTTP_URL=" https://aggrawal.pythonanywhere.com/student_updates";
        }
        else{
            GET_JSON_DATA_HTTP_URL="https://aggrawal.pythonanywhere.com/institute_updates";
        }

        JSON_DATA_WEB_CALL();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
    }
    public void JSON_DATA_WEB_CALL() {
        final ProgressBar progressBar = (ProgressBar) getView().findViewById(R.id.progressnotification);
        progressBar.setVisibility(View.VISIBLE);
        jsonArrayRequest = new JsonArrayRequest(GET_JSON_DATA_HTTP_URL,

                        new Response.Listener<JSONArray>() {
                            @Override
                            public void onResponse(JSONArray response) {
                                progressBar.setVisibility(View.GONE);
                                if(response.equals("0 results")){
                                    notification.setVisibility(View.VISIBLE);
                                }
                                else {
                                    JSON_PARSE_DATA_AFTER_WEBCALL(response);
                                }
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getActivity(),"Network Problem", Toast.LENGTH_SHORT).show();
                                progressBar.setVisibility(View.GONE);
                            }
                        });



        requestQueue = Volley.newRequestQueue(getActivity());

        requestQueue.add(jsonArrayRequest);
    }



    public void JSON_PARSE_DATA_AFTER_WEBCALL(JSONArray a){

        URL=new String[a.length()];
        for(int i = a.length()-1; i>=0 ;i--) {

            Update GetDataAdapter2 = new Update();
            JSONObject json = null;
            try {
                json =a.getJSONObject(i);
                URL[i]=json.getString("url");
                GetDataAdapter2.setName(json.getString(JSON_UPDATE_TITLE_NAME));
                //System.out.println("URL IS :\n"+URL[i]);


            } catch (JSONException e) {

                e.printStackTrace();
            }
            GetDataAdapter1.add(GetDataAdapter2);
        }

        recyclerViewadapter = new UpdateAdapter(GetDataAdapter1,getActivity());

        recyclerView.setAdapter(recyclerViewadapter);
    }
}


