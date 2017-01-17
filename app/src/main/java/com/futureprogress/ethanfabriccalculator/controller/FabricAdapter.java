package com.futureprogress.ethanfabriccalculator.controller;


import android.content.ContentValues;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.futureprogress.ethanfabriccalculator.R;
import com.futureprogress.ethanfabriccalculator.model.ListItem;

import java.util.List;

public class FabricAdapter extends RecyclerView.Adapter<FabricAdapter.FabricHolder>{

    private List<ListItem> listData;
    private LayoutInflater inflater;

    public FabricAdapter (List<ListItem> listData, Context c){
        this.inflater = LayoutInflater.from(c);
        this.listData = listData;
    }

    @Override
    public FabricHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view  = inflater.inflate(R.layout.list_item, parent, false);
        return new FabricHolder(view);
    }

    @Override
    public void onBindViewHolder(FabricHolder holder, int position) {
        ListItem item = listData.get(position);
        holder.title.setText(item.getTitle());
        holder.icon.setImageResource(item.getImageResId());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class FabricHolder extends RecyclerView.ViewHolder{

        private TextView title;
        private ImageView icon;
        private View container;

        public FabricHolder(View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.lbl_item_text);
            icon = (ImageView) itemView.findViewById(R.id.im_item_icon);
            container = itemView.findViewById(R.id.cont_item_root);
        }
    }
}
