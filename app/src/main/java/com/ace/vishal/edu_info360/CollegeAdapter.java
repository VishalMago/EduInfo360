package com.ace.vishal.edu_info360;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Hp on 10/18/2016.
 */
public class CollegeAdapter extends RecyclerView.Adapter<CollegeAdapter.ViewHolder> {

    Context context;

    List<College> getDataAdapter;
    College a;


    public CollegeAdapter(List<College> getDataAdapter, Context context) {

        super();
        this.getDataAdapter = getDataAdapter;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.detail_row, parent, false);

        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder Viewholder, int position) {

        College getDataAdapter1 = getDataAdapter.get(position);


        Viewholder.name.setText(getDataAdapter1.getName());
        Viewholder.state.setText(getDataAdapter1.getState());
        Viewholder.district.setText(getDataAdapter1.getDistrict());
        Viewholder.address.setText(getDataAdapter1.getAddress());
        Viewholder.type.setText(getDataAdapter1.getType());
        Viewholder.utype.setText(getDataAdapter1.getUtype());
        Viewholder.uname.setText(getDataAdapter1.getUname());
        Viewholder.management.setText(getDataAdapter1.getManagement());
        Viewholder.yoe.setText(getDataAdapter1.getYoe());
        Viewholder.special.setText(getDataAdapter1.getSpecial());
        Viewholder.aicteid.setText(getDataAdapter1.getAicteid());
        Viewholder.women.setText(getDataAdapter1.getWomen());
        Viewholder.minority.setText(getDataAdapter1.getMinority());
        Viewholder.status2f.setText(getDataAdapter1.getStatus2f());
        Viewholder.status12b.setText(getDataAdapter1.getStatus12b());
        Viewholder.noa.setText(getDataAdapter1.getNoa());
        Viewholder.teaching.setText(getDataAdapter1.getTeaching());
        Viewholder.gng.setText(getDataAdapter1.getGng());
        Viewholder.aou.setText(getDataAdapter1.getAou());
        Viewholder.accreditation.setText(getDataAdapter1.getAccreditation());
        Viewholder.ecdate.setText(getDataAdapter1.getEcdate());
        Viewholder.cycles.setText(getDataAdapter1.getCycles());
        Viewholder.website.setText(getDataAdapter1.getWebsite());
        Viewholder.ovrank.setText(getDataAdapter1.getOvrank());
        Viewholder.ovscore.setText(getDataAdapter1.getOvscore());
        Viewholder.tlrrank.setText(getDataAdapter1.getTlrrank());
        Viewholder.prrank.setText(getDataAdapter1.getPrrank());
        Viewholder.oirank.setText(getDataAdapter1.getOirank());
        Viewholder.rpcrank.setText(getDataAdapter1.getRpcrank());
        Viewholder.gorank.setText(getDataAdapter1.getGorank());



    }

    @Override
    public int getItemCount() {

        return getDataAdapter.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public TextView name,state,district,address,website,type,utype,uname,management,yoe,special,aicteid,women,minority,status2f,status12b,noa,teaching,gng,aou,accreditation,ecdate,cycles,ovrank,ovscore,tlrrank, prrank, oirank, rpcrank, gorank;



        public ViewHolder(View itemView) {

            super(itemView);
            name = (TextView) itemView.findViewById(R.id.textViewName);
            state=(TextView) itemView.findViewById(R.id.textViewState);
            district=(TextView) itemView.findViewById(R.id.textViewDistrict);
            address=(TextView) itemView.findViewById(R.id.textViewAddress);
            type=(TextView) itemView.findViewById(R.id.textViewType);
            utype=(TextView) itemView.findViewById(R.id.textViewUType);
            uname=(TextView) itemView.findViewById(R.id.textViewUName);
            management=(TextView) itemView.findViewById(R.id.textViewManage);
            yoe=(TextView) itemView.findViewById(R.id.textViewYear);
            special=(TextView) itemView.findViewById(R.id.textViewSpeciality);
            aicteid=(TextView) itemView.findViewById(R.id.textViewaicteid);
            women=(TextView) itemView.findViewById(R.id.textViewWomen);
            minority=(TextView) itemView.findViewById(R.id.textViewMinority);
            status2f=(TextView) itemView.findViewById(R.id.status2f);
            status12b=(TextView) itemView.findViewById(R.id.status12b);
            noa=(TextView) itemView.findViewById(R.id.affilation);
            teaching=(TextView) itemView.findViewById(R.id.teaching);
            gng=(TextView) itemView.findViewById(R.id.gn);
            aou=(TextView) itemView.findViewById(R.id.au);
            accreditation=(TextView) itemView.findViewById(R.id.as);
            ecdate=(TextView) itemView.findViewById(R.id.iec);
            cycles=(TextView) itemView.findViewById(R.id.cycles);
            website=(TextView)itemView.findViewById(R.id.textViewWebsite);
            ovrank =(TextView)itemView.findViewById(R.id.overallrank);
            ovscore=(TextView)itemView.findViewById(R.id.overallscore);
            tlrrank=(TextView)itemView.findViewById(R.id.tlrrank);
            prrank=(TextView)itemView.findViewById(R.id.prrank);
            oirank=(TextView)itemView.findViewById(R.id.oirank);
            rpcrank=(TextView)itemView.findViewById(R.id.rpcrank);
            gorank=(TextView)itemView.findViewById(R.id.gorank);
        }
    }
}