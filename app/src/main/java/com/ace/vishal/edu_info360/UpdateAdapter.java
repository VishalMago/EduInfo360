package com.ace.vishal.edu_info360;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Hp on 10/19/2016.
 */
public class UpdateAdapter extends RecyclerView.Adapter<UpdateAdapter.ViewHolder> {

    Context context;

    List<Update> getDataAdapter;
    Update a;


    public UpdateAdapter(List<Update> getDataAdapter, Context context) {

        super();
        this.getDataAdapter = getDataAdapter;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.updates_row, parent, false);

        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder Viewholder, int position) {

        Update getDataAdapter1 = getDataAdapter.get(position);


        Viewholder.ImageTitleNameView.setText(getDataAdapter1.getName());

    }

    @Override
    public int getItemCount() {

        return getDataAdapter.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public TextView ImageTitleNameView;


        public ViewHolder(View itemView) {

            super(itemView);
            ImageTitleNameView = (TextView) itemView.findViewById(R.id.textView_notification);
        }
    }
}