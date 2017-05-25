package com.ace.vishal.edu_info360;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
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
 * Created by Hp on 4/2/2017.
 */
public class CollegeDetail extends AppCompatActivity {
    List<College> GetDataAdapter1;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager recyclerViewlayoutManager;
    RecyclerView.Adapter recyclerViewadapter;
    String id;
    // URL to get contacts JSON

    String GET_JSON_DATA_HTTP_URL = "https://aggarwal.pythonanywhere.com/seek";
    RequestQueue requestQueue ;
    JsonArrayRequest jsonArrayRequest ;
    protected void onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.college_detail);
        GetDataAdapter1 = new ArrayList<>();
        recyclerView = (RecyclerView)findViewById(R.id.my_recycler_view);

        recyclerView.setHasFixedSize(true);

        recyclerViewlayoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(recyclerViewlayoutManager);
        SharedPreferences sharedPreferences = getSharedPreferences(Constants.SHARED_PREF, MODE_PRIVATE);
        id=sharedPreferences.getString("id","");
        JSON_DATA_WEB_CALL();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
    }
    public void JSON_DATA_WEB_CALL() {
        final ProgressBar progressBar = (ProgressBar)findViewById(R.id.progressnotification);
        progressBar.setVisibility(View.VISIBLE);
        GET_JSON_DATA_HTTP_URL="https://aggarwal.pythonanywhere.com/seek";
        GET_JSON_DATA_HTTP_URL=GET_JSON_DATA_HTTP_URL+"/"+id;
        jsonArrayRequest = new JsonArrayRequest(GET_JSON_DATA_HTTP_URL,

                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        Log.d("",response.toString());
                        progressBar.setVisibility(View.GONE);
                        JSON_PARSE_DATA_AFTER_WEBCALL(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("","\n\nError:::"+error.toString());
                        Toast.makeText(CollegeDetail.this,error.toString(), Toast.LENGTH_SHORT).show();
                        progressBar.setVisibility(View.GONE);
                    }
                });



        requestQueue = Volley.newRequestQueue(this);

        requestQueue.add(jsonArrayRequest);
    }



    public void JSON_PARSE_DATA_AFTER_WEBCALL(JSONArray a){
        for(int i = 0; i<a.length();i++) {

            College GetDataAdapter2 = new College();
            JSONObject json = null;
            try {
                json =a.getJSONObject(i);
                GetDataAdapter2.setName("Name:\t"+json.getString("name"));
                GetDataAdapter2.setState("State:\t"+json.getString("state"));
                GetDataAdapter2.setDistrict("District:\t"+json.getString("district"));
                GetDataAdapter2.setAddress("Adddress:\t"+json.getString("address"));
                GetDataAdapter2.setWebsite("Website:\t"+json.getString("website"));
                GetDataAdapter2.setType("Institute Type:\t"+json.getString("inst_type"));
                GetDataAdapter2.setUtype("University Type:\t"+json.getString("universitytype"));
                GetDataAdapter2.setUname("University Name:\t"+json.getString("universityname"));
                GetDataAdapter2.setManagement("Management\t"+json.getString("management"));
                GetDataAdapter2.setYoe("Year of Establishment:\t"+json.getString("yearofestd"));
                GetDataAdapter2.setSpecial("Speciality:\t"+json.getString("special"));
                GetDataAdapter2.setAicteid("AICTE ID:\t"+json.getString("aicte_id"));
                GetDataAdapter2.setWomen("Only for Women:\t"+json.getString("women"));
                GetDataAdapter2.setMinority("Minority\t"+json.getString("minority"));
                GetDataAdapter2.setStatus2f("Status 2f:\t"+json.getString("status2f"));
                GetDataAdapter2.setStatus12b("Status 12B:\t"+json.getString("status12b"));
                GetDataAdapter2.setNoa("Nature of affiliation\t"+json.getString("natureofaffiliation"));
                GetDataAdapter2.setTeaching("Teaching:\t"+json.getString("teaching"));
                GetDataAdapter2.setGng("Govt or Non-Govt\t"+json.getString("govtornongovt"));
                GetDataAdapter2.setAou("Aided or Unaided\t"+json.getString("aidedorunaided"));
                GetDataAdapter2.setAccreditation("Accrediation\t"+json.getString("accrediation"));
                GetDataAdapter2.setEcdate("EC Date:\t"+json.getString("ecdate"));
                GetDataAdapter2.setCycles("Accrediation Cycle:\t"+json.getString("cycles"));
                GetDataAdapter2.setOvrank("Overall Rank:\t"+json.getString("overall_rank"));
                GetDataAdapter2.setOvscore("Overall Score:\t"+json.getString("overall_score"));
                GetDataAdapter2.setTlrrank("TLR Rank:\t"+json.getString("tlr_rank"));
                GetDataAdapter2.setPrrank("PR Rank:\t"+json.getString("pr_rank"));
                GetDataAdapter2.setOirank("OI Rank:\t"+json.getString("oi_rank"));
                GetDataAdapter2.setRpcrank("RPC Rank:\t"+json.getString("rpc_rank"));
                GetDataAdapter2.setGorank("GO Rank:\t"+json.getString("go_rank"));
                //System.out.println("URL IS :\n"+URL[i]);


            } catch (JSONException e) {

                e.printStackTrace();
            }
            GetDataAdapter1.add(GetDataAdapter2);
        }

        recyclerViewadapter = new CollegeAdapter(GetDataAdapter1,CollegeDetail.this);

        recyclerView.setAdapter(recyclerViewadapter);
    }
}
