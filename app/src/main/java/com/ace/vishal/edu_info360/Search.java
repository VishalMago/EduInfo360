package com.ace.vishal.edu_info360;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hp on 4/1/2017.
 */
public class Search extends AppCompatActivity{
    List<Update> GetDataAdapter1;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager recyclerViewlayoutManager;
    RecyclerView.Adapter recyclerViewadapter;
    // URL to get contacts JSON
    String GET_JSON_DATA_HTTP_URL = "https://aggarwal.pythonanywhere.com/search_name";
    String JSON_UPDATE_TITLE_NAME = "name";
    JsonArrayRequest jsonArrayRequest ;
    TextView responseinfo;
    SearchView search;
    String id[];
    RequestQueue requestQueue ;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
        search = (SearchView) findViewById(R.id.searchView);
        search.setActivated(true);
        search.setQueryHint("Type your keyword here");
        search.onActionViewExpanded();
        search.setIconified(false);
        search.clearFocus();
        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                JSON_DATA_WEB_CALL(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        GetDataAdapter1 = new ArrayList<>();
        responseinfo = (TextView) findViewById(R.id.notification);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        recyclerView.setHasFixedSize(true);

        recyclerViewlayoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(recyclerViewlayoutManager);
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(this, recyclerView, new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Intent i;
                SharedPreferences sharedPreferences = getSharedPreferences(Constants.SHARED_PREF, MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                switch (position){
                    case 0:
                        //Saving the boolean as true i.e. the device is registered
                        editor.putString("id",id[0]);
                        editor.apply();
                        Log.d("","id is :"+id[0]);
                        i=new Intent(Search.this,CollegeDetail.class);
                        startActivity(i);
                        break;
                    case 1:
                        editor.putString("id",id[1]);
                        editor.apply();
                        i=new Intent(Search.this,CollegeDetail.class);
                        startActivity(i);
                        break;
                    case 2:
                        editor.putString("id",id[2]);
                        editor.apply();
                        i=new Intent(Search.this,CollegeDetail.class);
                        startActivity(i);
                        break;
                    case 3:
                        editor.putString("id",id[3]);
                        editor.apply();
                        i=new Intent(Search.this,CollegeDetail.class);
                        startActivity(i);
                        break;
                    case 4:
                        editor.putString("id",id[4]);
                        editor.apply();
                        i=new Intent(Search.this,CollegeDetail.class);
                        startActivity(i);
                        break;
                }
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }
    public void JSON_DATA_WEB_CALL(String query) {

        final ProgressBar progressBar = (ProgressBar)findViewById(R.id.progressnotification);
        progressBar.setVisibility(View.VISIBLE);
        GET_JSON_DATA_HTTP_URL="https://aggarwal.pythonanywhere.com/search";
        GET_JSON_DATA_HTTP_URL=GET_JSON_DATA_HTTP_URL+"/"+query;
        jsonArrayRequest = new JsonArrayRequest(GET_JSON_DATA_HTTP_URL,

                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        progressBar.setVisibility(View.GONE);
                        if(response.length()==0){
                            responseinfo.setVisibility(View.VISIBLE);
                        }
                        else {
                            responseinfo.setVisibility(View.INVISIBLE);
                            JSON_PARSE_DATA_AFTER_WEBCALL(response);
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("","\n\nError:::"+error.toString());
                        Toast.makeText(Search.this,"Network Problem", Toast.LENGTH_SHORT).show();
                        progressBar.setVisibility(View.GONE);
                    }
                });



        requestQueue = Volley.newRequestQueue(this);

        requestQueue.add(jsonArrayRequest);
    }



    public void JSON_PARSE_DATA_AFTER_WEBCALL(JSONArray a){
        id=new String[a.length()];

        for(int i =0; i<a.length() ;i++) {

            Update GetDataAdapter2 = new Update();
            JSONObject json = null;
            try {
                json =a.getJSONObject(i);
                GetDataAdapter2.setName(json.getString(JSON_UPDATE_TITLE_NAME));
                id[i]=json.getString("id");
                System.out.println("ID IS :\n"+id[i]);


            } catch (JSONException e) {

                e.printStackTrace();
            }
            GetDataAdapter1.add(GetDataAdapter2);
        }

        recyclerViewadapter = new UpdateAdapter(GetDataAdapter1,this);

        recyclerView.setAdapter(recyclerViewadapter);
    }
}
