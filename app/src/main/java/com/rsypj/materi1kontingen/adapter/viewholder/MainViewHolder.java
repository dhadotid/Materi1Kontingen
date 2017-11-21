package com.rsypj.materi1kontingen.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.rsypj.materi1kontingen.R;
import com.rsypj.materi1kontingen.model.ApaModel;

/**
 * Created by dhadotid on 21/11/2017.
 */

public class MainViewHolder extends RecyclerView.ViewHolder {

    TextView tv1;
    TextView tv2;
    RelativeLayout rl;

    public MainViewHolder(final View itemView) {
        super(itemView);

        tv1 = (TextView) itemView.findViewById(R.id.custom_main_tvText1);
        tv2 = (TextView)itemView.findViewById(R.id.custom_main_tvText2);
        rl = (RelativeLayout)itemView.findViewById(R.id.custom_main_rl);

        rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(itemView.getContext(), tv1.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void setUpToUI(ApaModel data){
        tv1.setText(data.getJudul());
        tv2.setText(data.getIsi());
    }


}
