package com.ace.vishal.edu_info360;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hp on 4/2/2017.
 */
public class TeacherFragment extends android.support.v4.app.Fragment implements View.OnClickListener {
    ImageButton ranking,facdev,scholarship,ugcnet;
    String topic;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.teacher_fragment, null);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ranking=(ImageButton)getView().findViewById(R.id.collegesearch);
        facdev=(ImageButton)getView().findViewById(R.id.development);
        scholarship=(ImageButton)getView().findViewById(R.id.schol);
        ugcnet=(ImageButton)getView().findViewById(R.id.ugcnet);
        facdev.setOnClickListener(this);
        ranking.setOnClickListener(this);
        scholarship.setOnClickListener(this);
        ugcnet.setOnClickListener(this);
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
        if(v==scholarship){
            i=new Intent(getActivity(),scholarshipStud.class);
            startActivity(i);
        }
        if (v==ugcnet){
            LayoutInflater li = LayoutInflater.from(getActivity());
            View promptsView = li.inflate(R.layout.aboutcategory, null);

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                    getActivity());

            alertDialogBuilder.setView(promptsView);

            final Spinner userInput = (Spinner) promptsView
                    .findViewById(R.id.newbusnum);
            List<String> list = new ArrayList<String>();
            list.add("Select");
            list.add("About NET");
            list.add("Syllabus for NET");
            list.add("Exam Results");
            list.add("UGC NET Online");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>
                    (getActivity(), R.layout.spinner_item, list);

            dataAdapter.setDropDownViewResource
                    (android.R.layout.simple_spinner_dropdown_item);

            userInput.setAdapter(dataAdapter);

            userInput.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view,
                                           int position, long id) {
                    switch (position){
                        case 0:
                            topic="0";
                            break;
                        case 1:
                            topic="About NET";
                            break;
                        case 2:
                            topic="Syllabus For NET";
                            break;
                        case 3:
                            topic="Exam Results";
                            break;
                        case 4:
                            topic="UGC NET Online";
                            break;
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    // TODO Auto-generated method stub
                }
            });


            // set dialog message
            alertDialogBuilder
                    .setCancelable(true)
                    .setPositiveButton("Open",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    Intent i;
                                    if(topic=="0"){
                                        Toast.makeText(getActivity(), "Select a valid category", Toast.LENGTH_SHORT).show();
                                    }
                                    else if(topic.trim().equalsIgnoreCase("About NET")){
                                        i=new Intent(getActivity(),Net_about.class);
                                        startActivity(i);

                                    }else if(topic.trim().equalsIgnoreCase("Syllabus For NET")){
                                        i=new Intent(getActivity(),Net_Syllabus.class);
                                        startActivity(i);

                                    }else if(topic.trim().equalsIgnoreCase("Exam Results")){
                                        i=new Intent(getActivity(),Net_Results.class);
                                        startActivity(i);
                                    }else if(topic.trim().equalsIgnoreCase("UGC NET Online")){
                                        i=new Intent(Intent.ACTION_VIEW);
                                        i.setDataAndType(Uri.parse("http://www.ugcnetonline.in/marksDisplay.php"), "text/html");
                                        startActivity(i);
                                    }
                                }
                            })
                    .setNegativeButton("Cancel",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    dialog.cancel();
                                }
                            });

            // create alert dialog
            AlertDialog alertDialog = alertDialogBuilder.create();

            // show it
            alertDialog.show();
        }
        if (v==facdev){
            i=new Intent(getActivity(),FaceDev.class);
            startActivity(i);
        }
    }
}
