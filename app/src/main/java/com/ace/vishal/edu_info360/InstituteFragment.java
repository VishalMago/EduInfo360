package com.ace.vishal.edu_info360;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
/**
 * Created by Hp on 4/2/2017.
 */
public class InstituteFragment extends android.support.v4.app.Fragment implements View.OnClickListener {
    ImageButton ranking,report,scholor,survey;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.institute_fragment, null);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ranking=(ImageButton)getView().findViewById(R.id.ranking);
        report=(ImageButton)getView().findViewById(R.id.report);
        scholor=(ImageButton)getView().findViewById(R.id.scholor);
        survey=(ImageButton)getView().findViewById(R.id.survey);
        scholor.setOnClickListener(this);
        ranking.setOnClickListener(this);
        report.setOnClickListener(this);
        survey.setOnClickListener(this);
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
    }
    public void onClick(View v){
        Intent i;
        if(v==ranking){
            i=new Intent(getActivity(),Search.class);
            startActivity(i);
        }
        if(v==report){
            i=new Intent(getActivity(),aishereports.class);
            startActivity(i);
        }
        if (v==scholor){
            i=new Intent(getActivity(),dbtScholarship.class);
            startActivity(i);
        }
        if (v==survey){
            i=new Intent(getActivity(),surveyguide.class);
            startActivity(i);
        }
    }
}
