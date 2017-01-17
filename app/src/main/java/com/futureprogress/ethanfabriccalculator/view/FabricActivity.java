package com.futureprogress.ethanfabriccalculator.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.futureprogress.ethanfabriccalculator.R;
import com.futureprogress.ethanfabriccalculator.controller.FabricAdapter;
import com.futureprogress.ethanfabriccalculator.model.FabricData;

public class FabricActivity extends AppCompatActivity {

    private RecyclerView recView;
    private FabricAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fabric);

        recView = (RecyclerView)findViewById(R.id.rec_list);
        recView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new FabricAdapter(FabricData.getListData(),this);
        recView.setAdapter(adapter);

    }

    public static class ListItem {
        private String title;
        private int imageResId;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getImageResId() {
            return imageResId;
        }

        public void setImageResId(int imageResId) {
            this.imageResId = imageResId;
        }
    }
}
